/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dimas.bridging.retrieve;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.config.spring.hibernate.model.CvOutlet;
import org.dimas.bridging.app.controller.BridgingController;

/**
 *
 * @author yhawin
 */
public class ParseCvOutlet {
    BridgingController controller;
    
    public ParseCvOutlet(BridgingController controller){
        this.controller = controller;
    }
    
    public List<CvOutlet> parseCvOutlet(String strFilePath, String principal){
         System.out.println("Parsing CvOutlet >> Starting");
         
         Reader readerFile = null;
         List<CvOutlet> lst = new ArrayList<>();
         
        try {
            File filePath = new File(strFilePath);
            readerFile = new FileReader(filePath);
            BufferedReader bufReadFile = new BufferedReader(readerFile);
            String readByte;
            int pencacah =0;
            
            while ((readByte = bufReadFile.readLine()) !=null) {
                //System.out.print(pencacah++ + "-->> " );
                
                //readByte = readByte.replaceAll("\"", "");
                //String [] data = readByte.split("\\,");  
                String data = readByte;
                //System.out.println(data);
                                     
                //Karena jumlah record benar adalah 5 (8 toleransi)
               if (data.trim().length()==11) {
                    CvOutlet item = new CvOutlet();
                    item.setOutlet(data.substring(0, 6).trim());
                    item.setSalesman(data.substring(6, 9).trim());
                    item.setKunjungan(data.substring(9, 10).trim());
                    item.setHari(data.substring(10, 11).trim());
                    
                    if (item !=null) 
                            lst.add(item);
                    
                    //System.out.println(item.getOutlet() + " : " + item.getSalesman() + " : " + item.getKunjungan());               
               }         

                    //if (pencacah>2) break;
                    //System.out.println();
                
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ParseCvOutlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ParseCvOutlet.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                readerFile.close();
            } catch (IOException ex) {
                Logger.getLogger(ParseCvOutlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return lst;
        
    }
    
    public static void main(String [] args) throws FileNotFoundException, IOException {
    }
    
}

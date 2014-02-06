/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dimas.bridging.app.view;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author yhawin
 */
public class JPanelGenerateExtractKek extends javax.swing.JPanel {

    /**
     * Creates new form JPanelGenerateExtractPokari
     */
    public JPanelGenerateExtractKek() {
        initComponents();
    }
    public void resetTeks(){
        getTextPathOutput().setText("");
        getjDateChooserExtract().setDate(new java.util.Date());
    }
    
    public JButton getBtnExtractAll() {
        return btnExtractAll;
    }

    public JButton getBtnExtractMSalesman() {
        return btnExtractMSalesman;
    }

    public JButton getBtnExtractMSlsOut() {
        return btnExtractMSlsOut;
    }

    public JButton getBtnExtractTAdjStk() {
        return btnExtractTAdjStk;
    }

    public JButton getBtnExtractTDatdpr() {
        return btnExtractTDatdpr;
    }

    public JButton getBtnExtractTDatdsl() {
        return btnExtractTDatdsl;
    }

    public JButton getBtnExtractTDatdsr() {
        return btnExtractTDatdsr;
    }

    public JButton getBtnExtractTDatsri() {
        return btnExtractTDatsri;
    }

    public JButton getBtnExtractTStok() {
        return btnExtractTStok;
    }

    public JButton getBtnKirimByEmail() {
        return btnKirimByEmail;
    }

    public JButton getBtnPathOutput() {
        return btnPathOutput;
    }

    public JDateChooser getjDateChooserExtract() {
        return jDateChooserExtract;
    }

    public JPanel getjPanelSubGenerateExtractKek() {
        return jPanelSubGenerateExtractKek;
    }

    public JTextField getTextPathOutput() {
        return textPathOutput;
    }

    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSubGenerateExtractKek = new javax.swing.JPanel();
        textPathOutput = new javax.swing.JTextField();
        btnPathOutput = new javax.swing.JButton();
        btnExtractMSlsOut = new javax.swing.JButton();
        btnExtractTAdjStk = new javax.swing.JButton();
        btnExtractTDatdpr = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnExtractAll = new javax.swing.JButton();
        jDateChooserExtract = new com.toedter.calendar.JDateChooser("dd/MM/yyyy", "##/##/####",'_');
        btnKirimByEmail = new javax.swing.JButton();
        btnExtractTDatdsl = new javax.swing.JButton();
        btnExtractTDatdsr = new javax.swing.JButton();
        btnExtractTDatsri = new javax.swing.JButton();
        btnExtractTStok = new javax.swing.JButton();
        btnExtractMSalesman = new javax.swing.JButton();

        jPanelSubGenerateExtractKek.setBorder(null);

        textPathOutput.setText("jTextField10");

        btnPathOutput.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_download_16x16.png"))); // NOI18N

        btnExtractMSlsOut.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnExtractMSlsOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_download2_16x16.png"))); // NOI18N
        btnExtractMSlsOut.setText("Mslout");

        btnExtractTAdjStk.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnExtractTAdjStk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_download2_16x16.png"))); // NOI18N
        btnExtractTAdjStk.setText("TAdjstk");

        btnExtractTDatdpr.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnExtractTDatdpr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_download2_16x16.png"))); // NOI18N
        btnExtractTDatdpr.setText("TDatdpr");

        jLabel10.setText("Path");

        btnExtractAll.setText("Extract All");

        jDateChooserExtract.setDateFormatString("dd/MM/yyyy");

        btnKirimByEmail.setText("Kirim By Email");
        btnKirimByEmail.setEnabled(false);

        btnExtractTDatdsl.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnExtractTDatdsl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_download2_16x16.png"))); // NOI18N
        btnExtractTDatdsl.setText("TDatdsl");

        btnExtractTDatdsr.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnExtractTDatdsr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_download2_16x16.png"))); // NOI18N
        btnExtractTDatdsr.setText("TDatdsr");

        btnExtractTDatsri.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnExtractTDatsri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_download2_16x16.png"))); // NOI18N
        btnExtractTDatsri.setText("TDatsri");

        btnExtractTStok.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnExtractTStok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_download2_16x16.png"))); // NOI18N
        btnExtractTStok.setText("TStok");

        btnExtractMSalesman.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnExtractMSalesman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_download2_16x16.png"))); // NOI18N
        btnExtractMSalesman.setText("Msalesman");

        javax.swing.GroupLayout jPanelSubGenerateExtractKekLayout = new javax.swing.GroupLayout(jPanelSubGenerateExtractKek);
        jPanelSubGenerateExtractKek.setLayout(jPanelSubGenerateExtractKekLayout);
        jPanelSubGenerateExtractKekLayout.setHorizontalGroup(
            jPanelSubGenerateExtractKekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubGenerateExtractKekLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSubGenerateExtractKekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSubGenerateExtractKekLayout.createSequentialGroup()
                        .addGap(0, 185, Short.MAX_VALUE)
                        .addComponent(btnExtractMSalesman)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExtractMSlsOut, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelSubGenerateExtractKekLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textPathOutput)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPathOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSubGenerateExtractKekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSubGenerateExtractKekLayout.createSequentialGroup()
                        .addComponent(btnExtractTAdjStk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExtractTDatdpr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanelSubGenerateExtractKekLayout.createSequentialGroup()
                        .addComponent(jDateChooserExtract, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addGroup(jPanelSubGenerateExtractKekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSubGenerateExtractKekLayout.createSequentialGroup()
                        .addComponent(btnExtractTDatdsl, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExtractTDatdsr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExtractTDatsri, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExtractTStok, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSubGenerateExtractKekLayout.createSequentialGroup()
                        .addComponent(btnExtractAll, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKirimByEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelSubGenerateExtractKekLayout.setVerticalGroup(
            jPanelSubGenerateExtractKekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubGenerateExtractKekLayout.createSequentialGroup()
                .addGroup(jPanelSubGenerateExtractKekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPathOutput)
                    .addGroup(jPanelSubGenerateExtractKekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelSubGenerateExtractKekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExtractAll)
                            .addComponent(btnKirimByEmail))
                        .addComponent(jDateChooserExtract, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelSubGenerateExtractKekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textPathOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSubGenerateExtractKekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExtractMSlsOut)
                    .addComponent(btnExtractTAdjStk)
                    .addComponent(btnExtractTDatdpr)
                    .addComponent(btnExtractTDatdsl)
                    .addComponent(btnExtractTDatdsr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExtractTDatsri)
                    .addComponent(btnExtractTStok)
                    .addComponent(btnExtractMSalesman)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelSubGenerateExtractKek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelSubGenerateExtractKek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExtractAll;
    private javax.swing.JButton btnExtractMSalesman;
    private javax.swing.JButton btnExtractMSlsOut;
    private javax.swing.JButton btnExtractTAdjStk;
    private javax.swing.JButton btnExtractTDatdpr;
    private javax.swing.JButton btnExtractTDatdsl;
    private javax.swing.JButton btnExtractTDatdsr;
    private javax.swing.JButton btnExtractTDatsri;
    private javax.swing.JButton btnExtractTStok;
    private javax.swing.JButton btnKirimByEmail;
    private javax.swing.JButton btnPathOutput;
    private com.toedter.calendar.JDateChooser jDateChooserExtract;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanelSubGenerateExtractKek;
    private javax.swing.JTextField textPathOutput;
    // End of variables declaration//GEN-END:variables
}
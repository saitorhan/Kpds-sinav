/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sinav;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Sait
 */

public class sinavlar2 extends javax.swing.JFrame {
int dogru=0, yanlis=0;
float basari_yuzde = 100;
boolean ilk_kontrol = true;
    /**
     * Creates new form sinavlar2
     */
    public sinavlar2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        yanit = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSoru = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtA = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtB = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtC = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtD = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtE = new javax.swing.JTextArea();
        jBtnA = new javax.swing.JRadioButton();
        jBtnB = new javax.swing.JRadioButton();
        jBtnC = new javax.swing.JRadioButton();
        jBtnD = new javax.swing.JRadioButton();
        jBtnE = new javax.swing.JRadioButton();
        btnSonraki = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDogru = new javax.swing.JTextField();
        txtYanlis = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBasari = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        txtSoru.setColumns(20);
        txtSoru.setEditable(false);
        txtSoru.setRows(5);
        txtSoru.setText("Teste başlamak için Başla butonunu tıklayınız. Test sırasında soruları boş geçemezsiniz.\nSoruya cevap verdikten sonra Kontrol Et tuşu ile cevabınızı sınamanız gerekmektedir\n aksi halde o soru için değerlendirmeye tabi tutulmayacaksınız.");
        jScrollPane1.setViewportView(txtSoru);

        txtA.setColumns(20);
        txtA.setEditable(false);
        txtA.setRows(5);
        jScrollPane2.setViewportView(txtA);

        txtB.setColumns(20);
        txtB.setEditable(false);
        txtB.setRows(5);
        jScrollPane3.setViewportView(txtB);

        txtC.setColumns(20);
        txtC.setEditable(false);
        txtC.setRows(5);
        jScrollPane4.setViewportView(txtC);

        txtD.setColumns(20);
        txtD.setEditable(false);
        txtD.setRows(5);
        jScrollPane5.setViewportView(txtD);

        txtE.setColumns(20);
        txtE.setEditable(false);
        txtE.setRows(5);
        jScrollPane6.setViewportView(txtE);

        jBtnA.setText("A");

        jBtnB.setText("B");

        jBtnC.setText("C");

        jBtnD.setText("D");

        jBtnE.setText("E");

        btnSonraki.setText("Başla");
        btnSonraki.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSonrakiMouseClicked(evt);
            }
        });
        btnSonraki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSonrakiActionPerformed(evt);
            }
        });

        jButton1.setText("Kontrol Et");
        jButton1.setEnabled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel1.setText("Doğru Cevap: ");

        jLabel2.setText("Yanlış Cevap: ");

        txtDogru.setEditable(false);

        txtYanlis.setEditable(false);

        jLabel3.setText("Başarı Yüzdesi: ");

        txtBasari.setEditable(false);

        jButton2.setText("Testi Bitir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jBtnA)
                                            .addComponent(jBtnD, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jBtnC)
                                                .addComponent(jBtnB))
                                            .addComponent(jBtnE, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(66, 66, 66)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btnSonraki)
                                                    .addComponent(jButton1)
                                                    .addComponent(jButton2))
                                                .addGap(7, 7, 7))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel3)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txtBasari, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel2)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(txtYanlis, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel1)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(txtDogru, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE)))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jBtnA)
                                    .addComponent(jLabel1)
                                    .addComponent(txtDogru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jBtnB)
                                    .addComponent(jLabel2)
                                    .addComponent(txtYanlis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtBasari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnC))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBtnD)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnE)
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSonraki)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    ResultSet rs;
    int i = 1;
    String cevap;
    void SorulariYazdir()
    {
        btnSonraki.setText("Sonraki Soru");
        if(i>sayi){
            JOptionPane.showMessageDialog(null, "Son soruyu da çözdünüz!!!\nDoğru Cevap Sayınız: "+Integer.toString(dogru)
                    +"\nYanlış Cevap Sayınız: "+Integer.toString(yanlis)+
                    "\nBaşarı Yüzdeniz: "+Float.toString(basari_yuzde));
            this.show(false);
        }
        try {
            i++;
            Class.forName("com.mysql.jdbc.Driver");
            //int sayi;
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sinavlar", "root", "2569");
            Statement st=con.createStatement();
            rs=st.executeQuery("SELECT * FROM ornek ORDER BY rand() LIMIT 1");
            while (rs.next()) {
                  txtSoru.setText("");
                  txtSoru.setWrapStyleWord(true);
                  txtSoru.setLineWrap(true);
                  txtA.setText("");
                  txtA.setWrapStyleWord(true);
                  txtA.setLineWrap(true);
                  txtB.setText("");
                  txtB.setWrapStyleWord(true);
                  txtB.setLineWrap(true);
                  txtC.setText("");
                  txtC.setWrapStyleWord(true);
                  txtC.setLineWrap(true);
                  txtD.setText("");
                  txtD.setWrapStyleWord(true);
                  txtD.setLineWrap(true);
                  txtE.setText("");
                  txtE.setWrapStyleWord(true);
                  txtE.setLineWrap(true);
                txtSoru.setText(rs.getString(2));
                txtA.setText(rs.getString(3));
                txtB.setText(rs.getString(4));
                txtC.setText(rs.getString(5));
                txtD.setText(rs.getString(6));
                txtE.setText(rs.getString(7));
                cevap = rs.getString(8);
            }
                 
            
        } catch (ClassNotFoundException | SQLException ex) {
        }
    }
    
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        yanit.add(jBtnA);
        yanit.add(jBtnB);
        yanit.add(jBtnC);
        yanit.add(jBtnD);
        yanit.add(jBtnE);
        //SorulariYazdir();
    }//GEN-LAST:event_formWindowActivated

    void KontrolEt()
    {
                String verilen_cevap="z";
        if(jBtnA.isSelected()==true)
            verilen_cevap = jBtnA.getText();
        else if(jBtnB.isSelected()==true)
            verilen_cevap = jBtnB.getText();
        else if(jBtnC.isSelected()==true)
            verilen_cevap=jBtnC.getText();
        else if(jBtnD.isSelected()==true)
            verilen_cevap=jBtnD.getText();
        else if(jBtnE.isSelected()==true)
            verilen_cevap=jBtnE.getText();
        if(verilen_cevap.equals(cevap)==false)
        {
            JOptionPane.showMessageDialog(null, "Yanlış Cevap!!!\nDoğru Cevap: "+cevap);
            if(ilk_kontrol==true)
            {
               yanlis++;
               ilk_kontrol = false;
               txtYanlis.setText(Integer.toString(yanlis));
               basari_yuzde = ((float)dogru/(dogru+yanlis))*(float)100;
               txtBasari.setText(Float.toString(basari_yuzde));
               txtDogru.setText(Integer.toString(dogru));
            }
        }
            
        else {
            JOptionPane.showMessageDialog(null, "Doğru Cevap!!!");
            if(ilk_kontrol==true)
            {
                txtYanlis.setText(Integer.toString(yanlis));
               dogru++;
               ilk_kontrol = false;
               txtDogru.setText(Integer.toString(dogru));
               basari_yuzde = ((float)dogru/(dogru+yanlis))*(float)100;
               txtBasari.setText(Float.toString(basari_yuzde));
            } }   
    }
    boolean ilksoru=true;
    private void btnSonrakiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSonrakiMouseClicked
        if(ilk_kontrol==false || ilksoru == true){
        ilksoru=false;
        jButton1.setEnabled(true);
        ilk_kontrol=true;
        SorulariYazdir();}
        else
           JOptionPane.showMessageDialog(null, "Soru işaretlenip kontrol edilmeden sonraki soruya geçilemez..."); 
    }//GEN-LAST:event_btnSonrakiMouseClicked

    private void btnSonrakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSonrakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSonrakiActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        KontrolEt();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(null, "Testi sonlandırdınız!!!\nDoğru Cevap Sayınız: "+Integer.toString(dogru)
                    +"\nYanlış Cevap Sayınız: "+Integer.toString(yanlis)+
                    "\nBaşarı Yüzdeniz: "+Float.toString(basari_yuzde));
            this.show(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public int sayi;
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(sinavlar2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sinavlar2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sinavlar2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sinavlar2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new sinavlar2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSonraki;
    private javax.swing.JRadioButton jBtnA;
    private javax.swing.JRadioButton jBtnB;
    private javax.swing.JRadioButton jBtnC;
    private javax.swing.JRadioButton jBtnD;
    private javax.swing.JRadioButton jBtnE;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea txtA;
    private javax.swing.JTextArea txtB;
    private javax.swing.JTextField txtBasari;
    private javax.swing.JTextArea txtC;
    private javax.swing.JTextArea txtD;
    private javax.swing.JTextField txtDogru;
    private javax.swing.JTextArea txtE;
    private javax.swing.JTextArea txtSoru;
    private javax.swing.JTextField txtYanlis;
    private javax.swing.ButtonGroup yanit;
    // End of variables declaration//GEN-END:variables
}

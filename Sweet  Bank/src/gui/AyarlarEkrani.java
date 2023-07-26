
package gui;

import database.IBilgiController;
import database.transactions.HesapBilgileri;
import database.transactions.TelNoYenileme;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;


public class AyarlarEkrani extends javax.swing.JFrame implements IDuzenleyici, IBilgiController{
    
    private TelNoYenileme telNoYenilemeObject = null;
    
    //telefon numarası değişeceği için eskitelno isimli değişkende tutlması lazım
    private String eskiTelNo = null;
    
    public AyarlarEkrani() {
        initComponents();
        getEdits();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ayarlarEkraniPanel = new javax.swing.JPanel();
        geriIcon2 = new javax.swing.JLabel();
        kullaniciAdiSoyadiLabel = new javax.swing.JLabel();
        mesajTelNoLabel = new javax.swing.JLabel();
        telNoText = new javax.swing.JTextField();
        telNoDegistirIcon = new javax.swing.JLabel();
        mesajSifreLabel = new javax.swing.JLabel();
        sifreText = new javax.swing.JTextField();
        sifreDegistirIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ayarlarEkraniPanel.setBackground(new java.awt.Color(255, 255, 204));

        geriIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previousIcon.png"))); // NOI18N
        geriIcon2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriIcon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriIcon2MouseClicked(evt);
            }
        });

        kullaniciAdiSoyadiLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kullaniciAdiSoyadiLabel.setForeground(new java.awt.Color(255, 0, 51));
        kullaniciAdiSoyadiLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kullaniciAdiSoyadiLabel.setText("Sayın [KULLANICI ADI SOYADI]");

        mesajTelNoLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mesajTelNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mesajTelNoLabel.setText("Telefon Numaranız :");

        telNoText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        telNoText.setEnabled(false);

        telNoDegistirIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/updateTellIcon.png"))); // NOI18N
        telNoDegistirIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        telNoDegistirIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telNoDegistirIconMouseClicked(evt);
            }
        });

        mesajSifreLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mesajSifreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mesajSifreLabel.setText("Şifreniz");

        sifreText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sifreText.setText("****************");
        sifreText.setEnabled(false);

        sifreDegistirIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/updateTellIcon.png"))); // NOI18N
        sifreDegistirIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sifreDegistirIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sifreDegistirIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ayarlarEkraniPanelLayout = new javax.swing.GroupLayout(ayarlarEkraniPanel);
        ayarlarEkraniPanel.setLayout(ayarlarEkraniPanelLayout);
        ayarlarEkraniPanelLayout.setHorizontalGroup(
            ayarlarEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ayarlarEkraniPanelLayout.createSequentialGroup()
                .addGroup(ayarlarEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ayarlarEkraniPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(geriIcon2))
                    .addGroup(ayarlarEkraniPanelLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(ayarlarEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kullaniciAdiSoyadiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ayarlarEkraniPanelLayout.createSequentialGroup()
                                .addComponent(mesajTelNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(telNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(telNoDegistirIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ayarlarEkraniPanelLayout.createSequentialGroup()
                                .addComponent(mesajSifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sifreDegistirIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        ayarlarEkraniPanelLayout.setVerticalGroup(
            ayarlarEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ayarlarEkraniPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(geriIcon2)
                .addGap(8, 8, 8)
                .addComponent(kullaniciAdiSoyadiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(ayarlarEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesajTelNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telNoDegistirIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(ayarlarEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesajSifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifreDegistirIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ayarlarEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ayarlarEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        ayarlarEkraniPanel.setVisible(true);
        TextAyarlari.setOnlyNumber(telNoText);
        TextAyarlari.setMaxLimit(telNoText, 11);
        this.telNoText.setText(getHesapBilgileri().getTelNo());
        //var olan tel. no'yu eski tel no içine alıyoruz.
        this.eskiTelNo = telNoText.getText();
        this.kullaniciAdiSoyadiLabel.setText("Sayın " + getHesapBilgileri().getAdSoyad());
        
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return !(telNoText.getText().equals(""));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public TelNoYenileme getTelNoYenilemeObject() {
        if (telNoYenilemeObject == null) {
            telNoYenilemeObject = new TelNoYenileme();
        }
        return telNoYenilemeObject;
    }
    
    
    
    private void geriIcon2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriIcon2MouseClicked
        ActionAyarlari.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_geriIcon2MouseClicked

    private int clickCounter = 0;
    
    private void telNoDegistirIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telNoDegistirIconMouseClicked
        if (this.clickCounter == 0) {  //daha önce tıklanmadyısa
            
             telNoText.setEnabled(true);
             clickCounter++;
        }else{                       //daha önce tıklandıysa
            
            telNoText.setEnabled(false);
            this.telNoYenile();
            clickCounter = 0;
        }       
      
    }//GEN-LAST:event_telNoDegistirIconMouseClicked

    private void telNoYenile(){
        if (this.bilgilerGecerliMi()) {
            String yeniTelNo = this.telNoText.getText().trim();
            getTelNoYenilemeObject().setTelNo(yeniTelNo);
            if (getTelNoYenilemeObject().telNoYenilendiMi()) {
                Dialogs.ozelMesajGoster(this, "Telefon numarası " + yeniTelNo + " olarak güncellenmiştir.");
            } else {
                Dialogs.ozelMesajGoster(this, "Başarısız.Bilgileri kontrol edin!");
                this.telNoText.setText(this.eskiTelNo);
            }
        } else {
            Dialogs.bosOlamazMesajiGoster(this);
            //başarısız işlemden sonra telnotext'e eski telno tekrar yazdırılır
            this.telNoText.setText(this.eskiTelNo);
        }
    }
    
    private void sifreDegistirIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifreDegistirIconMouseClicked
        ActionAyarlari.setVisible(this, new SifreYenilemeEkrani());
    }//GEN-LAST:event_sifreDegistirIconMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AyarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AyarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AyarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AyarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AyarlarEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ayarlarEkraniPanel;
    private javax.swing.JLabel geriIcon2;
    private javax.swing.JLabel kullaniciAdiSoyadiLabel;
    private javax.swing.JLabel mesajSifreLabel;
    private javax.swing.JLabel mesajTelNoLabel;
    private javax.swing.JLabel sifreDegistirIcon;
    private javax.swing.JTextField sifreText;
    private javax.swing.JLabel telNoDegistirIcon;
    private javax.swing.JTextField telNoText;
    // End of variables declaration//GEN-END:variables
}

package gui;

import database.IBilgiController;
import database.transactions.HesapBilgileri;
import database.transactions.ParaYatirma;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;
import javax.swing.JOptionPane;

public class ParaYatirmaEkrani extends javax.swing.JFrame implements IDuzenleyici, IBilgiController {

    private ParaYatirma paraYatirmaObject = null;

    private int yatirilacakMiktar = 0;

    public ParaYatirmaEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        paraYatirmaEkraniPanel.setFocusable(true);
        TextAyarlari.setOnlyNumber(yatiralacakMiktarText);
        TextAyarlari.setMaxLimit(yatiralacakMiktarText, 5);
        this.kullaniciAdiSoyadiLabel.setText(" Sayın " + getHesapBilgileri().getAdSoyad());
        this.bakiyeLabel.setText(String.valueOf(getHesapBilgileri().getBakiye()));
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.yatiralacakMiktarText.getText().equals(""));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public ParaYatirma getParaYatirmaObject() {
        if (paraYatirmaObject == null) {
            paraYatirmaObject = new ParaYatirma();
        }
        return paraYatirmaObject;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paraYatirmaEkraniPanel = new javax.swing.JPanel();
        kullaniciAdiSoyadiLabel = new javax.swing.JLabel();
        limitUyariLabel = new javax.swing.JLabel();
        toplamBakiyenizLabel = new javax.swing.JLabel();
        bakiyeLabel = new javax.swing.JLabel();
        yatiracağinizMiktarLabel = new javax.swing.JLabel();
        yatiralacakMiktarText = new javax.swing.JTextField();
        paraYatirButton = new javax.swing.JButton();
        geriIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sweet Bank Para Yatırma Ekranı");

        paraYatirmaEkraniPanel.setBackground(new java.awt.Color(204, 204, 255));

        kullaniciAdiSoyadiLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kullaniciAdiSoyadiLabel.setForeground(new java.awt.Color(255, 0, 51));
        kullaniciAdiSoyadiLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kullaniciAdiSoyadiLabel.setText("Sayın [KULLANICI ADI SOYADI]");

        limitUyariLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        limitUyariLabel.setText("Tek seferde 40.000 TL ve altını yatırabilirsiniz.");

        toplamBakiyenizLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        toplamBakiyenizLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        toplamBakiyenizLabel.setText("Toplam Bakiyeniz    :");

        bakiyeLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bakiyeLabel.setText("[BAKİYE]");

        yatiracağinizMiktarLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        yatiracağinizMiktarLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        yatiracağinizMiktarLabel.setText("Yatıracağınız Miktar :");

        yatiralacakMiktarText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        yatiralacakMiktarText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yatiralacakMiktarTextActionPerformed(evt);
            }
        });
        yatiralacakMiktarText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                yatiralacakMiktarTextKeyReleased(evt);
            }
        });

        paraYatirButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        paraYatirButton.setText("Para Yatır");
        paraYatirButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paraYatirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paraYatirButtonActionPerformed(evt);
            }
        });

        geriIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previousIcon.png"))); // NOI18N
        geriIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout paraYatirmaEkraniPanelLayout = new javax.swing.GroupLayout(paraYatirmaEkraniPanel);
        paraYatirmaEkraniPanel.setLayout(paraYatirmaEkraniPanelLayout);
        paraYatirmaEkraniPanelLayout.setHorizontalGroup(
            paraYatirmaEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paraYatirmaEkraniPanelLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(paraYatirmaEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paraYatirmaEkraniPanelLayout.createSequentialGroup()
                        .addComponent(paraYatirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paraYatirmaEkraniPanelLayout.createSequentialGroup()
                        .addGroup(paraYatirmaEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kullaniciAdiSoyadiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(paraYatirmaEkraniPanelLayout.createSequentialGroup()
                                .addComponent(toplamBakiyenizLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(paraYatirmaEkraniPanelLayout.createSequentialGroup()
                                .addComponent(yatiracağinizMiktarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(yatiralacakMiktarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35))))
            .addGroup(paraYatirmaEkraniPanelLayout.createSequentialGroup()
                .addGroup(paraYatirmaEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paraYatirmaEkraniPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(geriIcon))
                    .addGroup(paraYatirmaEkraniPanelLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(limitUyariLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        paraYatirmaEkraniPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {yatiracağinizMiktarLabel, yatiralacakMiktarText});

        paraYatirmaEkraniPanelLayout.setVerticalGroup(
            paraYatirmaEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paraYatirmaEkraniPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(geriIcon)
                .addGap(15, 15, 15)
                .addComponent(kullaniciAdiSoyadiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(limitUyariLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(paraYatirmaEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toplamBakiyenizLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paraYatirmaEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yatiracağinizMiktarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yatiralacakMiktarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(paraYatirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        paraYatirmaEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {yatiracağinizMiktarLabel, yatiralacakMiktarText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paraYatirmaEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paraYatirmaEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yatiralacakMiktarTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yatiralacakMiktarTextActionPerformed

    }//GEN-LAST:event_yatiralacakMiktarTextActionPerformed

    private void yatiralacakMiktarTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yatiralacakMiktarTextKeyReleased
        //kullanıcı bastığı tuşu serbest bıraktığı zaman gerçekleşecek kodlar bu kısma yazılır
        this.yatirilacakMiktar = TextAyarlari.checkTheTextKeyReleased(yatiralacakMiktarText, 40000);

    }//GEN-LAST:event_yatiralacakMiktarTextKeyReleased

    private void paraYatirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paraYatirButtonActionPerformed
        if (this.bilgilerGecerliMi()) {
            this.paraYatir();
        } else {
            Dialogs.bosOlamazMesajiGoster(this);
        }
    }//GEN-LAST:event_paraYatirButtonActionPerformed

    private void paraYatir() {
        //parayatir nesnesinden yatırılacak miktarı aldık.
        this.getParaYatirmaObject().setYatirilacakMiktar(this.yatirilacakMiktar);

        //eğer para yatırma işlemi başarılıysa
        if (getParaYatirmaObject().paraYatirildiMi()) {
            Dialogs.ozelMesajGoster(this, "Para başarıyla hesabınıza tanımlanmıştır.\n"
                    + "Yatırılan miktar: " + this.yatirilacakMiktar + " TL");
            ActionAyarlari.setVisible(this, new HesapEkrani());
        } else {
            Dialogs.ozelMesajGoster(this, "Bilgilerinizi kontrol edin!");
        }
    }

    private void geriIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriIconMouseClicked
        ActionAyarlari.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_geriIconMouseClicked

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
            java.util.logging.Logger.getLogger(ParaYatirmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParaYatirmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParaYatirmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParaYatirmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParaYatirmaEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bakiyeLabel;
    private javax.swing.JLabel geriIcon;
    private javax.swing.JLabel kullaniciAdiSoyadiLabel;
    private javax.swing.JLabel limitUyariLabel;
    private javax.swing.JButton paraYatirButton;
    private javax.swing.JPanel paraYatirmaEkraniPanel;
    private javax.swing.JLabel toplamBakiyenizLabel;
    private javax.swing.JLabel yatiracağinizMiktarLabel;
    private javax.swing.JTextField yatiralacakMiktarText;
    // End of variables declaration//GEN-END:variables
}

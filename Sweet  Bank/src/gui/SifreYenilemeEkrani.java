package gui;

import database.IBilgiController;
import database.transactions.HesapBilgileri;
import database.transactions.SifreYenileme;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;
import java.awt.Color;
import javax.swing.JPasswordField;

public class SifreYenilemeEkrani extends javax.swing.JFrame implements IDuzenleyici, IBilgiController {

    //sifreYenileme.java sınıfında aldığımız bilgileri gönderebilmek için nesne tanımlayacağız
    private SifreYenileme sifreYenilemeObject = null;
    
    public SifreYenilemeEkrani() {
        initComponents();
        getEdits();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sifreYenilemePanel = new javax.swing.JPanel();
        geriIcon = new javax.swing.JLabel();
        sifreYenilemeLabel = new javax.swing.JLabel();
        tcNoLabel = new javax.swing.JLabel();
        tcNoText = new javax.swing.JTextField();
        telefonNoLabel = new javax.swing.JLabel();
        telefonNoText = new javax.swing.JTextField();
        guvenlikCevapLabel = new javax.swing.JLabel();
        guvenlikCevapText = new javax.swing.JTextField();
        eskiSifreLabel = new javax.swing.JLabel();
        yeniSifreLabel = new javax.swing.JLabel();
        sifreTekrarLabel = new javax.swing.JLabel();
        sifreTekrarText = new javax.swing.JPasswordField();
        eskiSifreText = new javax.swing.JPasswordField();
        yeniSifreText = new javax.swing.JPasswordField();
        sifreyiYenileButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sifreYenilemePanel.setBackground(new java.awt.Color(102, 255, 204));

        geriIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previousIcon.png"))); // NOI18N
        geriIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriIconMouseClicked(evt);
            }
        });

        sifreYenilemeLabel.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        sifreYenilemeLabel.setForeground(new java.awt.Color(255, 0, 51));
        sifreYenilemeLabel.setText("Şifre Yenileme");

        tcNoLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tcNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tcNoLabel.setText("T.C. No :");

        tcNoText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        telefonNoLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        telefonNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        telefonNoLabel.setText("Telefon No :");

        telefonNoText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        guvenlikCevapLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        guvenlikCevapLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        guvenlikCevapLabel.setText("Güvenlik Sorusu Cevabı :");

        guvenlikCevapText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        eskiSifreLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        eskiSifreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        eskiSifreLabel.setText("Eski Şifre :");

        yeniSifreLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        yeniSifreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        yeniSifreLabel.setText("Yeni Şifre :");

        sifreTekrarLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sifreTekrarLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sifreTekrarLabel.setText("Yeni Şifre Tekrar :");

        sifreTekrarText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        eskiSifreText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        yeniSifreText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        sifreyiYenileButton.setBackground(new java.awt.Color(255, 255, 153));
        sifreyiYenileButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sifreyiYenileButton.setText("Şifreyi Yenile");
        sifreyiYenileButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sifreyiYenileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sifreyiYenileButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sifreyiYenileButtonMouseExited(evt);
            }
        });
        sifreyiYenileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifreyiYenileButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sifreYenilemePanelLayout = new javax.swing.GroupLayout(sifreYenilemePanel);
        sifreYenilemePanel.setLayout(sifreYenilemePanelLayout);
        sifreYenilemePanelLayout.setHorizontalGroup(
            sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                        .addComponent(tcNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tcNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                        .addComponent(telefonNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(telefonNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                        .addComponent(guvenlikCevapLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(guvenlikCevapText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                        .addComponent(yeniSifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(yeniSifreText))
                    .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                        .addComponent(eskiSifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eskiSifreText))
                    .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                        .addComponent(sifreTekrarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sifreTekrarText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(geriIcon))
                    .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(sifreYenilemeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 107, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sifreYenilemePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sifreyiYenileButton)
                .addGap(85, 85, 85))
        );
        sifreYenilemePanelLayout.setVerticalGroup(
            sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(geriIcon)
                .addGap(31, 31, 31)
                .addComponent(sifreYenilemeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefonNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(telefonNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guvenlikCevapLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guvenlikCevapText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eskiSifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(eskiSifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yeniSifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yeniSifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sifreTekrarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(sifreTekrarText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(sifreyiYenileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        sifreYenilemePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {guvenlikCevapText, tcNoText, telefonNoText});

        sifreYenilemePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {eskiSifreText, yeniSifreText});

        sifreYenilemePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {sifreTekrarLabel, sifreTekrarText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sifreYenilemePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sifreYenilemePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void getEdits() {

        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        sifreYenilemePanel.setFocusable(true);
        TextAyarlari.setOnlyNumber(tcNoText);
        TextAyarlari.setMaxLimit(tcNoText, 11);
        TextAyarlari.setOnlyNumber(telefonNoText);
        TextAyarlari.setMaxLimit(telefonNoText, 11);
        if (getHesapBilgileri().getKullaniciId() == 0) { //kullanıcı hesabında değilse
            this.eskiSifreText.setEnabled(false);//eski şifre text alanı kapalı olsun
        }

    }

    public JPasswordField getEskiSifreText() { //giriş ekranında şifremi unuttum diyerek şifre yenileme ekranına geçilecek
        //bu ekranda şifreyi unutan kullanıcı eski şifresini bilmediği için eski şifre alanının aktifliği
        return eskiSifreText;                //kapalı olmalı. esi şifre alanı private ve buna giriş ekranından ulaşmak için getter fonk. yazdık
    }

    private boolean isEnabledEskiSifreText() { //eski şifre aktif mi değil mi
        return this.getEskiSifreText().isEnabled();
    }

    @Override
    public boolean bilgilerGecerliMi() {
        //çok fazla text alanı olduğu için bu method sayesinde hızlıca doluluğu kontrol edilecek
        return TextAyarlari.textAlanlariDolumu(this.sifreYenilemePanel);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public SifreYenileme getSifreYenilemeObject() {
        if(this.sifreYenilemeObject == null) {
            sifreYenilemeObject = new SifreYenileme();
        }
        return sifreYenilemeObject;
    }

    
    

    private void geriIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriIconMouseClicked

        if (isEnabledEskiSifreText()) { //eski şifre aktifse geri iconu ayarlar ekranına yönlendirme yapacak            
            ActionAyarlari.setVisible(this, new AyarlarEkrani());
        } else {                                                     //eski şifre aktif DEĞİLSE giriş ekranına yönlendirme olacak.
            ActionAyarlari.setVisible(this, new GirisEkrani());     //çünkü kullanıcı sisteme giriş yapmadı            
        }
    }//GEN-LAST:event_geriIconMouseClicked

    private void sifreyiYenileButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifreyiYenileButtonMouseEntered
        ButtonAyarlari.setBgFg(sifreyiYenileButton, Color.black, Color.white);
    }//GEN-LAST:event_sifreyiYenileButtonMouseEntered

    private void sifreyiYenileButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifreyiYenileButtonMouseExited
        ButtonAyarlari.setOriginalBgFg(sifreyiYenileButton);
    }//GEN-LAST:event_sifreyiYenileButtonMouseExited

    private void sifreyiYenileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifreyiYenileButtonActionPerformed
        if (this.bilgilerGecerliMi()) {
            this.sifreyiYenile();
        } else {
            Dialogs.bosOlamazMesajiGoster(this);
        }
    }//GEN-LAST:event_sifreyiYenileButtonActionPerformed

    private void sifreyiYenile() {
        String yeniSifre = String.valueOf(this.yeniSifreText.getPassword());
        String yeniSifreTekrar = String.valueOf(this.sifreTekrarText.getPassword());

        if (yeniSifre.equals(yeniSifreTekrar)) {
            this.sifreyiOnayla();
        } else {
            Dialogs.ozelMesajGoster(this, "Şifreler uyuşmuyor!");
        }
    }

    private void sifreyiOnayla() {
        this.getSifreYenilemeObject().setTcNo(this.tcNoText.getText());
        this.getSifreYenilemeObject().setTelNo(this.telefonNoText.getText());
        this.getSifreYenilemeObject().setGuvenlikCevap(this.guvenlikCevapText.getText());
        if (this.isEnabledEskiSifreText()) {
            //eski şifre aktifse eski şifreyi alıp gönderdik(kullanıcı zaten hesabındaysa eski şifresini gönderdik)
            this.getSifreYenilemeObject().setEskiSifre(String.valueOf(this.eskiSifreText.getPassword()));
        }
        this.getSifreYenilemeObject().setYeniSifre(String.valueOf(this.yeniSifreText.getPassword()));

        if (this.getSifreYenilemeObject().sifreYenilendiMi()) {
            Dialogs.ozelMesajGoster(this, "Şifreniz başarıyla yenilenmiştir.");
            if (this.isEnabledEskiSifreText()) {
                //kullanıcı hesabındaysa şifre yenilendikten sonra hesap ekranına dönüş yapılacak
                ActionAyarlari.setVisible(this, new HesapEkrani());
            } else {
                //kullanıcı hesabına giriş yapmadan şifre yeniliyorsa yenileme işleminden sonra giriş ekranına dönülecektir
                ActionAyarlari.setVisible(this, new GirisEkrani());
            }
        } else {
            Dialogs.ozelMesajGoster(this, "Şifreniz yenilenemedi!\n"
                    + "Lütfen bilgilerinizi kontrol edin!");
        }
    }

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
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SifreYenilemeEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel eskiSifreLabel;
    private javax.swing.JPasswordField eskiSifreText;
    private javax.swing.JLabel geriIcon;
    private javax.swing.JLabel guvenlikCevapLabel;
    private javax.swing.JTextField guvenlikCevapText;
    private javax.swing.JLabel sifreTekrarLabel;
    private javax.swing.JPasswordField sifreTekrarText;
    private javax.swing.JLabel sifreYenilemeLabel;
    private javax.swing.JPanel sifreYenilemePanel;
    private javax.swing.JButton sifreyiYenileButton;
    private javax.swing.JLabel tcNoLabel;
    private javax.swing.JTextField tcNoText;
    private javax.swing.JLabel telefonNoLabel;
    private javax.swing.JTextField telefonNoText;
    private javax.swing.JLabel yeniSifreLabel;
    private javax.swing.JPasswordField yeniSifreText;
    // End of variables declaration//GEN-END:variables
}

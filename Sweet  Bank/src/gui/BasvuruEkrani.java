package gui;

import database.IBilgiController;
import database.transactions.HesapBilgileri;
import database.transactions.KullaniciBasvuru;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;
import java.awt.Color;

public class BasvuruEkrani extends javax.swing.JFrame implements IDuzenleyici, IBilgiController {

    //KullanıcıBasvuru sınıfına verileri gönderebilmek için nesne oluşturacağız //aşağıda getter fonksiyonu ile oluşturulacak
    private KullaniciBasvuru kullaniciBasvuruObject = null;

    public BasvuruEkrani() {
        initComponents();
        getEdits();//ekran açıldığında methodu çağırır
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basvuruEkraniPanel = new javax.swing.JPanel();
        adSoyadLabel = new javax.swing.JLabel();
        guvenlikBilgileriLabel = new javax.swing.JLabel();
        adSoyadText = new javax.swing.JTextField();
        tcNoLabel = new javax.swing.JLabel();
        tcNoText = new javax.swing.JTextField();
        guvenlikSorusuLabel = new javax.swing.JLabel();
        telNoText = new javax.swing.JTextField();
        kisiselBilgilerLabel1 = new javax.swing.JLabel();
        telNoLabel = new javax.swing.JLabel();
        guvenlikSorusu = new javax.swing.JComboBox<>();
        guvenlikCevapLabel = new javax.swing.JLabel();
        guvenlikCevapText = new javax.swing.JTextField();
        basvurButton = new javax.swing.JButton();
        geriIcon1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sweet Bank Başvuru Ekranı");

        basvuruEkraniPanel.setBackground(new java.awt.Color(255, 255, 204));

        adSoyadLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        adSoyadLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        adSoyadLabel.setText("Ad Soyad :");

        guvenlikBilgileriLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        guvenlikBilgileriLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        guvenlikBilgileriLabel.setText("Güvenlik Bilgileri");

        adSoyadText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        adSoyadText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adSoyadTextActionPerformed(evt);
            }
        });

        tcNoLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tcNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tcNoLabel.setText("T.C. No :");

        tcNoText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        guvenlikSorusuLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        guvenlikSorusuLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        guvenlikSorusuLabel.setText("Güvenlik Sorusu:");

        telNoText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        kisiselBilgilerLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        kisiselBilgilerLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kisiselBilgilerLabel1.setText("Kişisel Bilgiler");

        telNoLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        telNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        telNoLabel.setText("Telefon No :");

        guvenlikSorusu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        guvenlikSorusu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Evcil hayvanınızın adı nedir?", "En sevdiğiniz nesne nedir?", "İlkokul öğretmeninizin soyadı nedir?", "Yaşamak istediğiniz yer neresidir?", "Ya da rastgele cümle girin(önerilir)" }));

        guvenlikCevapLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        guvenlikCevapLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        guvenlikCevapLabel.setText("Cevap :");

        guvenlikCevapText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        basvurButton.setBackground(new java.awt.Color(204, 204, 255));
        basvurButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        basvurButton.setText("Başvur");
        basvurButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        basvurButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                basvurButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                basvurButtonMouseExited(evt);
            }
        });
        basvurButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basvurButtonActionPerformed(evt);
            }
        });

        geriIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previousIcon.png"))); // NOI18N
        geriIcon1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriIcon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriIcon1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout basvuruEkraniPanelLayout = new javax.swing.GroupLayout(basvuruEkraniPanel);
        basvuruEkraniPanel.setLayout(basvuruEkraniPanelLayout);
        basvuruEkraniPanelLayout.setHorizontalGroup(
            basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basvuruEkraniPanelLayout.createSequentialGroup()
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                                .addComponent(adSoyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(adSoyadText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                                .addComponent(tcNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tcNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                                .addComponent(telNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(telNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, basvuruEkraniPanelLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(guvenlikCevapLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(basvurButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guvenlikCevapText)))
                    .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                        .addContainerGap(57, Short.MAX_VALUE)
                        .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(guvenlikBilgileriLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                                .addComponent(guvenlikSorusuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(guvenlikSorusu, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(62, 62, 62))
            .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(geriIcon1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addComponent(kisiselBilgilerLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(336, Short.MAX_VALUE)))
        );
        basvuruEkraniPanelLayout.setVerticalGroup(
            basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(geriIcon1)
                .addGap(56, 56, 56)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adSoyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adSoyadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(guvenlikBilgileriLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guvenlikSorusuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guvenlikSorusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guvenlikCevapText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guvenlikCevapLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(basvurButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addComponent(kisiselBilgilerLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(451, Short.MAX_VALUE)))
        );

        basvuruEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {adSoyadLabel, adSoyadText});

        basvuruEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tcNoLabel, tcNoText});

        basvuruEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {guvenlikSorusu, guvenlikSorusuLabel, telNoText});

        basvuruEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {guvenlikCevapLabel, guvenlikCevapText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basvuruEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basvuruEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void getEdits() {

        this.setLocationRelativeTo(null);//ekranı ortalar
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        basvuruEkraniPanel.setFocusable(true);//başvuru ekranına odaklar

        TextAyarlari.setOnlyAlphabetic(adSoyadText);//adsoyad alanına sadece alfabetik karakter alınmasını sağlar
        TextAyarlari.setOnlyNumber(tcNoText);
        TextAyarlari.setOnlyNumber(telNoText);
        TextAyarlari.setMaxLimit(tcNoText, 11);
        TextAyarlari.setMaxLimit(telNoText, 11);
    }

    //kullanıcıbasvuruobject nesnesi döndürülecek
    public KullaniciBasvuru getKullaniciBasvuruObject() {
        if (this.kullaniciBasvuruObject == null) { // burada nesne oluşturuluyor 
            kullaniciBasvuruObject = new KullaniciBasvuru();
        }
        return kullaniciBasvuruObject;
    }

    @Override
    public boolean bilgilerGecerliMi() { //bilgiler geçerliyse true dönecek
        return TextAyarlari.textAlanlariDolumu(basvuruEkraniPanel);

    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }


    private void basvurButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basvurButtonActionPerformed
        if (this.bilgilerGecerliMi()) {
            this.basvuruyuGerceklestir();

        } else {
            Dialogs.bosOlamazMesajiGoster(this);
        }

    }//GEN-LAST:event_basvurButtonActionPerformed

    private void basvuruyuGerceklestir() {

        // => girilen text alanlarındaki bilgiler alınıyor
        // kişisel bilgiler        
        this.getKullaniciBasvuruObject().setAdSoyad(this.adSoyadText.getText().trim());
        this.getKullaniciBasvuruObject().setTcNo(this.tcNoText.getText());
        this.getKullaniciBasvuruObject().setTelNo(this.telNoText.getText());

        //güvenlik bilgileri
        this.getKullaniciBasvuruObject().setGuvenlikSorusu(String.valueOf(this.guvenlikSorusu.getSelectedItem()));
        this.getKullaniciBasvuruObject().setGuvenlikCevap(this.guvenlikCevapText.getText().trim());

        //sistem tarafından verilecek bilgiler
        this.getKullaniciBasvuruObject().setMusteriNo(this.randomMusteriNoAl());
        this.getKullaniciBasvuruObject().setSifre(this.randomSifreAl());

        if (this.getKullaniciBasvuruObject().basvuruOnaylandiMi()) {
            Dialogs.ozelMesajGoster(this, "Başvurunuz kabul edilmiştir. \n"
                    + "Müşteri Numaranız: " + this.getKullaniciBasvuruObject().getMusteriNo()
                    + "\n Şifreniz: " + this.getKullaniciBasvuruObject().getSifre());
            ActionAyarlari.setVisible(this, new GirisEkrani());
        } else {
            Dialogs.ozelMesajGoster(this, "Başvurunuz kabul edilmemiştir.\n"
                    + "Lütfen bilgilerinizi kontrol edin!");
        }

    }

    private String randomMusteriNoAl() {

        /*
        math.random() methodu 0 ile 1 arasında değerler üretir. bu değerleri 9 milyon ile çarparsak ve int olarak alırsak 0 ile 9 milyon arasında sayılar 
        üretmiş oluruz. bu sayılara 1 milyon eklersek 1 ile 10 milyon arasında müşteri noları üretmiş oluruz
         */
        String musteriNo;  //do while döngüsü ile aynı müşteri no'sunun verilmesi engelleniyor
        do {
            musteriNo = String.valueOf(100000 + (int) (Math.random() * 9000000));
        } while (this.getKullaniciBasvuruObject().musteriNoTablodaVarMi());
        return musteriNo;
    }

    private String randomSifreAl() {
        // bin ile 10 bin arası şifre değeri oluşturulacak
        String sifre;
        sifre = String.valueOf(1000 + (int) (Math.random() * 9000));
        return sifre;
    }


    private void basvurButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basvurButtonMouseEntered
        ButtonAyarlari.setBgFg(basvurButton, Color.black, Color.white);
    }//GEN-LAST:event_basvurButtonMouseEntered

    private void basvurButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basvurButtonMouseExited
        ButtonAyarlari.setOriginalBgFg(basvurButton);
        //ActionAyarlari.setVisible(this, new GirisEkrani());
    }//GEN-LAST:event_basvurButtonMouseExited

    private void adSoyadTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adSoyadTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adSoyadTextActionPerformed

    private void geriIcon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriIcon1MouseClicked
        ActionAyarlari.setVisible(this, new GirisEkrani());
    }//GEN-LAST:event_geriIcon1MouseClicked

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
            java.util.logging.Logger.getLogger(BasvuruEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BasvuruEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BasvuruEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BasvuruEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BasvuruEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adSoyadLabel;
    private javax.swing.JTextField adSoyadText;
    private javax.swing.JButton basvurButton;
    private javax.swing.JPanel basvuruEkraniPanel;
    private javax.swing.JLabel geriIcon1;
    private javax.swing.JLabel guvenlikBilgileriLabel;
    private javax.swing.JLabel guvenlikCevapLabel;
    private javax.swing.JTextField guvenlikCevapText;
    private javax.swing.JComboBox<String> guvenlikSorusu;
    private javax.swing.JLabel guvenlikSorusuLabel;
    private javax.swing.JLabel kisiselBilgilerLabel1;
    private javax.swing.JLabel tcNoLabel;
    private javax.swing.JTextField tcNoText;
    private javax.swing.JLabel telNoLabel;
    private javax.swing.JTextField telNoText;
    // End of variables declaration//GEN-END:variables
}

package gui;

import database.IBilgiController;
import database.transactions.HesapBilgileri;
import database.transactions.ParaCekme;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;
import javax.swing.JOptionPane;

public class ParaCekmeEkrani extends javax.swing.JFrame implements IDuzenleyici, IBilgiController {

    private ParaCekme paraCekmeObject = null;    
    
    private int cekilecekMiktar = 0; //kullanıcın çekmek istediği tutar bu değişkende tutulacak

    public ParaCekmeEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {

        this.setLocationRelativeTo(null);//açılacak olan para çekme ekranını ortalar
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        paraCekmeEkraniPanel.setFocusable(true); //imleci herhangi bir yerde başlatmaz
        TextAyarlari.setOnlyNumber(cekilecekMiktarText); //çekilecek miktara sadece sayı girişini sağlar
        TextAyarlari.setMaxLimit(cekilecekMiktarText, 4); //çekilecek miktara en fazla 4 basamaklı sayı girişi ile kısıtlar
        this.kullaniciAdiSoyadiLabel.setText(" Sayın " +this.getHesapBilgileri().getAdSoyad());
        this.bakiyeLabel.setText(String.valueOf(this.getHesapBilgileri().getBakiye()));
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.cekilecekMiktarText.getText().equals(""));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }
    
    //ParaCekme nesnesini kullanabilmek için getter fonksiyonu

    public ParaCekme getParaCekmeObject() {
        if (this.paraCekmeObject == null) {
            paraCekmeObject = new ParaCekme();
        }
        return paraCekmeObject;
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paraCekmeEkraniPanel = new javax.swing.JPanel();
        kullaniciAdiSoyadiLabel = new javax.swing.JLabel();
        limitUyariLabel = new javax.swing.JLabel();
        toplamBakiyenizLabel = new javax.swing.JLabel();
        bakiyeLabel = new javax.swing.JLabel();
        cekeceginizMiktarLabel = new javax.swing.JLabel();
        cekilecekMiktarText = new javax.swing.JTextField();
        paraCekButton = new javax.swing.JButton();
        geriIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sweet Bank Para Çekme Ekranı");

        paraCekmeEkraniPanel.setBackground(new java.awt.Color(255, 255, 204));

        kullaniciAdiSoyadiLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kullaniciAdiSoyadiLabel.setForeground(new java.awt.Color(255, 0, 51));
        kullaniciAdiSoyadiLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kullaniciAdiSoyadiLabel.setText("Sayın [KULLANICI ADI SOYADI]");

        limitUyariLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        limitUyariLabel.setText("Tek seferde 5000 TL ve altını çekebilirsiniz.");

        toplamBakiyenizLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        toplamBakiyenizLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        toplamBakiyenizLabel.setText("Toplam Bakiyeniz  :");

        bakiyeLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bakiyeLabel.setText("[BAKİYE]");

        cekeceginizMiktarLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cekeceginizMiktarLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cekeceginizMiktarLabel.setText("Çekeceğiniz Miktar :");

        cekilecekMiktarText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cekilecekMiktarText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekilecekMiktarTextActionPerformed(evt);
            }
        });
        cekilecekMiktarText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cekilecekMiktarTextKeyReleased(evt);
            }
        });

        paraCekButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        paraCekButton.setText("Para Çek");
        paraCekButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paraCekButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paraCekButtonActionPerformed(evt);
            }
        });

        geriIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previousIcon.png"))); // NOI18N
        geriIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout paraCekmeEkraniPanelLayout = new javax.swing.GroupLayout(paraCekmeEkraniPanel);
        paraCekmeEkraniPanel.setLayout(paraCekmeEkraniPanelLayout);
        paraCekmeEkraniPanelLayout.setHorizontalGroup(
            paraCekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paraCekmeEkraniPanelLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(paraCekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paraCekmeEkraniPanelLayout.createSequentialGroup()
                        .addGroup(paraCekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paraCekmeEkraniPanelLayout.createSequentialGroup()
                                .addComponent(toplamBakiyenizLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(kullaniciAdiSoyadiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(paraCekmeEkraniPanelLayout.createSequentialGroup()
                                .addComponent(cekeceginizMiktarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cekilecekMiktarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paraCekmeEkraniPanelLayout.createSequentialGroup()
                        .addComponent(paraCekButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187))))
            .addGroup(paraCekmeEkraniPanelLayout.createSequentialGroup()
                .addGroup(paraCekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paraCekmeEkraniPanelLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(limitUyariLabel))
                    .addGroup(paraCekmeEkraniPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(geriIcon)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        paraCekmeEkraniPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bakiyeLabel, cekilecekMiktarText});

        paraCekmeEkraniPanelLayout.setVerticalGroup(
            paraCekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paraCekmeEkraniPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(geriIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kullaniciAdiSoyadiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(limitUyariLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(paraCekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toplamBakiyenizLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paraCekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cekeceginizMiktarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cekilecekMiktarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(paraCekButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        paraCekmeEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bakiyeLabel, limitUyariLabel, toplamBakiyenizLabel});

        paraCekmeEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cekeceginizMiktarLabel, cekilecekMiktarText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paraCekmeEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paraCekmeEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void cekilecekMiktarTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekilecekMiktarTextActionPerformed

    }//GEN-LAST:event_cekilecekMiktarTextActionPerformed

    private void paraCekButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paraCekButtonActionPerformed

        if (this.bilgilerGecerliMi()) {
            this.paraCek();
        }else{
            Dialogs.bosOlamazMesajiGoster(this);
        }

    }//GEN-LAST:event_paraCekButtonActionPerformed

    private void paraCek(){
        //paracekme nesnesinden cekilecek miktarı aldık.
        this.getParaCekmeObject().setCekilecekMiktar(cekilecekMiktar);
        
        //eğer para çekme işlemi başarılıysa
        if (getParaCekmeObject().paraCekildiMi()) {
            Dialogs.ozelMesajGoster(this, "Para çekme işlemi tamamlandı.\n"
                    + "Çekilen miktar: " + this.cekilecekMiktar + " TL");
            ActionAyarlari.setVisible(this, new HesapEkrani());
        }else{
        //bakiyenin yetersiz olma durumu ParaCekme.Java sınıfında kontrol edildi
            Dialogs.ozelMesajGoster(this, "Bakiyeniz yeterli değil!");
        }
    }
    
    
    //kullanıcın çekebileceği maksimum miktarı kısıtlamak için yazılan method
    private void cekilecekMiktarTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cekilecekMiktarTextKeyReleased
        //kullanıcı bastığı tuşu serbest bıraktığı zaman gerçekleşecek kodlar bu kısma yazılır
        this.cekilecekMiktar = TextAyarlari.checkTheTextKeyReleased(cekilecekMiktarText, 5000);
        
    }//GEN-LAST:event_cekilecekMiktarTextKeyReleased

    //geri tuşu ayarı
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
            java.util.logging.Logger.getLogger(ParaCekmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParaCekmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParaCekmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParaCekmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParaCekmeEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bakiyeLabel;
    private javax.swing.JLabel cekeceginizMiktarLabel;
    private javax.swing.JTextField cekilecekMiktarText;
    private javax.swing.JLabel geriIcon;
    private javax.swing.JLabel kullaniciAdiSoyadiLabel;
    private javax.swing.JLabel limitUyariLabel;
    private javax.swing.JButton paraCekButton;
    private javax.swing.JPanel paraCekmeEkraniPanel;
    private javax.swing.JLabel toplamBakiyenizLabel;
    // End of variables declaration//GEN-END:variables
}

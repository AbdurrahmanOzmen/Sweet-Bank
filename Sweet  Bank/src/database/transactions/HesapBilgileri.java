package database.transactions;

import database.DbVeriMerkezi;
import database.IBilgiController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

public class HesapBilgileri extends DbVeriMerkezi implements IBilgiController {

    /*
    * Singleton
     */
    private static HesapBilgileri hesapBilgileri = null;

    public static HesapBilgileri getInstance() {
        if (hesapBilgileri == null) {
            hesapBilgileri = new HesapBilgileri();
        }
        return hesapBilgileri;
    }

    @Override
    public boolean bilgilerGecerliMi() {
        //kullanıcı id'yi kontrol etmemmiz yeterli. eğer kullanıcı id sıfır ise kullanıcı id'yi zaten alamamışızdır demektir   
        return !(super.kullaniciId == 0);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void girisYap(String musteriKimlik) {
        this.kullaniciyiAl(musteriKimlik);
        this.bakiyeAl();
        this.faturalariAl();
    }
    
    public void cikisYap() {
        //tanımlanan bütün değikenler sıfırlanıp resetlenecek
        super.kullaniciId = 0;
        super.adSoyad = null;
        super.telNo = null;
        super.musteriNo = null;
        super.tcNo = null;
        super.bakiye = 0;
        super.elektrikFaturasi = 0;
        super.suFaturasi = 0;
        super.dogalgazFaturasi = 0;
        super.internetFaturasi = 0;
    }
    
    

    /*
    *Kullanıcı Hesap Bilgilerini Alma İşlemleri
     */
    
    private void kullaniciyiAl(String musteriKimlik) { // bu method ile kullanıcılar tablosundaki verileri alacağız

//bu method sayesinde gelen müşteri kimliğini gönderdik ... 
        String query = " SELECT * FROM kullanicilar WHERE "
                + " tc_no = ' " + musteriKimlik + " ' "
                + " OR "
                + " musteri_no = ' " + musteriKimlik + " ' ";

        //... ve bu müşteri kimliğine eşit olan verinin DbVeriMerkezi sınıfındaki değişkenlere atamış olduk.
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                super.kullaniciId = rs.getInt("kullanici_id");
                super.adSoyad = rs.getNString("ad_soyad");
                super.tcNo = rs.getNString("tc_no");
                super.telNo = rs.getNString("tel_no");
                super.musteriNo = rs.getNString("musteri_no");
            }
        } catch (SQLException ex) {
            Logger.getLogger(HesapBilgileri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void bakiyeAl() {
        //yeniden kullanıcı_id almıyoruz burada yukarıda aldığımız  id üzerinden işlem yapabiliriz

        if (this.bilgilerGecerliMi()) {
            String query = " SELECT * FROM kullanici_bakiye"
                    + " WHERE "
                    + " kullanici_id = ' " + super.getKullaniciId() + " ' ";

            try {
                super.statement = super.connection.createStatement();
                ResultSet rs = statement.executeQuery(query);
                while (rs.next()) { //aldığımız bakiyeyi super.bakiye ile atama işlemi yapıyoruz
                    super.bakiye = rs.getDouble("bakiye");
                }
            } catch (SQLException ex) {
                Logger.getLogger(HesapBilgileri.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    private void faturalariAl() {
        if (this.bilgilerGecerliMi()) {
            String query = " SELECT * FROM kullanici_faturalar"
                    + " WHERE "
                    + " kullanici_id = ' " + super.getKullaniciId() + " ' ";
            try {
                super.statement = super.connection.createStatement();
                ResultSet rs = statement.executeQuery(query);
                while (rs.next()) {
                    super.elektrikFaturasi = rs.getDouble("elektrik");
                    super.suFaturasi = rs.getDouble("su");
                    super.dogalgazFaturasi = rs.getDouble("dogalgaz");
                    super.internetFaturasi = rs.getDouble("internet");
                }
            } catch (SQLException ex) {
                Logger.getLogger(HesapBilgileri.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    /*
    *
    */
}

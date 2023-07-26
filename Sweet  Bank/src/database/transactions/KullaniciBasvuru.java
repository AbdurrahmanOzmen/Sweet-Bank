package database.transactions;

import database.DbConnection;
import database.IBilgiController;
import gui.ayarlar.TextAyarlari;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

public class KullaniciBasvuru extends DbConnection implements IBilgiController {

    //başvuru bilgileri
    private String adSoyad = null, tcNo = null, telNo = null;
    private String guvenlikSorusu = null, guvenlikCevap = null;

    //sistem tarafından verilecek bilgiler
    private String musteriNo = null;
    private String sifre = null;

    public boolean basvuruOnaylandiMi() {
        if (this.bilgilerGecerliMi()) { //bilgiler geçerliyse başvuruyu onayla
            if (this.tcNoTablodaVarMi()) {//ve tc no tabloda 2. defa yoksa 
                return false;
            } else {
                this.basvuruyuOnayla();
                return true;
            }

        } else { // bilgiler geçerli değilse false döndür
            return false;
        }
    }

    private boolean tcNoTablodaVarMi() {
        String query = "SELECT tc_no FROM kullanicilar WHERE tc_no = ' " + this.tcNo + " ' ";
        try {
            super.statement = super.connection.createStatement();  //extends edilen databaseconnection sınıfındaki statement'ı kullanmamız gerekiyor.
            ResultSet rs = statement.executeQuery(query);          //statement sorguların çalışmasını sağlar
            while (rs.next()) {
                return true; //eğer tabloda veri bulunursa true dönecek
            }
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciBasvuru.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private void basvuruyuOnayla() { //bu sorguyla gelen değerler tabloya eklenecek
        String query = "INSERT INTO kullanicilar(musteri_no, sifre,"
                + "ad_soyad, tc_no, tel_no,guvenlik_sorusu, guvenlik_cevap)"
                + " VALUES("
                + " ' " + this.musteriNo + " ',"
                + " ' " + this.sifre + " ',"
                + " ' " + this.adSoyad + " ',"
                + " ' " + this.tcNo + " ',"
                + " ' " + this.telNo + " ',"
                + " ' " + this.guvenlikSorusu + " ',"
                + " ' " + this.guvenlikCevap + " ' "
                + " ) ";
        try {
            super.statement = super.connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciBasvuru.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean musteriNoTablodaVarMi() {
        //yazılan sorgu ile kayıtlı müşteri no'sunun aynısı 
        String query = "SELECT musteri_no FROM kullanicilar WHERE musteri_no = ' " + this.musteriNo + " ' ";
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()){  //eğer dolaşabiliyorsak veriyi tabloda vardır. true döner
                return true;    //tabloda yoksa bu kod bloğuna girmez false döndürür
            }
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciBasvuru.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false; 
    }

    @Override
    public boolean bilgilerGecerliMi() { //verilen bilgiler null ise false döner 
        return !(this.adSoyad == null
                || this.tcNo == null
                || this.telNo == null
                || this.guvenlikSorusu == null
                || this.guvenlikCevap == null
                || this.musteriNo == null
                || this.sifre == null
                || TextAyarlari.uzunlukSundanKucukMu(11, this.tcNo) //bu kod ile tc ne telno alanlarına 11 haneden küçük kayıtların yapılası engelleniyor.
                || TextAyarlari.uzunlukSundanKucukMu(11, this.telNo));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //başvuru ekranından ulaşabilmek içi getter ve setter fonksiyonları
    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getGuvenlikSorusu() {
        return guvenlikSorusu;
    }

    public void setGuvenlikSorusu(String guvenlikSorusu) {
        this.guvenlikSorusu = guvenlikSorusu;
    }

    public String getGuvenlikCevap() {
        return guvenlikCevap;
    }

    public void setGuvenlikCevap(String guvenlikCevap) {
        this.guvenlikCevap = guvenlikCevap;
    }

    public String getMusteriNo() {
        return musteriNo;
    }

    public void setMusteriNo(String musteriNo) {
        this.musteriNo = musteriNo;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

}

package database.transactions;

import com.mysql.cj.protocol.Resultset;
import database.DbConnection;
import database.IBilgiController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;


public class KullaniciGiris extends DbConnection implements IBilgiController {

    private String musteriKimlik = null;
    private String sifre = null;

    public boolean girisBilgileriDogruMu() { //giriş bilgileri doğru ise giriş başarılı olacak
        if (bilgilerGecerliMi()) {
            if (girisBasariliMi()) {
                this.getHesapBilgileri().girisYap(musteriKimlik);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.musteriKimlik == null
                || this.sifre == null);
    }

    private boolean girisBasariliMi() {
        //kullanıcının girmiş olduğu bilgilerin doğruluğu veritabanından kontrol ediliyor.

        String query = " SELECT tc_no, musteri_no, sifre FROM kullanicilar " // müşteri kimliği alanına tc no veya musteri no girildiğinde müşteri kimliğine eşitse 
                + " WHERE " // durumu or ile kontrol edildi
                + " (tc_no = ' " + this.musteriKimlik + " ' "
                + " OR "
                + " musteri_no = ' " + this.musteriKimlik + " ' ) " //and ile de şifrenin tutarlı olma durumu kontrol edildi
                + " AND "
                + "sifre = ' " + this.sifre + " ' ";

        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciGiris.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public String getMusteriKimlik() {
        return musteriKimlik;
    }

    public void setMusteriKimlik(String musteriKimlik) {
        this.musteriKimlik = musteriKimlik;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

}

package database.transactions;

//bu sınıfta veritabanı sorgularını yazıp para çekme işlemlerini gerçekleştirreceğiz
import database.DbConnection;
import database.IBilgiController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ParaCekme extends DbConnection implements IBilgiController {

    private int cekilecekMiktar = 0;
    
    public boolean paraCekildiMi(){
        if (bilgilerGecerliMi()) {
            //bilgiler geçerliyse bir sorgu oluşturuyoruz ve para çekme işlemini gerçekleştiriyoruz
            //yani bakiyesinden çekilen para miktarını düşürüp bakiyeyi güncelliyoruz
            String query = "UPDATE kullanici_bakiye "
                    + "SET bakiye = bakiye - ' " + this.cekilecekMiktar + " ' "
                    + " WHERE kullanici_id = ' " + getHesapBilgileri().getKullaniciId() + " ' ";
            
            try {
                super.statement = super.connection.createStatement();
                statement.executeUpdate(query);
                //para çekme işleminden sonra veritabanı kısmında tabolda güncelleme yapılıyor fakat kullanıcı arayüzünde yapılmıyor.
                //gerekli güncellemeyi aşağıda yaptık. güncelleme olmamasının sebebi dbverimerkezine static veri çekme işlemi olduğundan
                //yani uygulamaya çık-gir durumunda kullanıcıya yansıyordu fakat aşağıdaki bir satırla bu durum düzeltildi
                getHesapBilgileri().setBakiye(getHesapBilgileri().getBakiye() - this.cekilecekMiktar);
            } catch (SQLException ex) {
                Logger.getLogger(ParaCekme.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean bilgilerGecerliMi() {//çekilecek miktar sıfırsa veya hesaptaki paradan daha fazla para çekilmeye çalışılıyorsa false döndürecek
        return !(this.cekilecekMiktar == 0
                || getHesapBilgileri().getBakiye() < this.cekilecekMiktar); 
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    
    //cekilecekMiktar değişkeni private olarak tanımlandığı için paracekmeEkranına gönderebilmek için getter setter fonksiyonlarını yazmamız lazım 

    public int getCekilecekMiktar() {
        return cekilecekMiktar;
    }

    public void setCekilecekMiktar(int cekilecekMiktar) {
        this.cekilecekMiktar = cekilecekMiktar;
    }

}
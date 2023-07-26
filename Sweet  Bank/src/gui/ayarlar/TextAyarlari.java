package gui.ayarlar;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class TextAyarlari {

    /*
    *Text odaklanma ayarları
     */
    private static String originalText;//orijinal text tutuluyor
    private static Color originalFgColor; //orijinal yazı rengi tutuluyor

    public static void checkTheTextFocusGained(JTextField textField, String org) {
        originalText = org;

        if (textField.getText().trim().equals(org)) { //eğer içeride orijinal yazı yazıyorsa şifre alanına tıklandığında yazıyı sil
            originalFgColor = textField.getForeground(); //orijinal rengi tutar
            textField.setText("");//yazıyı burada siler
        }
        textField.setForeground(Color.blue);//yzının rengini mavi yapar
    }

    public static void checkTheTextFocusLost(JTextField textField) {//yazının kendisini ve rengini orijinale çevirir
        if (textField.getText().trim().equals("")) {
            textField.setText(originalText);
            textField.setForeground(originalFgColor);
        } else {
            textField.setForeground(Color.black);
        }
    }

    /*
    *Key ayarları
     */
    public static void setOnlyNumber(JTextField textField) {//password alanında harf girişi olabilir bu yüzden sadece kullanıcı alanına yapıyoruz
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {//girilen karakter rakam değilse devre dışı bırakacağız
                char c = e.getKeyChar();//kullanıcımız klavyeden bir karaktere bastığında onu alır.
                if (!Character.isDigit(c)) {//eğer girilen karakter rakam değilse... isdigit karakterin rakam olup olmadığını kontrol eder
                    e.consume();//girilen karakteri devre dışı bırak
                }
            }
        });
    }

    public static void setOnlyAlphabetic(JTextField textField) {//sadece alfabetik karakter girişi içindir
        textField.addKeyListener(new KeyAdapter() {

            @Override
            public void keyTyped(KeyEvent e) {//girilen karakter alfabetik değilse devre dışı bırakacağız
                char c = e.getKeyChar();//kullanıcımız klavyeden bir karaktere bastığında onu alır.
                if (!Character.isAlphabetic(c) && c != KeyEvent.VK_SPACE) {//eğer girilen karakter alfabetik değilse... 
                    e.consume();//girilen karakteri devre dışı bırak
                }
            }
        });
    }

    /*
    *Limit Ayarları
     */
    private static int limit;
    public static void setMaxLimit(JTextField textField, int lim) { //dışardan gelen textfield'a limit koyacağız
        limit = lim;
        textField.setDocument(new PlainDocument() {
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                if (str == null) {
                    return; //string null'sa sonlanır
                }
                if (getLength() + str.length() <= limit) {//girilen karakter ssayısı limitten küçükse ancak karakter yazılablir
                    super.insertString(offs, str, a);
                }
            }
        });
    }

    public static boolean uzunlukSundanKucukMu(int length, String str) {
        return (str.length() < length); //kullanıcının girdiği uzunluk bizim ayarladığımız uzunluktan küçükse true dönecek.
    }

    /*
    * Para Miktarı Ayarları
     */
    //kullanıcın çekebileceği maksimum miktarı kısıtlamak için yazılan method
    public static int checkTheTextKeyReleased(JTextField textField, int moneyLimit) { //tuş serbest bırakıldığında texti kontrol et
        String text = textField.getText();//textField'ın textini alıp text'e atadık
        if (!text.equals("")) { //eğer textin içi boş değilse 
            //kullanıcının girdiği değerler string olduğu için bu değerleri integer'a çevirerek yukarıda tanımlanan miktar değişkenine atadık
            int miktar = Integer.valueOf(text);
            if (miktar > moneyLimit) {                                  //girilen miktar limitten fazlaysa bunu moneylimite dönüştürme işlemi
                miktar = moneyLimit;
                textField.setText(String.valueOf(miktar));  //stringe dönüştürerek textfield alanına yazdırma işlemi
            }
            return miktar;
        }
        return 0;
    }

    /*
    *Text alanları kontrolü
     */
    public static boolean textAlanlariDolumu(JPanel panel) {
        Component[] components = panel.getComponents();
        for (Component c : components) {                                                         // c diziyi dolaşacak
            if (c instanceof JTextField) {                                                       // c textfield örneği ise 
                JTextField textField = (JTextField) c;                                           // c'yi textFielda atadık.
                if (textField.getText().trim().equals("") && textField.isEnabled()) {             // textField boş ise ve aktifse
                    return false;                                                                // text alanları boş uyarısı verildi
                }
            }
        }
        return true;        // text alanları doluysa true dönecek
    }

}

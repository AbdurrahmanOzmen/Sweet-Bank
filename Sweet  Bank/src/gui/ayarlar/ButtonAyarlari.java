
package gui.ayarlar;

import java.awt.Color;
import javax.swing.JButton;


public class ButtonAyarlari {
    
    /*
    *Arka plan ve yazı rengi ayarları
    */
    
    private static Color originalBgColor,originalFgColor;

    public static void setBgFg(JButton button,Color bgColor,Color fgColor /*mouse üstüne geldiğinde hangi renk olacak*/) {
        originalBgColor = button.getBackground(); //orijinal bg rengini tutuyor
        originalFgColor = button.getForeground();
        button.setBackground(bgColor);      //gelen renk parametresiyle butonun bg rengini değiştiriyor
        button.setForeground(fgColor);
    }
    
    public static void setOriginalBgFg(JButton button) {
        button.setBackground(originalBgColor);
        button.setForeground(originalFgColor);
    }
    
    
    /*
    *
    */
}

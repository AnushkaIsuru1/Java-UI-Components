package test;

import java.awt.Color;
import java.awt.Font;
import java.io.InputStream;

public class cl {
        public static Font openFontTTF( float  fontSize) {
            String fontPath =   "1.ttf";
            
            try (InputStream is = cl.class.getResourceAsStream(fontPath)) {
                Font font = Font.createFont(Font.TRUETYPE_FONT, is);
                return font.deriveFont(fontSize);
            } catch (Exception e) {
                System.err.println(e);
                return null;
            } 
          }
        
        
     public static Color b1= new Color(0, 127, 240);
     //Load your font from file

}

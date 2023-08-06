
package test;

import Assest.skin;
import java.awt.Color;
import java.util.Date;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;



public class NewJFrame extends javax.swing.JFrame {

   
    public NewJFrame() {
        initComponents();
        getContentPane().setBackground(Color.WHITE );
        
        nW1.setData();
        nW2.setData();
                }





    Color b1= new Color(0, 127, 240);
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private test.Combobox combobox1;
    private test.Combobox combobox2;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private test.nW nW1;
    private test.nW nW2;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrollbar;

import Assest.skin;
import java.awt.Color;
import javax.swing.JScrollBar;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

/**
 *
 * @author RAVEN
 */
public class Test extends javax.swing.JFrame {

    /**
     * Creates new form Test
     */
    public Test() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        //set Vertical scroll bar
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        scroll.setBackground(skin.bc10);
        //set Horizontal scroll bar
       // ScrollBarCustom sp = new ScrollBarCustom();
       // sp.setOrientation(JScrollBar.HORIZONTAL);
       // scroll.setHorizontalScrollBar(sp);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {



    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane scroll;
    private scrollbar.ScrollBarCustom scrollBarCustom1;
    private scrollbar.ScrollBarCustom sp;
    // End of variables declaration//GEN-END:variables
}

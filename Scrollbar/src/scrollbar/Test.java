/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package scrollbar;

import java.awt.Color;
import javax.swing.JScrollBar;

/**
 *
 * @author Anushka Isuru
 */
public class Test extends javax.swing.JFrame {

    /**
     * Creates new form Test
     */
    public Test() {
        initComponents();
        getContentPane().setBackground(Color.WHITE );
        //jScrollPane1.setVerticalScrollBar(new ScrollBarCustome());
        
        //set horisantal scrollbat
        
        ScrollBarCustome sp  = new ScrollBarCustome();
        sp.setOrientation(JScrollBar.HORIZONTAL);
        
        //jScrollPane1.setHorizontalScrollBar(sp);
        
    }


}

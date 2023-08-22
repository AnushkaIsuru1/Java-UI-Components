/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scrollbar;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JScrollBar;
import javax.swing.plaf.basic.BasicScrollBarUI;


public class ModernScrollBarUI extends BasicScrollBarUI{
    private final int THUMB_SIZE = 40;
    
    @Override
    protected Dimension getMaximumThumbSize(){
        if(scrollbar.getOrientation() == JScrollBar.VERTICAL){
            return new Dimension(0, THUMB_SIZE);
        }else{
            return new Dimension(THUMB_SIZE, 0);
        }
    }
    
    @Override
    protected Dimension getMinimumThumbSize(){
        if(scrollbar.getOrientation() == JScrollBar.VERTICAL){
            return new Dimension(0, THUMB_SIZE);
        }else{
            return new Dimension(THUMB_SIZE, 0);
        }
    }

    @Override
    protected JButton createIncreaseButton(int i) {
        return new ScrollBarButton(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    @Override
    protected JButton createDecreaseButton(int i) {
        return new ScrollBarButton();
    }
    

    

}
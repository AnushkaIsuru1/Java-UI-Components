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
    
    @Override
    protected void paintTrack(Graphics grphcs, JComponent jc, Rectangle rctng1){
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int orientation = scrollbar.getOrientation();
        int size, x, y, width, height;
        
        if(orientation == JScrollBar.VERTICAL){
            size = rctng1.width / 2;
            x = rctng1.x + ((rctng1.width - size) / 2);
            y = rctng1.y;
            width = size;
            height = rctng1.height;
        }else{
            size = rctng1.height / 2;
            y = rctng1.y + ((rctng1.height - size) / 2);
            x = 0;
            width = rctng1.width;
            height = size;
        }
        
        g2.setColor(new Color(240,240,240));
        g2.fillRect(x, y, width, height);
        
    }
    
    @Override
    protected void paintThumb(Graphics grphcs, JComponent jc, Rectangle rctng1){
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        int x,y,width,height;
        
        x = rctng1.x;
        y = rctng1.y;
        width = rctng1.width;
        height = rctng1.height;
        
        if(scrollbar.getOrientation() == JScrollBar.VERTICAL){
            y +=8;
            height -=16;
            
        }else{
            x+=8;
            width -= 16;
        }
        g2.setColor(scrollbar.getForeground());
        g2.fillRoundRect(x, y, width, height,10, 10);
    }
    
    private class ScrollBarButton extends JButton{
        public ScrollBarButton(){
            setBorder(BorderFactory.createEmptyBorder());
            
        }
        
        @Override
        public void paint(Graphics grphcs){
            
        }
    }
}
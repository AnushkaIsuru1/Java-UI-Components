
package test;

import java.awt.Color;
import java.awt.Font;

import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

import Assest.skin;

public class Btn1 extends JButton{


    public boolean isOver() {
        return over;
    }
    public void setOver(boolean over) {
        this.over = over;
    }
    public Color getBg() {
        return bg;
    }
    public void setBg(Color bg) {
        setBackground(bg);
    }
    public Color getFg() {
        return fg;
    }
    public void setFg(Color fg) {
        setForeground(fg);
    }
    public Color getHover_bg() {
        return hover_bg;
    }
    public void setHover_bg(Color hover_bg) {
        this.hover_bg = hover_bg;
    }
    public Color getActive_bg() {
        return active_bg;
    }
    public void setActive_bg(Color active_bg) {
        this.active_bg = active_bg;
    }
    public Color getHover_fg() {
        return hover_fg;
    }
    public void setHover_fg(Color hover_fg) {
        this.hover_fg = hover_fg;
    }
    public Color getActive_fg() {
        return active_fg;
    }
    public void setActive_fg(Color active_fg) {
        this.active_fg = active_fg;
    }

    public Btn1() {

     Font a = skin.ttf(40, 1);
     
    
       this.setFont(a);
      // this.setFont(myFont);
        setFg(Color.WHITE); 
        setBg(bg);
        hover_bg = skin.bc1;
        active_bg = new Color(0, 65, 88);
        setContentAreaFilled(false);


//use the font

        //mouse evet
     
        addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e){
                setBackground(active_bg);
                setForeground(active_fg);
            }
            
            @Override
            public  void mouseReleased(MouseEvent e){
                setBackground(bg);
                setForeground(fg);
            }
            
            @Override
            public void mouseEntered(MouseEvent e){
                setBackground(hover_bg);
                setForeground(hover_fg);
            }
            @Override
            public void mouseExited(MouseEvent e){
                setBackground(bg);
                setForeground(fg);
            }
        
        });
        
    }
    
    
//set the style and size
//myFont = myFont.deriveFont(style, size);
//Now use the font

    
    
    private boolean over;
    private Color bg;
    private Color fg;
    private Color hover_bg;
    private Color active_bg;
    private Color hover_fg;
    private Color active_fg;
    

    
    
    
}

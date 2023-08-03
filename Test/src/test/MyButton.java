
package test;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class MyButton extends JButton{

    /**
     * @return the over
     */
    public boolean isOver() {
        return over;
    }

    /**
     * @param over the over to set
     */
    public void setOver(boolean over) {
        this.over = over;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
        setBackground(color);
    }

    /**
     * @return the colorOver
     */
    public Color getColorOver() {
        return colorOver;
    }

    /**
     * @param colorOver the colorOver to set
     */
    public void setColorOver(Color colorOver) {
        this.colorOver = colorOver;
    }

    /**
     * @return the colorclick
     */
    public Color getColorclick() {
        return colorclick;
    }

    /**
     * @param colorclick the colorclick to set
     */
    public void setColorclick(Color colorclick) {
        this.colorclick = colorclick;
    }

    /**
     * @return the boardercoor
     */
    public Color getBoardercoor() {
        return boardercoor;
    }

    /**
     * @param boardercoor the boardercoor to set
     */
    public void setBoardercoor(Color boardercoor) {
        this.boardercoor = boardercoor;
    }

    /**
     * @return the radius
     */
    public int getRadius() {
        return radius;
    }



    


    private boolean over;
    
    private Color color;
    private Color colorOver;
    private Color colorclick;
    private Color boardercoor;
    private int radius = 0;
    

    
}

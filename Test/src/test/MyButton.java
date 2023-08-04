
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

    /**
     * @param radius the radius to set
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }

    
    public MyButton() {
        setColor(Color.white);
        colorOver = new Color(179, 250, 160);
        colorclick = new Color(152, 183, 144);
        boardercoor = new Color(30, 138, 56);
       setContentAreaFilled(false);
       
       // add mouse event
       
        addMouseListener(new MouseAdapter(){

                @Override
               public void mouseClicked(MouseEvent e) {}

               @Override
               public void mousePressed(MouseEvent e) {
                    setBackground(colorclick);
               }
               @Override
               public void mouseReleased(MouseEvent e) {
                    setBackground(color);
                    if(over){
                         setBackground(colorOver);
                   }}
               @Override
               public void mouseEntered(MouseEvent e) {
                   setBackground(colorOver);
                   over = true;
               }
                @Override
               public void mouseExited(MouseEvent e) {
                   setBackground(color);
                     over = false;
               }
        });
       
       
    }

    private boolean over;
    
    private Color color;
    private Color colorOver;
    private Color colorclick;
    private Color boardercoor;
    private int radius = 0;
    
    @Override
    protected void paintComponent(Graphics grphcs){
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //paint boarder
        g2.setColor(boardercoor);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        g2.setColor(getBackground());
        // boader set 1px
        g2.fillRoundRect(2, 2, getWidth() - 4, getHeight() - 4, radius, radius);
        super.paintComponent(grphcs);
    }
    
}

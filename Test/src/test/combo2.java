/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import Assest.skin;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Label;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
public class combo2 extends javax.swing.JPanel{
    private String l1[];
    private String selctedStr = "sssssssssssss";
    
    
    public combo2(){
        UIManager.put("combo2.background", new ColorUIResource(skin.bc1));
        UIManager.put("combo2.background", new ColorUIResource(skin.bc2));
        UIManager.put("combo2.selectionBackground", new ColorUIResource(skin.bc3));
        UIManager.put("combo2.selectionForeground", new ColorUIResource(skin.bc4));
        setLayout(new FlowLayout(FlowLayout.LEFT, 2, 2));
        
        selctedStr = "sssssssssssss";
        JLabel cont = new JLabel("dfdf");
        cont.setText(selctedStr);
        setBackground(skin.trdc1);
        
        
        Label l2 = new Label();
        l2.setVisible(true);
        l2.setText("ddddddddsssssdssssssssssss");
        add(l2);
        add(new JButton("sdfdf"));
    }
}

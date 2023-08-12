/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package test;

import Assest.skin;
import java.awt.image.ColorModel;
import  javax.swing.JLabel;
import javax.swing.JPanel;
public class nW extends JPanel{


    public nW() {
        initComponents();
      
    
        jLabel1.setFont(skin.ttf(16, 1));
         System.out.println(jLabel1.getParent().getName());
       
    }
    
    public void setData(){
        jLabel1.setText(this.getName());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setName("sssssssssssssssssssssssss"); // NOI18N
        setPreferredSize(new java.awt.Dimension(400, 150));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());


    }// </editor-fold>//GEN-END:initComponents

    public String labalename;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

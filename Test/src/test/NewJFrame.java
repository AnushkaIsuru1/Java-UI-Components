
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


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nW1 = new test.nW();
        nW2 = new test.nW();
        combobox2 = new test.Combobox();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        combobox1 = new test.Combobox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 14, 28));
        setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nW1.setName("Mahesh"); // NOI18N
        getContentPane().add(nW1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        nW2.setName("Hais"); // NOI18N
        getContentPane().add(nW2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        combobox2.setBackground(new java.awt.Color(153, 153, 0));
        combobox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "sdf", "sdfsf" }));
        combobox2.setSelectedIndex(-1);
        combobox2.setToolTipText("sfsd");
        combobox2.setOpaque(false);
        getContentPane().add(combobox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 160, 40));

        jButton1.setText("grgrgege");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 140, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 140, 40));
        getContentPane().add(combobox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 120, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents



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

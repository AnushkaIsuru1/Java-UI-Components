package test;

import java.awt.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.metal.MetalComboBoxButton;

public class MyComboBox {

    private Vector<String> listSomeString = new Vector<String>();
    private JComboBox someComboBox = new JComboBox(listSomeString);
    private JComboBox editableComboBox = new JComboBox(listSomeString);
    private JComboBox non_EditableComboBox = new JComboBox(listSomeString);
    private JFrame frame;

    public MyComboBox() {
        listSomeString.add("-");
        listSomeString.add("Snowboarding");
        listSomeString.add("Rowing");
        listSomeString.add("Knitting");
        listSomeString.add("Speed reading");
//
        someComboBox.setPrototypeDisplayValue("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        someComboBox.setFont(new Font("Serif", Font.BOLD, 16));
        someComboBox.setEditable(true);
        someComboBox.getEditor().getEditorComponent().setBackground(Color.YELLOW);
        ((JTextField) someComboBox.getEditor().getEditorComponent()).setBackground(Color.YELLOW);


    }


}
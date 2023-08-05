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



}

package com.book;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField; import javax.swing.JTextField;


public class GUL {
    static JFrame frame = new JFrame("JTextField demo");
    static JLabel name = new JLabel("Name");
    static JTextField name_data = new JTextField();
    static JLabel pass = new JLabel("Password");
    static JPasswordField pass_data = new JPasswordField();


     static JButton display_info = new JButton("Display user info"); // button
    static JLabel user_info = new JLabel();
    public static void main(String[] args) { name.setBounds(40, 40, 100, 30);
        name_data.setBounds(150, 40, 150, 30);
        pass.setBounds(40, 100, 100, 30); pass_data.setBounds(150, 100, 150, 30);
        display_info.setBounds(150, 160, 150, 30); user_info.setBounds(150, 220, 300, 30);
        frame.add(name);
        frame.add(name_data);
        frame.add(pass);
        frame.add(pass_data);
        frame.add(display_info);
        frame.add(user_info);
        frame.setSize(460, 340); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); frame.setLayout(null);
        frame.setVisible(true);}}
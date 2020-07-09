package com.romannumeral;

//swing imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class userview {

    //creating frame
    JFrame aframe = new JFrame("Roman Numerals");

    //creating info boxes
    JLabel info = new JLabel("Change to number");
    JLabel info2 = new JLabel("Change to numeral");

    //creating text boxes
    JTextField box1 = new JTextField(10);
    JTextField box2 = new JTextField(10);

    //creating buttons
    JButton change1 = new JButton("Change");
    JButton change2 = new JButton("Change");

    //definition of method to create interface
    public void create() {

        //specifying layout and size
        aframe.setLayout(new FlowLayout());
        aframe.setSize(200, 200);

        //adding everything for the numeral to number method
        aframe.add(info);
        aframe.add(box1);
        aframe.add(change1);

        //action listener for the first button
        //static call to the method is in here
        change1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //getting text box input
                String text = box1.getText();

                //calling the from numeral change method
                int number = fromnumeral.change(text);

                //string
                String notice = "The number is: ";

                //if 0 is returned, say invalid
                //else return the number
                if (number == 0) {
                    info.setText("Invalid Roman Numeral");
                }
                else {
                    info.setText(notice + String.valueOf(number));
                }





            }
        });

        //adding everything for the number to numeral method
        aframe.add(info2);
        aframe.add(box2);
        aframe.add(change2);

        //action listener for second button
        //static call to the method is in here
        change2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //getting input from the box
                String text = box2.getText();

                //changing number from string to int,
                //calling method, checking if return is valid,
                //all in a try block
                try {
                    int number = Integer.parseInt(text);
                    String numeral = tonumeral.change(number);

                    String notice = "The numeral is:";

                    if (numeral == null) {
                        info2.setText("   Invalid Number   ");
                    }
                    else {
                        info2.setText(notice + String.valueOf(numeral));
                    }
                }
                catch(Exception ex) {
                    info2.setText("Invalid Number");
                }



            }
        });

        //setting frame visible, specifying that the frame
        //is not resizable, and setting the default close operation
        aframe.setVisible(true);
        aframe.setResizable(false);
        aframe.setDefaultCloseOperation(aframe.EXIT_ON_CLOSE);

    }

}

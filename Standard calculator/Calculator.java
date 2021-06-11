package HomeWork_2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JPanel panel_1;
    private JPanel panel_2;
    private JTextArea Display;
    private JButton eraser;
    private JButton percentage;
    private JButton btn_seven;
    private JButton btn_four;
    private JButton btn_one;
    private JButton plus_Or_Minus;
    private JButton reciprocal;
    private JButton divide;
    private JButton multiply;
    private JButton minus;
    private JButton plus;
    private JButton equal;
    private JButton clear;
    private JButton back_space;
    private JButton square_root;
    private JButton square;
    private JButton btn_nine;
    private JButton btn_eight;
    private JButton btn_six;
    private JButton btn_five;
    private JButton btn_three;
    private JButton btn_two;
    private JButton point;
    private JButton btn_zero;
    private int position = 0;
    private double num_1 = 0;
    private double num_2 = 0;
    private double output;
    private String operation;
    private int check = 0;
    private String percent = "@";

    public Calculator() {
        plus_Or_Minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                output = Double.parseDouble(Display.getText().trim());
                output = -1 * output;
                Display.setText(String.valueOf(output));
            }
        });

        btn_zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.insert("0", position);
                position++;
            }
        });
        point.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.insert(".", position);
                position++;
            }
        });
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                num_2 = Double.parseDouble(Display.getText().trim());
                if(operation == "+")
                    output = num_1 + num_2;
                if(operation == "-")
                    output = num_1 - num_2;
                if(operation == "*")
                    output = num_1 * num_2;
                if(operation == "/")
                    output = num_1 / num_2;
                if(percent == "%"){
                    percent = "@";
                    if(operation == "+")
                        output = num_1 + num_2 /100;
                    if(operation == "-")
                        output = num_1 - num_2 /100;
                    if(operation == "*")
                        output = num_1 * num_2 /100;
                    if(operation == "/")
                        output = num_1 / num_2 /100;
                }


                Display.setText(String.valueOf(output));
                num_1 = 0;
                num_2 = 0;
                position = 0;
                check = 1;
            }
        });
        btn_one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(check == 1){
                    Display.setText(" ");
                    check = 0;
                }
                Display.insert("1", position);

                position++;
            }
        });
        btn_two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(check == 1){
                    Display.setText(" ");
                    check = 0;
                }
                Display.insert("2", position);

                position++;
            }
        });
        btn_three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(check == 1){
                    Display.setText(" ");
                    check = 0;
                }
                Display.insert("3", position);

                position++;
            }
        });
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_1 = Double.parseDouble(Display.getText());
                Display.setText(" ");
                position = 0;
                operation = "+";
            }
        });
        btn_four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(check == 1){
                    Display.setText(" ");
                    check = 0;
                }
                Display.insert("4", position);

                position++;
            }
        });
        btn_five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(check == 1){
                    Display.setText(" ");
                    check = 0;
                }
                Display.insert("5", position);

                position++;
            }
        });
        btn_six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(check == 1){
                    Display.setText(" ");
                    check = 0;
                }
                Display.insert("6", position);

                position++;
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_1 = Double.parseDouble(Display.getText());
                Display.setText(" ");
                position = 0;
                operation = "-";
            }
        });
        btn_seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(check == 1){
                    Display.setText(" ");
                    check = 0;
                }
                Display.insert("7", position);

                position++;
            }
        });
        btn_eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(check == 1){
                    Display.setText(" ");
                    check = 0;
                }
                Display.insert("8", position);

                position++;
            }
        });
        btn_nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(check == 1){
                    Display.setText(" ");
                    check = 0;
                }
                Display.insert("9", position);

                position++;
            }
        });
        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_1 = Double.parseDouble(Display.getText());
                Display.setText(" ");
                position = 0;
                operation = "*";
            }
        });
        eraser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(" ");
                num_1 = 0;
                num_2 = 0;
                position = 0;
            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(" ");
                num_1 = 0;
                num_2 = 0;
                position = 0;
            }
        });
        back_space.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = Display.getText();
                if(s.isEmpty()) {
                    Display.setText(" ");
                    position = 0;
                }
                s = s.substring(0, s.length() - 1);
                Display.setText(s);
                if(position != 0)
                    position--;
            }
        });
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_1 = Double.parseDouble(Display.getText());
                Display.setText(" ");
                position = 0;
                operation = "/";
            }
        });
        percentage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                position = 0;
                percent = "%";
            }
        });
        square_root.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_1 = Double.parseDouble(Display.getText());
                output = (int) Math.sqrt(num_1);
                Display.setText(String.valueOf(output));
                position = 0;
                check = 1;
            }
        });
        square.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_1 = Double.parseDouble(Display.getText());
                output = num_1 * num_1;
                Display.setText(String.valueOf(output));
                position = 0;
                check = 1;
            }
        });
        reciprocal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_1 = Double.parseDouble(Display.getText());
                output = 1 / num_1;
                Display.setText(String.valueOf(output));
                position = 0;
                check = 1;
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("--Calculator--");
        frame.setContentPane(new Calculator().panel_1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

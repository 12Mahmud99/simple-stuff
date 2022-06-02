import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Rearang{

    public Rearang(){
        JFrame f = new JFrame();
        JPanel p = new JPanel();
        JButton b = new JButton("CALCULATOR!!!");
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();
        JTextField t4 = new JTextField();

        f.setLayout(null);
        f.setBounds(200,200,200,200);
        f.add(p);f.add(b);f.add(t1);f.add(t2);f.add(t3);f.setVisible(true);b.setVisible(true);
        b.setBounds(200, 200, 100, 100);f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t3.setBounds(0, 100, 100, 50);
        t2.setBounds(100, 0, 100, 50);
        t1.setBounds(0, 0, 100, 50);
        t1.setVisible(true);
        t2.setVisible(true);
        t3.setVisible(true);

        b.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String s = t1.getText();
                Integer i = Integer.parseInt(s);
                int q = i;
                String s2 = t2.getText();
                Integer i2 = Integer.parseInt(s2);
                int q2 = i2;
                if(q > q2){
                    Integer y = Integer.valueOf(q);
                    String r = y.toString();
                    t3.setText(r);
                }
                else{
                    Integer y = Integer.valueOf(q2);
                    String r = y.toString();
                    t3.setText(r);
                }
                
            }
            
        });
    }
public static void main(String[] args) {
    new Rearang();
}}
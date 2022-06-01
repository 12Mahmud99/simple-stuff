import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class proj{
    public proj ()
    {
        JFrame f = new JFrame();
        JPanel p = new JPanel();
        JTextField t = new JTextField();
        JButton b = new JButton("click me here");
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField("nnnn");
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(0, 0,200, 200);
        b.setVisible(true);
        b.setBounds(0, 0, 200, 200);
        t.setVisible(true);
        t2.setVisible(true);
        t.setBounds(400, 0, 200, 100);
        t2.setBounds(600, 0, 200, 100);
        t3.setBounds(0, 400, 200, 100);
        t3.setVisible(true);
        f.add(p);
        f.add(t);
        f.add(b);
        f.add(t2);
        f.add(t3);
        String s = t.getText();
        Scanner scnr = new Scanner(t.getText());
        b.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer l = Integer.parseInt(t.getText());
                int q = l;
                String s = l.toString(q);

                Integer z = Integer.parseInt(t2.getText());
                z = z  + l;
                int w = z;
                String d = l.toString(w);

                t3.setText(d);

            }});

        
    }
}
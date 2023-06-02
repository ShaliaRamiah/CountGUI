import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class count implements ActionListener{

    private int buttonCount = 0;

    private JLabel label;
    private JFrame frame; 
    private JButton button; 
    private JPanel panel; 



    //constructor
    public count(){

        frame = new JFrame();

        panel = new JPanel();

        button = new JButton("click me");

        button.addActionListener(this);
            
    
        label = new JLabel("clicks: 0" );
        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setTitle("Count");
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main (String[] args) {
       new count();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       buttonCount++;
       label.setText("clicks:" + " " + buttonCount);
    }
}

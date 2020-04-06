import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class runCalc {
    public static void main (String[] argv) {
	Calculator calc = new Calculator(250, 400);
    }
    
}


class Calculator extends JFrame implements ActionListener {
    public Calculator (int width, int height) {
	this.setTitle ("Bond Issuance Calculator");
	this.setSize(width, height);

	JPanel numPanel = new JPanel(new GridLayout(4, 2, 1, 1));
	for(int i = 9; i > -1; i--) {
	    String buttonName = "" + i;
	    JButton b = new JButton (buttonName);
	    b.addActionListener(this);
	    numPanel.add(b);
	}

	JButton dec = new JButton(".");
	dec.addActionListener(this);
	numPanel.add(dec);

	JButton equal = new JButton("=");
	equal.addActionListener(this);
	numPanel.add(equal);


	this.getContentPane().add(numPanel, BorderLayout.SOUTH);
	this.setVisible (true);
    }

    public void actionPerformed (ActionEvent a)
    {
	System.out.println(a.getActionCommand());
    }
    	
}
    

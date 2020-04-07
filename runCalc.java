import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class runCalc {
    public static void main (String[] argv) {
	Calculator calc = new Calculator(900, 150);
    }
    
}


class Calculator extends JFrame implements ActionListener {
    public Calculator (int width, int height) {
	this.setTitle ("Bond Issuance Calculator");
	this.setSize(width, height);

	JTextField calculationArea = new JTextField(25);
	calculationArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
	Font font1 = new Font("Lato.",0, 60);
	calculationArea.setFont(font1);

	JPanel numPanel = new JPanel(new GridLayout(1, 5, 1, 1));
	JButton face_value = new JButton("Future Value");
	face_value.addActionListener(this);
	numPanel.add(face_value);

	JButton equal = new JButton("Payment");
	equal.addActionListener(this);
	numPanel.add(equal);

	
	JButton market_rate = new JButton("Market rate");
	market_rate.addActionListener(this);
	numPanel.add(market_rate);

	JButton present_value = new JButton("Present Value");
	present_value.addActionListener(this);
	numPanel.add(present_value);

	JButton interest_rate = new JButton("Interest Rate");
	interest_rate.addActionListener(this);
	numPanel.add(interest_rate);

	JButton num_payments = new JButton("# of Payments");
	num_payments.addActionListener(this);
	numPanel.add(num_payments);

	


	this.getContentPane().add(calculationArea, BorderLayout.NORTH);
	this.getContentPane().add(numPanel, BorderLayout.SOUTH);
	this.setVisible (true);
    }

    public void actionPerformed (ActionEvent a)
    {
	System.out.println(a.getActionCommand());
    }

    /* This algorithim could be a lot more effecient; however, it is left like this for readbility and verifilability 
     */
    public double bond_issued_at_par(int bond_length, double face_value, double interest_rate, int times_per_year)
    {
	return 0.0;
	
    }
    	
}
    

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class MainPanel extends JPanel{

	// initiate all buttons
	JButton Red = new JButton("Red");
	JButton Green = new JButton("Green");
	JButton Blue = new JButton("Blue");
	JButton Gray = new JButton("Gray");

	Listener listner = new Listener();

	public MainPanel() {

		setFocusable(true);
		add(Red);
		add(Green);
		add(Blue);
		add(Gray);


		//set for each button a match action listener
		Red.addActionListener(listner);
		Green.addActionListener(listner);
		Blue.addActionListener(listner);
		Gray.addActionListener(listner);

	}

	public class Listener implements ActionListener {

		public Listener() {}
		//changing background according to the pressed button
		@Override
		public void actionPerformed(ActionEvent event) {

			String clickedButton = event.getActionCommand();

			if(clickedButton.equals("Red")) 
				setBackground(Color.red);
			else if(clickedButton.equals("Green"))
				setBackground(Color.green);
			else if(clickedButton.equals("Blue"))
				setBackground(Color.blue);
			else if(clickedButton.equals("Gray"))
				setBackground(Color.gray);

		}
	}
}

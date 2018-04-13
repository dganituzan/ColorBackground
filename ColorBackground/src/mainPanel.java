import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class mainPanel extends JPanel {

	JButton RedButton = new JButton("Red");
	JButton GreenButton = new JButton("Green");
	JButton BlueButton = new JButton("Blue");
	JButton GrayButton = new JButton("Gray");
	
	public mainPanel() {
		
		add(RedButton);
		add(GreenButton);
		add(BlueButton);
		add(GrayButton);
		
	}
}

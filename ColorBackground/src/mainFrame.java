import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class mainFrame extends JFrame{
	
	mainPanel Panel = new mainPanel();
	
	public mainFrame() {
		//the title.
		super("Exercise 3");
		//other 
		setSize(400,300);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		add(Panel);
		
	}
}

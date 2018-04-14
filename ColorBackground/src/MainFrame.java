import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainFrame extends JFrame{
//adding the panel to the frame
	MainPanel Panel = new MainPanel();

	public MainFrame() {
		//the title.
		super("Exercise 3");
		//other 
		setSize(400,300);
		setResizable(true);
		setVisible(true);
		setFocusable(true);
		add(Panel);

	}
}


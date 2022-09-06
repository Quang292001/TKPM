package GUI;

import javax.swing.JFrame;
import java.awt.EventQueue;

public class gui extends JFrame{
	
	public gui() {
		initUI();
	}
	
	private void initUI() {
		
		setTitle("Simple example");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
}

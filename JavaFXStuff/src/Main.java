import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;
public class Main extends JFrame{

	public Panel panel = new Panel();
	
	public static void main(String[] args) {
		
		new Main();

	}
	
	Main(){
		setSize(600, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		this.add(panel);
	}

}

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
public class Panel extends JPanel{

	Panel(){

	}
	public void paint(Graphics g){
		this.setBackground(Color.BLUE);
		g.drawImage(Assets.PLAYER.getIMAGE(), 100,100, null);
	}
	
}

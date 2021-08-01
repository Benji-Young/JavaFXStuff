import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public enum Assets {
	PLAYER("Images/fruit.png");
	
	private Image IMAGE;


	Assets(String path) {
		try {
			IMAGE = ImageIO.read(new File(path));
		}catch(IOException e) {
			System.out.println(e);
		}
	}
	
	public Image getIMAGE() {
		return IMAGE;
	}

}

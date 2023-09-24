import java.awt.*;

public class Center {
	JLibrary l; //for using the class in JLibrary.java

	public Center(JLibrary l) {
		this.l = l;
	}

	public void LibraryCenter() {
		//for centering the window
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		l.setLocation((screenSize.width - l.getWidth()) / 2, (screenSize.height - l.getHeight()) / 2);
	}
}
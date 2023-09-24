import java.awt.EventQueue;
import java.awt.Frame;
import javax.swing.JDialog;

public class Main implements Runnable {
	final Frame frame;
	public Main(Frame frame) {
		this.frame = frame;
	}
	public void run() {
		frame.setVisible(true);
	}
public static void main(String[] args) {
		JDialog.setDefaultLookAndFeelDecorated(true);
		// Throw a nice little title page up on the screen first
		//EventQueue.invokeLater(new Main(new JLibrary()));
        EventQueue.invokeLater(new Main(new LoginScreen()));
	}
}

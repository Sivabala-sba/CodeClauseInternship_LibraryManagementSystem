import javax.swing.*;
import java.awt.*;

public class About extends JPanel {
	//constructor of about
	public About() {
		//for creating the image icon
		ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("images/java.jpg"));
		//for creating the label and setting the image icon
		JLabel label1 = new JLabel(icon);
		//for adding the label to the panel
		this.add(label1);
		//for creating the label and setting the text
		JLabel label2 = new JLabel("<html><li> Library Management System"
		        + "</li><li><p>Ver# 1.0</li>");
		//for setting the font to the label
		label2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		//for adding the lable to the panel
		this.add(label2);
	}
}

package exercise;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class MainWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MainWindow");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;
		setSize(screenWidth / 2, screenHeight / 2);
		setLocationByPlatform(true);
		
		NotHelloworldComponent comp = new NotHelloworldComponent();
		add(comp);
		
//		setBounds(100, 100, 450, 300);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		contentPane.setLayout(new BorderLayout(0, 0));
//		setContentPane(contentPane);
	}

}

class NotHelloworldComponent extends JComponent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void paintComponent(Graphics g){
		
		Graphics2D g2 = (Graphics2D) g;

	      String message = "こんにちは世界!";

	      Font f = new Font("Serif", Font.BOLD, 36);
	      g2.setFont(f);

	      FontRenderContext context = g2.getFontRenderContext();
	      Rectangle2D bounds = f.getStringBounds(message, context);

	      double x = (getWidth() - bounds.getWidth()) / 2;
	      double y = (getHeight() - bounds.getHeight()) / 2;

	      g2.drawString(message, (int) x, (int) y);

//		g.drawString("Not a Hello, World program" , MESSAGE_X, MESSAGE_Y);
	}
	public static final int MESSAGE_X = 75;
	public static final int MESSAGE_Y = 100;
}

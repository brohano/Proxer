import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Gui extends JFrame{


	
	/* FRAMES */
	private JFrame frame;
	
	private JPanel panel;
	
	/* BUTTONS */
	private JButton start;
	private JButton pause;
	private JButton stop;
	

	public Gui(){
		
		/* FRAMES */
		frame = new JFrame("HAX");
		frame.setVisible(true);
		frame.setSize(1000,650);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		
		
		/* BUTTONS */
		start = new JButton("Start");
		start.setSize(200,300);
		
		pause = new JButton("Pause");
		pause.setBounds(200, 300, 400, 400);
		
		stop = new JButton ("Stop");
		stop.setSize(200,300);
		
		
		
		/* ADD */
		
		panel.add(start);
		panel.add(pause);
		panel.add(stop);
		
		frame.add(panel);

	}
	public static void main(String[] args) {
		
		 new Gui();
			

			
		}
	
}

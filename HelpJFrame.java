/**
 * This is the 'About' dialog. I copied this from a previous project
 * 
 * @author Chris Lowe
 */
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.FlowLayout;

public class HelpJFrame extends JFrame
{
   
    private static final int WIDTH = 320;
    private static final int HEIGHT = 320;
    
    private static final String HELP_STRING = "<html>" +
		"<center><font size=\"7\">E-Diapers<br /> Customer System</font><br/><br/></center>" +
		"<b>Author:</b> <i>Christopher Lowe</i> <br />" +
		"<b>ID:</b> <i>2011078885</i><br />" +
		"<b>Email:</b> <a href=\"mailto:chris@lowware.com.au\">chris@lowware.com.au</a><br />" +
		"<b>Webpage: </b> <a href=\"http://www.lowware.com.au\">http://www.lowware.com.au</a><br /><br />" +
		"<br/></center>";
		
		
		
    JPanel panel;
    JLabel help;
    JButton exit;
	
	
    public HelpJFrame()
    {
       super("About");
       
       panel = new JPanel();
       help = new JLabel(HELP_STRING);
       panel.add(help);
    
		exit = new JButton("Exit");
		exit.setMnemonic(KeyEvent.VK_X);
		exit.setToolTipText("Exit");
		exit.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				closeHelpWindow();
			}
		});
		exit.setEnabled(true);
		
		getContentPane().setLayout(new FlowLayout());
	
       getContentPane().add(panel);
	   getContentPane().add(exit);
       setSize(WIDTH, HEIGHT);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        //Center the JFrame
        Dimension screensize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        int width = screensize.width;
        int height = screensize.height;
        int width_diff = width - WIDTH;
        int height_diff = height - HEIGHT;
        setLocation(width_diff / 2, height_diff / 2);
       
       setResizable(true);
       setVisible(true);
       
    }
	
	private void closeHelpWindow() {
		dispose();
	}
	
}
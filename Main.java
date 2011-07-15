import javax.swing.JOptionPane;

/**
 * This is the entry point to the EDiapers customer tracking system.
 * It opens the database, populates the CustomerCollection and
 * invokes the Main Menu.
 * 
 * 
 */
public class Main
{
    public static void main(String[] args) {
          
        //Invoke the main menu
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CustomerCollection c = new CustomerCollection();
                c.readDatabase();
                new MainMenu(c).setVisible(true);
            }
        });
    }
}

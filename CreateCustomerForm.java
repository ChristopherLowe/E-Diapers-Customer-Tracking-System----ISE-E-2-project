
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.WindowConstants;



public class CreateCustomerForm extends javax.swing.JFrame {

        private JSeparator jSeparator;
        private JLabel titleJLabel;
        private JTextField birthYearTextField;
        private JLabel incomeJLabel;
        private JLabel birthYearJLabel;
        private JLabel lastNameJLabel;
        private JLabel firstNameJLabel;
        private JTextField lastNameTextField;
        private JTextField firstNameTextField;
        private JButton cancelJButton;
        private JTextField incomeTextField;
        private JButton createJButton;
        
        private CustomerCollection customerDatabase;

        private static final int WIDTH = 450;
        private static final int HEIGHT = 350;

    /** 
     * Create Customer Form
     * 
     * This is auto-generated code from the Netbeans GUI builder.
     * I used the form editor and refactored it for readability.
     * This made the development much faster however it will be difficult 
     * to modify in the future.
     * 
     */
    public CreateCustomerForm(CustomerCollection customerDatabase) {
        this.customerDatabase = customerDatabase;
       
        jSeparator = new JSeparator();
        titleJLabel = new JLabel();
        birthYearTextField = new JTextField();
        incomeJLabel = new JLabel();
        birthYearJLabel = new JLabel();
        lastNameJLabel = new JLabel();
        firstNameJLabel = new JLabel();
        lastNameTextField = new JTextField();
        firstNameTextField = new JTextField();
        cancelJButton = new JButton();
        incomeTextField = new JTextField();
        createJButton = new JButton();

        setResizable(false);
        
        //Center the JFrame
        Dimension screensize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        int width = screensize.width;
        int height = screensize.height;
        int width_diff = width - WIDTH;
        int height_diff = height - HEIGHT;
        setLocation(width_diff / 2, height_diff / 2);
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        titleJLabel.setText("<html><font size=+4>Create New Customer</font></html>");
        incomeJLabel.setText("<html><b>Income:</b></html>");
        birthYearJLabel.setText("<html><b>Birth Year:</b></html>");
        lastNameJLabel.setText("<html><b>Last Name:</b></html>");
        firstNameJLabel.setText("<html><b>First Name:</b></html>");

        cancelJButton.setText("Cancel");
        cancelJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cancelJButtonActionPerformed(evt);
            }
        });

        createJButton.setText("Create");
        createJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                createJButtonActionPerformed(evt);
            }
        });

        //Auto generated by NetBeans
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(Alignment.LEADING)
                            .addComponent(jSeparator, GroupLayout.PREFERRED_SIZE, 322, GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                    .addComponent(firstNameJLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                        .addComponent(birthYearJLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lastNameJLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(incomeJLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(Alignment.LEADING, false)
                                    .addComponent(incomeTextField)
                                    .addComponent(birthYearTextField)
                                    .addComponent(lastNameTextField)
                                    .addComponent(firstNameTextField, GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(titleJLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(createJButton)
                        .addGap(37, 37, 37)
                        .addComponent(cancelJButton)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(Alignment.LEADING)
            .addGap(0, 309, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(titleJLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(jSeparator, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(firstNameJLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(lastNameJLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(birthYearJLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(birthYearTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(incomeJLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(incomeTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(createJButton)
                    .addComponent(cancelJButton))
                .addGap(26, 26, 26))
        );
        pack();
    }



    /**
     * 'Create Customer' button action.
     * 
     * Creates a new customer based of the contents of the text field and
     * updates the database. Finally, it returns to the main menu.
     * 
     */
    private void createJButtonActionPerformed(ActionEvent evt) {
    
        try {
            String firstName = firstNameTextField.getText();
            String lastName = lastNameTextField.getText();
            
            //Create Customer
            Customer c = new Customer(firstName, lastName, birthYearTextField.getText(), incomeTextField.getText());
            
            //Add Customer to the Collection
            customerDatabase.addCustomer(c);
            
            //The Customer has been created.
            JOptionPane completeDialog = new JOptionPane();
            String message = firstName + " " + lastName + " has been created.";
            JOptionPane.showMessageDialog(completeDialog, message);     
            
        } catch (InvalidCustomerException e) {
            //This occurs when the data is invalid or missing.
            //This is a cascading exception design with the message provided by
            //the Customer class.
            JOptionPane errorDialog = new JOptionPane();
            JOptionPane.showMessageDialog(errorDialog, e.getMessage());
            
        }
        
    }

    /**
     * 'Cancel' button action.
     * 
     * Returns to the main menu
     * 
     */
    private void cancelJButtonActionPerformed(ActionEvent evt) {
      
        //Invoke the main menu
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu(customerDatabase).setVisible(true);
            }
        });
        
        setVisible(false);
        
        //We _MAY_ need to clear the text fields before exiting to reset the state
        //firstNameTextField.setText("");
        //lastNameTextField.setText("");
        //incomeTextField.setText("");
        //birthYearTextField.setText("");
    }
}
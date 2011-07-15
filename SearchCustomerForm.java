
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Map.Entry;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Chris Lowe
 */
public class SearchCustomerForm extends javax.swing.JPanel {

    private CustomerCollection customerDatabase;    

    private     JButton editCusomterJButton;
    private     JTabbedPane searchSelectorJTabbedPane;
    private     JPanel searchNameJPanel;
    private     JLabel jLabel1;
    private     JLabel jLabel2;
    private     JTextField firstNameJTextField;
    private     JTextField lastNameJTextField;
    private     JButton searchNameJButton;
    private     JPanel searchBirthYearJPanel;
    private     JLabel jLabel3;
    private     JLabel jLabel4;
    private     JTextField startYearJTextField;
    private     JTextField endYearJTextField;
    private     JButton searchYearJButton;
    private     JPanel searchIncomeJPanel;
    private     JLabel jLabel5;
    private     JLabel jLabel6;
    private     JTextField startIncomeJTextField;
    private     JTextField endIncomeJTextField;
    private     JButton searchIncomeJButton;
    private     JPanel searchAdvancedJPanel;
    private     JLabel jLabel7;
    private     JLabel jLabel8;
    private     JLabel jLabel9;
    private     JTextField advancedStartIncomeJTextField;
    private     JTextField advancedEndIncomeJTextField;
    private     JLabel jLabel10;
    private     JTextField advancedStartBirthYearJTextField;
    private     JTextField advancedEndBirthYearJTextField;
    private     JButton searchAdvancedJButton;
    private     JPanel searchFileJPanel;
    private     JButton chooseQueryFileJButton;
    private     JScrollPane jScrollPane1;
    private     JTable customerJTable;
    private     JButton deleteJButton;
    private     JButton doneJButton;
    private     JLabel jLabel11;
    private     JSeparator jSeparator1;
    private     JButton editJButton;
    
    
    
    public SearchCustomerForm(CustomerCollection customerCollection) {
        this.customerDatabase = customerCollection;
        System.out.println("Searching");

        editCusomterJButton = new JButton();
        searchSelectorJTabbedPane = new JTabbedPane();
        searchNameJPanel = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        firstNameJTextField = new JTextField();
        lastNameJTextField = new JTextField();
        searchNameJButton = new JButton();
        searchBirthYearJPanel = new JPanel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        startYearJTextField = new JTextField();
        endYearJTextField = new JTextField();
        searchYearJButton = new JButton();
        searchIncomeJPanel = new JPanel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        startIncomeJTextField = new JTextField();
        endIncomeJTextField = new JTextField();
        searchIncomeJButton = new JButton();
        searchAdvancedJPanel = new JPanel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        advancedStartIncomeJTextField = new JTextField();
        advancedEndIncomeJTextField = new JTextField();
        jLabel10 = new JLabel();
        advancedStartBirthYearJTextField = new JTextField();
        advancedEndBirthYearJTextField = new JTextField();
        searchAdvancedJButton = new JButton();
        searchFileJPanel = new JPanel();
        chooseQueryFileJButton = new JButton();
        jScrollPane1 = new JScrollPane();
        
        deleteJButton = new JButton();
        doneJButton = new JButton();
        jLabel11 = new JLabel();
        jSeparator1 = new JSeparator();
        editJButton = new JButton();

        customerJTable = new JTable(customerDatabase.getCustomerCount(), 3);
        
        editCusomterJButton.setText("Edit");

        jLabel1.setText("<html><b>First Name:</b></html>");

        jLabel2.setText("<html><b>Last Name:</b></html>");

        
      

        searchNameJButton.setText("Search");
        searchNameJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                searchNameJButtonActionPerformed(evt);
            }
        });

        GroupLayout searchNameJPanelLayout = new GroupLayout(searchNameJPanel);
        searchNameJPanel.setLayout(searchNameJPanelLayout);
        searchNameJPanelLayout.setHorizontalGroup(
            searchNameJPanelLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(searchNameJPanelLayout.createSequentialGroup()
                .addGroup(searchNameJPanelLayout.createParallelGroup(Alignment.LEADING)
                    .addGroup(searchNameJPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(searchNameJPanelLayout.createParallelGroup(Alignment.TRAILING)
                            .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(searchNameJPanelLayout.createParallelGroup(Alignment.LEADING, false)
                            .addComponent(lastNameJTextField)
                            .addComponent(firstNameJTextField, GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)))
                    .addGroup(searchNameJPanelLayout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(searchNameJButton)))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        searchNameJPanelLayout.setVerticalGroup(
            searchNameJPanelLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(searchNameJPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(searchNameJPanelLayout.createParallelGroup(Alignment.TRAILING)
                    .addComponent(firstNameJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(searchNameJPanelLayout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(searchNameJButton)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        searchSelectorJTabbedPane.addTab("By Name", searchNameJPanel);

        jLabel3.setText("<html><b>Start Year:</b></html>");

        jLabel4.setText("<html><b>End Year:</b></html>");

        searchYearJButton.setText("Search");
        searchYearJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                searchYearJButtonActionPerformed(evt);
            }
        });

        GroupLayout searchBirthYearJPanelLayout = new GroupLayout(searchBirthYearJPanel);
        searchBirthYearJPanel.setLayout(searchBirthYearJPanelLayout);
        searchBirthYearJPanelLayout.setHorizontalGroup(
            searchBirthYearJPanelLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(searchBirthYearJPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(searchBirthYearJPanelLayout.createParallelGroup(Alignment.LEADING)
                    .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(searchBirthYearJPanelLayout.createParallelGroup(Alignment.LEADING, false)
                    .addComponent(endYearJTextField)
                    .addComponent(startYearJTextField, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
                .addContainerGap(176, Short.MAX_VALUE))
            .addGroup(Alignment.TRAILING, searchBirthYearJPanelLayout.createSequentialGroup()
                .addContainerGap(220, Short.MAX_VALUE)
                .addComponent(searchYearJButton)
                .addGap(229, 229, 229))
        );
        searchBirthYearJPanelLayout.setVerticalGroup(
            searchBirthYearJPanelLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(searchBirthYearJPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(searchBirthYearJPanelLayout.createParallelGroup(Alignment.TRAILING)
                    .addComponent(startYearJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(searchBirthYearJPanelLayout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(endYearJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(searchYearJButton)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        searchSelectorJTabbedPane.addTab("By Birth Year", searchBirthYearJPanel);

        jLabel5.setText("<html><b>Start Income:</b></html>");

        jLabel6.setText("<html><b>End Income:</b></html>");

        searchIncomeJButton.setText("Search");
        searchIncomeJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                searchIncomeJButtonActionPerformed(evt);
            }
        });

        GroupLayout searchIncomeJPanelLayout = new GroupLayout(searchIncomeJPanel);
        searchIncomeJPanel.setLayout(searchIncomeJPanelLayout);
        searchIncomeJPanelLayout.setHorizontalGroup(
            searchIncomeJPanelLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(searchIncomeJPanelLayout.createSequentialGroup()
                .addGroup(searchIncomeJPanelLayout.createParallelGroup(Alignment.LEADING)
                    .addGroup(searchIncomeJPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(searchIncomeJPanelLayout.createParallelGroup(Alignment.LEADING)
                            .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(searchIncomeJPanelLayout.createParallelGroup(Alignment.LEADING, false)
                            .addComponent(endIncomeJTextField)
                            .addComponent(startIncomeJTextField, GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)))
                    .addGroup(searchIncomeJPanelLayout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(searchIncomeJButton)))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        searchIncomeJPanelLayout.setVerticalGroup(
            searchIncomeJPanelLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(searchIncomeJPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(searchIncomeJPanelLayout.createParallelGroup(Alignment.TRAILING)
                    .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(startIncomeJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(searchIncomeJPanelLayout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(endIncomeJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(searchIncomeJButton)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        searchSelectorJTabbedPane.addTab("By Income", searchIncomeJPanel);

        jLabel7.setText("<html><b>Start Income: </b></html>");

        jLabel8.setText("<html><b>End Income:</b></html>");

        jLabel9.setText("<html><b>Start Birth Year:</b></html>");

        jLabel10.setText("<html><b>End Birth Year:</b></html>");

        searchAdvancedJButton.setText("Search");
        searchAdvancedJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                searchAdvancedJButtonActionPerformed(evt);
            }
        });

        GroupLayout searchAdvancedJPanelLayout = new GroupLayout(searchAdvancedJPanel);
        searchAdvancedJPanel.setLayout(searchAdvancedJPanelLayout);
        searchAdvancedJPanelLayout.setHorizontalGroup(
            searchAdvancedJPanelLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(searchAdvancedJPanelLayout.createSequentialGroup()
                .addGroup(searchAdvancedJPanelLayout.createParallelGroup(Alignment.LEADING)
                    .addGroup(searchAdvancedJPanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(searchAdvancedJPanelLayout.createParallelGroup(Alignment.LEADING)
                            .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(ComponentPlacement.UNRELATED)
                        .addGroup(searchAdvancedJPanelLayout.createParallelGroup(Alignment.LEADING, false)
                            .addComponent(advancedEndIncomeJTextField)
                            .addComponent(advancedStartIncomeJTextField, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(searchAdvancedJPanelLayout.createParallelGroup(Alignment.LEADING)
                            .addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(searchAdvancedJPanelLayout.createParallelGroup(Alignment.LEADING, false)
                            .addComponent(advancedEndBirthYearJTextField)
                            .addComponent(advancedStartBirthYearJTextField, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)))
                    .addGroup(searchAdvancedJPanelLayout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(searchAdvancedJButton)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        searchAdvancedJPanelLayout.setVerticalGroup(
            searchAdvancedJPanelLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(searchAdvancedJPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(searchAdvancedJPanelLayout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(advancedStartIncomeJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(advancedStartBirthYearJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(searchAdvancedJPanelLayout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(advancedEndIncomeJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(advancedEndBirthYearJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(searchAdvancedJButton)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        searchSelectorJTabbedPane.addTab("Advanced Search", searchAdvancedJPanel);

        chooseQueryFileJButton.setText("Select Query File");
        chooseQueryFileJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                chooseQueryFileJButtonActionPerformed(evt);
            }
        });

        GroupLayout searchFileJPanelLayout = new GroupLayout(searchFileJPanel);
        searchFileJPanel.setLayout(searchFileJPanelLayout);
        searchFileJPanelLayout.setHorizontalGroup(
            searchFileJPanelLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(Alignment.TRAILING, searchFileJPanelLayout.createSequentialGroup()
                .addContainerGap(203, Short.MAX_VALUE)
                .addComponent(chooseQueryFileJButton)
                .addGap(193, 193, 193))
        );
        searchFileJPanelLayout.setVerticalGroup(
            searchFileJPanelLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(searchFileJPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(chooseQueryFileJButton)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        searchSelectorJTabbedPane.addTab("Query File", searchFileJPanel);

        customerJTable.setModel(new DefaultTableModel(customerDatabase.getCustomerCount(), 4));

        
        customerJTable.getColumnModel().getColumn(0).setHeaderValue("First Name");
        customerJTable.getColumnModel().getColumn(1).setHeaderValue("Last Name");
        customerJTable.getColumnModel().getColumn(2).setHeaderValue("Birth Year");
        customerJTable.getColumnModel().getColumn(3).setHeaderValue("Income");
        
        /**
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Birth Year", "Income"
            }
        ) {
            Class[] types = new Class [] {
                String.class, String.class, Integer.class, Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        */
        
        customerJTable.setColumnSelectionAllowed(false);
        customerJTable.setRowSelectionAllowed(true);
        customerJTable.getTableHeader().setReorderingAllowed(false);
        
        jScrollPane1.setViewportView(customerJTable);
        customerJTable.getColumnModel().getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        customerJTable.getColumnModel().getColumn(0).setResizable(false);
        customerJTable.getColumnModel().getColumn(1).setResizable(false);
        customerJTable.getColumnModel().getColumn(2).setResizable(false);
        customerJTable.getColumnModel().getColumn(3).setResizable(false);

        deleteJButton.setText("Delete");
        deleteJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                deleteJButtonActionPerformed(evt);
            }
        });

        doneJButton.setText("Exit");
        doneJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                doneJButtonActionPerformed(evt);
            }
        });

        jLabel11.setText("<html><font size=+3>Search Customers</font></html>");

        editJButton.setText("Edit");
        editJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                editJButtonActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(editJButton)
                        .addGap(18, 18, 18)
                        .addComponent(deleteJButton)
                        .addGap(18, 18, 18)
                        .addComponent(doneJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(searchSelectorJTabbedPane, GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 354, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(searchSelectorJTabbedPane, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(doneJButton)
                    .addComponent(deleteJButton)
                    .addComponent(editJButton))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        
        populateTable();
        
        
    }

    
    /**
     * Populates the table with the Customers from the database
     * 
     */
    private void populateTable() {

        int row = 0;
        
        //Obtain an iterator of the Customer database
        Iterator it = customerDatabase.getHashMap().entrySet().iterator();
        
        while (it.hasNext()) {
            Entry thisEntry = (Entry) it.next();
            Object value = thisEntry.getValue();
            
            try {
                Customer c = (Customer) value;
                customerJTable.setValueAt(c.getFirstName(), row, 0);
                customerJTable.setValueAt(c.getLastName(), row, 1);
                customerJTable.setValueAt(c.getBirthYear(), row, 2);
                customerJTable.setValueAt(c.getIncome(), row, 3);
                row++;
                
            } catch (Exception e) {}
         
        }
        
        
        
        
    }
    
    /**
     * 'Search by Name' button action
     * 
     * Updates the table with the customer that matches the firstNameJTextField + lastNameJTextField
     * or prompts that the customer does not exist.
     */
    private void searchNameJButtonActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * 'Search by Birth Year' button action
     * 
     * Updates the table with the customers that match the search
     */
    private void searchYearJButtonActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

     /**
     * 'Search by Income' button action
     * 
     * Updates the table with the customs that matche the search
     */
    private void searchIncomeJButtonActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    
     /**
     * 'Search by Birth Year and Income (Advanced)' button action
     * 
     * Updates the table with the customers that matche the search
     */
    private void searchAdvancedJButtonActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * 'Search by query file' button action
     * 
     * Opens a JFileChooser and asks the user to select the query file
     * Prompts if there is a problem reading the query file
     * Updates the table with customers that match the query file.
     * 
     */
    private void chooseQueryFileJButtonActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * 'Edit' button action.
     * 
     * If there is nothing in the table selected this should be disabled.
     * It will pass the currently selected customer into the 'Create Customer' form.
     * 
     */
    private void editJButtonActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    
    /**
     * 'Delete' button action.
     * 
     * If there is nothing in the table selected this should be disabled.
     * It will prompt to confirm the deletion of the selected customer before
     * removing the customer and updating the database.
     * 
     */
    private void deleteJButtonActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    
    /**
     * 'Done' button action.
     * 
     * Invokes the main menu and sets the current frame invisible
     */
    private void doneJButtonActionPerformed(ActionEvent evt) {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu(customerDatabase).setVisible(true);
            }
         });
         
         setVisible(false);
                 
    }

}

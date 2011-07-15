import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;


/**
 * CustomerCollection is responsible for reading and writing to the database.
 * It creates the customer objects with the data from the file and
 * stores every customer in a HashMap.
 * 
 * The key for each customer value is:  firstName + lastName
 * 
 * This class uses generics so it is only compatible with JDK6 or greater.
 * 
 * @author Chris Lowe
 * @version pre-alpha
 */
public class CustomerCollection
{

    // Customer objects are stored in a hashmap
    // the key for each customer value is:  firstName + lastName
    private HashMap<String, Customer> customerCollection = new HashMap<String, Customer>();

    private static final String DATABASE_FILE = "customers.dat";

    private int customerCount = 0;
    
 
    
    /**
     * Returns the number of customers in the database
     * 
     */
    public int getCustomerCount() {
        return this.customerCount;
    }
    
    public HashMap<String, Customer> getHashMap() {
        return this.customerCollection;
    }
         
    
    /**
     * Increases the customerCount property. I needed this bounds check
     * because of the 1,000,000 customers restriction in the project requirements
     * 
     */
    private void incrementCustomerCount() {
        customerCount++;
        if (customerCount > 1000000) {
            String errorMessage = "Congradulations, you have over 1,000,000 customers! " + 
                    "Unfortunately, this has broken the database and the program must exit.";
            JOptionPane errorDialog = new JOptionPane();
            JOptionPane.showMessageDialog(errorDialog, errorMessage);
            System.exit(0);
        }
    }
    
    /**
     * Returns the individual customer in the database with the key
     * firstName + lastName or null if the customer does not exist.
     * 
     */
    public Customer getCustomer(String key) {
        return customerCollection.get(key);
    }
    
    /**
     * Adds a new customer to the collection and updates the database file.
     * 
     */
    public void addCustomer(Customer c) {
        String key = c.getFirstName() + c.getLastName();
        if (customerCollection.containsKey(key)) {
            //Occurs when attempting to create a duplicate of an existing customer.
            //This should probably throw an InvalidCustomerException but I decided
            //it would be easier for the GUI if this class handled all these types of exceptions.
            String errorMessage = "A customer already exists with the name: " + c.getFirstName() + " " + c.getLastName();
            JOptionPane errorDialog = new JOptionPane();
            JOptionPane.showMessageDialog(errorDialog, errorMessage);
        } else {
            customerCollection.put(key, c);
            incrementCustomerCount();
        }
        
        writeDatabase();        
    }
    
    
    /**
     * Deletes a customer from the collection and updates the database file.
     * 
     */
    public void deleteCustomer(Customer c) {
        String key = c.getFirstName() + c.getLastName();
        if (customerCollection.containsKey(key)) {
           customerCollection.remove(key);
        } else {
            //Should not occur because it will be generated by the GUI.
            //May occur if the database file is edited between reads
            String errorMessage = "Could not remove customer with the name " + c.getFirstName() + " " + c.getLastName();
            JOptionPane errorDialog = new JOptionPane();
            JOptionPane.showMessageDialog(errorDialog, errorMessage);
        }
    }
    
    /**
     * Reads the contents of the database file and populates the hashmap
     * 
     */
    public void readDatabase() {
        try {
            
            //Open the database file for reading
            FileInputStream fstream = new FileInputStream(DATABASE_FILE);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
 
            //read every line in the database, create a Customer object and add to the hashmap
            while ((strLine = br.readLine()) != null) {
                
                if ((strLine.equals(". . 0 0")) || (strLine.equals(". . 0 0\n"))) {
                    break;  //stop reading if we encounter the EOF as stated in the project requirements
                }
    
                incrementCustomerCount(); //test for the < 1,000,000 customer requirement
                
                try {
                    Customer c = new Customer(strLine);
                    String key = c.getFirstName() + c.getLastName();
                    customerCollection.put(key, c);
                    
                } catch (InvalidCustomerException e) {
                    //Thrown by the Customer constructor and will
                    //occur if an entry in the database file is corrupted.
                    JOptionPane errorDialog = new JOptionPane();
                    JOptionPane.showMessageDialog(errorDialog, e.getMessage());
                                        
                }
            }
  
            in.close();
        
        } catch (FileNotFoundException e ) {
            //Occurs when the database file is misplaced or deleted
            JOptionPane errorDialog = new JOptionPane();
            JOptionPane.showMessageDialog(errorDialog, "The database file could not be found. It may have been deleted or misplaced.");
            System.exit(0);

        } catch (IOException e){
            //Occurs when the system IO fails or is interrupted
            JOptionPane errorDialog = new JOptionPane();
            JOptionPane.showMessageDialog(errorDialog, "The database file could not be read. The system's IO failed to access the file.");
            System.exit(0);    
            
        } 
                       
    }
    
    
    /**
     * Writes the contents of the hashmap to the database file, overwriting the original
     * 
     */
    public void writeDatabase() {
        
        //Prepare the hashmap for iteration
        Set customerSet = customerCollection.entrySet();
        Iterator iterator = customerSet.iterator();
        String writeLine;
  
        
        try {
            //Open the database file for writing
            FileWriter fstream = new FileWriter(DATABASE_FILE);
            BufferedWriter out = new BufferedWriter(fstream);
        
            while (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry)iterator.next();
                writeLine = entry.getValue().toString();
                out.write(writeLine);            
            }
        
        out.write(". . 0 0");  //EOF deliminator as per specifications
        
        out.flush();
        fstream.flush();
        fstream.close();
        out.close();  //Clean up after the write
        
       } catch (IOException e){
            //Occurs when the system IO fails or is interrupted
            JOptionPane errorDialog = new JOptionPane();
            JOptionPane.showMessageDialog(errorDialog, "The database file could not be read. The system's IO failed to access the file.");
            System.exit(0);    
       } 
    }
    
        
    /**
     * A helper function used to view the collection
     * TODO: delete
     */
    public void printAllCustomers() {
        Set customerSet = customerCollection.entrySet();
        Iterator i = customerSet.iterator();
        while (i.hasNext()) {
            System.out.println(i.next().toString());
            //basically, for each key print value
        }
    }
}
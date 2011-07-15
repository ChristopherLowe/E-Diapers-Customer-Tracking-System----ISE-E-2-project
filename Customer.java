/**
 * Customer.class represents a Customer of the E-Diapers customer tracking system
 * 
 * The details of the customer are stored in a plaintext file with 
 * white space deliminating the fields. It is in the format:
 * 
 *    firstName lastName birthYear income
 *    
 * The last entry in the file is
 * 
 *    . . 0 0
 * 
 * @author Christopher Lowe
 * @version pre-alpha
 */
public class Customer
{
   
    /*
     * Properties
     */
    private String firstName;
    private String lastName;
    private int income;
    private int birthYear;
    
    /*
     * Getters
     */
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public int getIncome() {
        return income;
    }
    
    public int getBirthYear() {
        return birthYear;
    }

    
    /*
     * Setters
     */
    public void setFirstName(String firstName) throws InvalidCustomerException {
        if (firstName.length() < 1) {
            throw new InvalidCustomerException("First name cannot be less than 1 character long");
        } else if (firstName.length() > 40) {
            throw new InvalidCustomerException("First name cannot be longer than 40 characters");
        } else {
            this.firstName = firstName.toLowerCase();
        }
    }
    
    public void setLastName(String lastName) throws InvalidCustomerException {
        if (lastName.length() < 1) {
            throw new InvalidCustomerException("Last name cannot be less than 1 character long");
        } else if (lastName.length() > 40) {
            throw new InvalidCustomerException("Last name cannot be longer than 40 characters");
        } else {
            this.lastName = lastName.toLowerCase();
        }
    }
    
    public void setIncome(int income) throws InvalidCustomerException {
        if (income < 0) {
            throw new InvalidCustomerException("Income cannot be less than 0");
        } else if (income > 1000000000) {
            throw new InvalidCustomerException("Income cannot be greater than 100,000,000");
        } else {
            this.income = income;
        }
    }
    
    public void setBirthYear(int birthYear) throws InvalidCustomerException {
        if (birthYear < 1800) {
            throw new InvalidCustomerException("Year of birth cannot be before 1800");
        } else if (birthYear > 2000) {
            throw new InvalidCustomerException("Year of birth cannot be after 2000");
        } else {
            this.birthYear = birthYear;
        }
    }
    
    
    /**
     * The toString() method has special meaning in this application because 
     * the CustomerCollection class will use it to read and write to the database file.
     * 
     * In addition, the Customer class must be able to create an instance of itself using
     * the output of this method.
     * 
     * @return String that can be read/written to the database file representing the customer
     */
    public String toString() {
        StringBuffer b = new StringBuffer();
        b.append(firstName);
        b.append(" ");
        b.append(lastName);
        b.append(" ");
        b.append(birthYear);
        b.append(" ");
        b.append(income);
        b.append("\n");
        return b.toString(); 
        //I opted to use this lengthy approach to make it easy to modify in the future
        
    }

    /**
     * Customer constructor using the string returned by Customer.toString() 
     * 
     * @param String customerString
     */
    public Customer(String customerString) throws InvalidCustomerException
    {
        //Use whitespace to split the string into fields
       String[] stringSplit = customerString.split(" ");
       setFirstName(stringSplit[0]);
       setLastName(stringSplit[1]);
       
       try {
           setBirthYear(new Integer(stringSplit[2]).intValue());
           setIncome(new Integer(stringSplit[3]).intValue());
       } catch (NumberFormatException e) {
           throw new InvalidCustomerException("Customer data file was corrupted");
           //This will only occur when the database file has alphabetic characters
           //manually placed in the birthYear or incomeField. I decided it was better
           //to throw an InvalidCustomerException alert if this was to ever occur.
       }
    }
    
    /**
     * Customer constructor using individual fields. 
     * 
     * This will make things easier for the 'new customer' graphical interface 
     * because the alternative is to duplicate the functionality of Customer.toString()
     * in the display code. Instead, this constructor takes the individual fields
     * as a String. It will 
     * 
     */
    public Customer(String firstName, String lastName, String birthYear, String income) throws InvalidCustomerException  {
        setFirstName(firstName);
        setLastName(lastName);
        
        try {
            setBirthYear( Integer.parseInt(birthYear) );
        } catch (NumberFormatException e) {
            throw new InvalidCustomerException("The Birth year must be a number between 1800 and 2000.");
        }
        
        try {
            setIncome( Integer.parseInt(income) );
        } catch (NumberFormatException e) {
            throw new InvalidCustomerException("Income must be a number.");
        }
        
    }
    
}

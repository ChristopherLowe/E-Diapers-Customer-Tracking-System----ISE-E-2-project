/**
* InvalidCustomerException is caused by an attempt to create a customer
* with invalid details, such as a birthdate before 1800 or a name
* less than 1 character in length.
* 
* The message is used as an alert prompt in the graphical interface so it
* must be explain the cause of the exception is terms the user will understand.
* 
* @author Chris Lowe
*/
    
public class InvalidCustomerException extends Exception
{
    public InvalidCustomerException(String message)
    {
        super(message);
    }

}

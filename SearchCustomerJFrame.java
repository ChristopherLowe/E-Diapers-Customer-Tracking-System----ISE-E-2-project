import javax.swing.JFrame;

public class SearchCustomerJFrame extends JFrame
{
    
    private SearchCustomerForm searchCustomerForm;

  
    public SearchCustomerJFrame(CustomerCollection customerDatabase)
    {
        
        super("Search Customer");
        searchCustomerForm = new SearchCustomerForm(customerDatabase);
        
        getContentPane().add(searchCustomerForm);
        
        pack();
        setSize(500, 500);
        setVisible(true);
        
        
    }

}

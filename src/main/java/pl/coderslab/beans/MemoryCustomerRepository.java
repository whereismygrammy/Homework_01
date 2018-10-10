package pl.coderslab.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class MemoryCustomerRepository implements CustomerRepository{

    private List<Customer> customers = new ArrayList();

    private CustomerLogger customerLogger;

    @Autowired
    public void setCustomerLogger(@Qualifier("fileCustomerLogger") CustomerLogger customerLogger) {
        this.customerLogger = customerLogger;
    }

    @Override
    public void addCustomer(Customer customer){
        try {
        customerLogger.log(" Dodanu uzytkownika do listy");
        } catch (IOException e){
            e.printStackTrace();
        }
        customers.add(customer);
    }

    @Override
    public void removeCustomer(Customer customer){
        try {
        customerLogger.log(" Usunięto uzytkownika");
        } catch (IOException e){
            e.printStackTrace();
        }
        customers.remove(customer);
    }

    @Override
    public List<Customer> getCustomers() {
        try {
            customerLogger.log(" Przygotowano listę użytkowników");
        } catch (IOException e){
            e.printStackTrace();
        }
        return customers;


    }
}

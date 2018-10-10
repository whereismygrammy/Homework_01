package pl.coderslab.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.beans.*;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerLogger customerLogger = context.getBean("fileCustomerLogger", FileCustomerLogger.class);

        customerLogger.log(" Utworzono customer Logger");

        CustomerRepository customerRepository = context.getBean("memoryCustomerRepository", MemoryCustomerRepository.class);

        Customer c = context.getBean("customer", Customer.class);
        c.setFirstName("Tomasz");

        customerRepository.addCustomer(c);

        List<Customer> customers = customerRepository.getCustomers();

        for (Customer cust : customers){
            System.out.println(cust);
        }



    }
}

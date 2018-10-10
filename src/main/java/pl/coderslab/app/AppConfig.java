package pl.coderslab.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.coderslab.beans.Customer;
import pl.coderslab.beans.FileCustomerLogger;
import pl.coderslab.beans.MemoryCustomerRepository;
import pl.coderslab.beans.SimpleCustomerLogger;

@Configuration
public class AppConfig {
    @Bean
    public SimpleCustomerLogger simpleCustomerLogger() {
        return new SimpleCustomerLogger();
    }

    @Bean
    public FileCustomerLogger fileCustomerLogger(){
        return new FileCustomerLogger();
    }

    @Bean
    public MemoryCustomerRepository memoryCustomerRepository(){
        return new MemoryCustomerRepository();
    }

    @Bean
    public Customer customer(){
        return new Customer();
    }

    @Bean
    public String filename(){
        return "logFile.txt";
    }

}

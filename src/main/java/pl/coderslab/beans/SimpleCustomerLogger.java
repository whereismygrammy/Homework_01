package pl.coderslab.beans;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class SimpleCustomerLogger implements CustomerLogger {
    @Override
    public void log() {
        String time = LocalDateTime.now().toString();
        System.out.println(time + ": Customer operation");
    }

    public void log(String s) {
        String time = LocalDateTime.now().toString();
        System.out.println(time + s);
    }
}

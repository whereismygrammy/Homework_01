package pl.coderslab.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Component
public class FileCustomerLogger implements CustomerLogger {

    private String filename;

    public FileCustomerLogger() {
    }

    public FileCustomerLogger(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    @Autowired
    public void setFilename(String filename) {
        this.filename = filename;
    }


    @Override
    public void log() {

        try {
            FileWriter writer = new FileWriter(filename, true);
            writer.write("Zapis logu bez treści" + "\n");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void log(String s){
        try {
            FileWriter writer = new FileWriter(filename, true);
            writer.write("" + s + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

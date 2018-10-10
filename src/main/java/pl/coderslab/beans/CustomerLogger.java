package pl.coderslab.beans;

import java.io.IOException;

public interface CustomerLogger {
    void log() throws IOException;
    void log(String s) throws IOException;
}

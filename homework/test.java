// Java program to demonstrate
// Logger.addHandler() method
 
import java.util.logging.*;
import java.io.IOException;
 
public class test {
 
    private static Logger logger
        = Logger.getLogger(
            test.class.getName());
 
    public static void main(String args[])
        throws SecurityException, IOException
    {
 
        // Create a file handler object
        FileHandler handler = new FileHandler("logs.txt");
 
        // Add file handler as
        // handler of logs
        logger.addHandler(handler);
 
        // Log message
        logger.info("This is Info Message ");
        logger.log(Level.WARNING,
                   "Warning Message");
    }
}
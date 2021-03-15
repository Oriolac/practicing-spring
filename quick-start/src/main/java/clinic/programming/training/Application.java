package clinic.programming.training;

import java.util.ArrayList;
import java.util.List; 
import org.apache.commons.lang3.StringUtils;

public class Application {

    public Application() {
        System.out.println("Inside Application");
    }

    public int countWords() {
        String[] str = StringUtils.split("hello");
        return str.length;
    }

    public void greet() {
        String[] str = StringUtils.split("hello");
        System.out.println(str.toString());
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	    Application app = new Application();
        app.greet();
        int count = app.countWords();
    }
}

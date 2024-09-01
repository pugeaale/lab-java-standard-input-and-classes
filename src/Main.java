import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = null;
        try {
            employee1 = new Employee("salvatore", "salvatore.c@ironhack.com", 35, 205000 );
            System.out.println(employee1);
            Intern intern1 = new Intern("giuseppe","g.corleone",18,20000);
            System.out.println(intern1);
            Intern intern2 = new Intern("carlinda","c.dasilva",19,20001);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        try {
            FileWriter file = new FileWriter("employees.txt", true);
            file.write(employee1.toString());
            file.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

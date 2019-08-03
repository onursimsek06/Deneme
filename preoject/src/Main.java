import java.util.Scanner;

public class Main {

        public static void main (String args[]){
                Employee employee = new Employee();
                System.out.println("Before :");
                employee.set_default();
                employee.print_fields();
                employee.setId(1);
                employee.setName("Onur");
                employee.setEmail("onursimsek0643@gmail.com");
                System.out.println(employee.getId());
                System.out.println(employee.getName());
                System.out.println(employee.getEmail());
                Employee employee2 = new Employee();
                employee2.setId(189);
                employee2.setName("Ahmet");
                employee2.setEmail("ahmet@gmail.com");
                System.out.println(employee2.getId());//100 olacak
                System.out.println(employee2.getName());
                System.out.println(employee2.getEmail());


        }

}

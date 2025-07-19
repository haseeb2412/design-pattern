// advantages
// focus on creating object for interface rather than implementation
// loose coupling more robost code  ( dont  know where the object creating )


// chatgpt
// Creates objects without exposing the creation logic
// Returns objects of a common parent class or interface
// Helps achieve loose coupling between client and implementation classes
// Makes the code more flexible, scalable, and easy to maintain
// Allows easy addition of new object types with minimal code changes




package factory;

public class DeveloperClient {

    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee("ANDROID DEVELOPER");
        System.out.println(employee);
        int s1 = employee.Salary();
        System.out.println("salary 01:" + s1);

        Employee employee2 = EmployeeFactory.getEmployee("WEB DEVELOPER");
        System.out.println(employee2);
        int s2 = employee2.Salary();
        System.out.println("salary 01:" + s2);


    }
}

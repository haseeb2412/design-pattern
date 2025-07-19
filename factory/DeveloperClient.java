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

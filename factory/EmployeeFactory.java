package factory;

public class EmployeeFactory {
    // get the employee 
    public static Employee getEmployee(String emptype){
        if(emptype.trim().equalsIgnoreCase("ANDROID DEVELOPER")){
            return new AndroidDeveloper();
        }else if(emptype.trim().equalsIgnoreCase("WEB DEVELOPER")){
            return new WebDeveloper();
        }else{
            return null;
        }
    } 
}

public class AEmployeeFactory {


    // get employee 
    // public static AEmployee getEmployee(AEmployeeAbstractFactory factory){
    //     return factory.createEmployee();
    // }

    public static AEmployee getEmployee(AEmployeeAbstractFactory factory) {
        return factory.createEmployee(); // ✅ correct call
    }
}

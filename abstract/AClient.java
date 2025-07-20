public class AClient {
    public static void main(String[] args) {
        



        //  get android developer

        AEmployee e1 = AEmployeeFactory.getEmployee(new AAndroidDevFactory());
        e1.name();
        e1.Salary();

        AEmployee e2 = AEmployeeFactory.getEmployee(new AWebDevFactory());
        e2.name();
        e2.Salary();
    }
}

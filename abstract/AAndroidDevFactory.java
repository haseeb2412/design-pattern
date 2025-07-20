public class AAndroidDevFactory extends  AEmployeeAbstractFactory {

    @Override
    public AEmployee createEmployee(){
        return new AAndroidDeveloper();
    }
    
}

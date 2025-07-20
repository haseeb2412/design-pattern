public class AWebDevFactory extends  AEmployeeAbstractFactory {
    @Override
    public AEmployee createEmployee(){
        return new AWebDeveloper();
    }
}

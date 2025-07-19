// cons
// object create either it is required or not




public class Areeb{
    private static Areeb areeb = new Areeb();


    // private Areeb(){
    //     System.out.println("our constructor");
    // }

    // eager way to creating object 
    public static Areeb getInstance(){
        return  areeb;
    }
}
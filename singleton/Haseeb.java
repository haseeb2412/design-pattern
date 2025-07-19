
// create privare constructor  ( so user cant create multiple objects )
//  
// if you want to use and variable in static method you should also use a static variable ( if you wanted to use it without an object )
public class Haseeb {

    // static varaible
    private static Haseeb haseeb;

    // constructor
    private Haseeb() {

    }

    // lazy way of creating object 
    //  cons
    //  we have to used synchronized block instead of using synchorinization method
    // multithreading issue (If two threads access the code at the same time, they may both create objects, resulting in multiple instances.)
    // if single thread nothing to worry about

    // using reflection API we can breal the method by dynamically changing the private to public and create multiple objects
    public static Haseeb getInstance() {
        //object of this class

        // if (haseeb == null) {    // make sure that object will create once
        //     haseeb = new Haseeb();
        // }
        // return haseeb;
        // with concern of multithreading
        if (haseeb == null) {
            synchronized (Haseeb.class) {
                if (haseeb == null) {
                    haseeb = new Haseeb();
                }
            }
        }

        return haseeb;
    }
}

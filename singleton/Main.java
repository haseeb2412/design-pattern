// Chatgpt

// Ensures a single instance of a class is created throughout the application.
// Acts as a global access point to that instance.
// Supports lazy initialization to create the instance only when needed.
// Can be made thread-safe for use in multi-threaded applications.
// Helps reduce memory usage by avoiding repeated object creation.
// Provides centralized control over a shared resource or service.




// course 
// like is used to connect withh the datababase ( only one time run )





public class Main{
    public static void main(String[] args) {
        // new Haseeb();   ( we can call it multiple times so that why we have to create private constructor )



        // create new object and get the same object thats what our aim is
        Haseeb haseeb = Haseeb.getInstance();
        System.out.println(haseeb.hashCode());
        
        Haseeb haseeb2 = Haseeb.getInstance();
        System.out.println(haseeb2.hashCode()); 


        // eager way of calling     
        System.out.println(Areeb.getInstance().hashCode());
        System.out.println(Areeb.getInstance().hashCode());
    }
}
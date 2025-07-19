package singletonb;

public class Main {

    public static void main(String[] args) {


        // ******************************************************


        // Breaking the singleton design pattern
        // 1. Using Reflection API 
        //  solution: if object is there ==> throw exception from inside the constructor
        // solution (enum)
        // 2. desirialization
        // solution readResolve method
        //  cloning





        // **********************************************************


        // Haseeb h1 =new getInstance();
        // System.out.println(h1.hashCode());
        // Constructor<Haseeb> constructor = Haseeb.class.getDeclaredConstructor();
        // // change the instance private to public
        // constructor.setAccessible(true);
        // Haseeb h2 = constructor.newInstance();
        // System.out.println(h2.hashCode());
        // solution number 02 (enum);
        //  Haseeb h1 =Haseeb.INSTANCE;
        // System.out.println(h1.hashCode());
        // s1.test();
        // Constructor<Haseeb> constructor = Haseeb.class.getDeclaredConstructor();
        // // change the instance private to public
        // constructor.setAccessible(true);
        // Haseeb h2 = constructor.newInstance();
        // System.out.println(h2.hashCode());



        //  desirialization


        // Haseeb haseeb = Haseeb.getInstance();
        // System.out.println(haseeb.hashCode());
        // ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.obj"));
        // oos.writeObject(oos);

        // System.out.println("serialization done");

        // ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("abc.obj"));
        // Haseeb h2 = (Haseeb) ois.readObject(oos);
        // System.out.println(h2.hashCode());

    }

}

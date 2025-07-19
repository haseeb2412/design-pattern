package singletonb;
// package design-pattern.singletonb;

// public class Haseeb {
//     private static Haseeb haseeb;
//     private Haseeb() {
//         if (haseeb != null) {
//             throw new RuntimeException("you are already trying to break singleton pattern");
//         }
//     }
//     public static Haseeb getInstance() {

//         if (haseeb == null) {    
//             haseeb = new Haseeb();
//         }
//         return haseeb;
//     }
// }



// solution number 02 ( enum )


// public enum Haseeb {
//     INSTANCE
//     // private static Haseeb haseeb;
//     // private Haseeb() {
//     //     if (haseeb != null) {
//     //         throw new RuntimeException("you are already trying to break singleton pattern");
//     //     }
//     // }
//     // public static Haseeb getInstance() {

//     //     if (haseeb == null) {    
//     //         haseeb = new Haseeb();
//     //     }
//     //     return haseeb;
//     // }

//     public void test(0{
//         System.out.println("testing");
//     })
// }




// for desirialization


public class Haseeb implements Serializable {
    
    private static Haseeb haseeb;
    private Haseeb() {
        
    }
    public static Haseeb getInstance() {

        if (haseeb == null) {    
            haseeb = new Haseeb();
        }
        return haseeb;
    }

    @Override
    public Object readResolve(){
        return haseeb;
    }
}

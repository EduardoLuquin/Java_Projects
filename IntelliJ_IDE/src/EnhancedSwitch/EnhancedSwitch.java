package EnhancedSwitch;

import java.util.Scanner;

public class EnhancedSwitch {
    private static String yield;

    public static void main(String[] args) {
        //This is an example of enhanced switch in Java 12 and later
        var console = new Scanner(System.in);

        System.out.println("Writte a number 1 to 4: ");
        var iDay = Integer.parseInt(console.nextLine());

     switch(iDay){
            case 1-> System.out.println("Case1") ;                      // breaks not needed
            case 2-> System.out.println("Case2") ;
            case 3,4,5-> {                                              //Multiples condition use ,
                System.out.println("More that one line use {}");
                System.out.println("Case3,4,5");
            }
            default-> System.out.println("Default");
        };                                                              //Enhanced sw needs;
        //yield ->Return value if the cases return values
    }
}

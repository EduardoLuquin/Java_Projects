package DataInput;

import java.util.Scanner;

public class DataInput {
    public static void main(String[] arg) {

        //Pare este ejercicio se estara usando metodo .nextInt, .nextDouble
        //Tipos de metodos no recomendados ya que no consumen el caracter salto de linea

        var scanner = new Scanner(System.in);

        System.out.print("Introduce un Edad: ");
        var iEdad = scanner.nextInt();
        System.out.println("Valor: " + iEdad);

        scanner.nextLine();//consumir salto de linea
        System.out.print("Introduce Nombre: ");
        var sNombre = scanner.nextLine();
        System.out.println("El nombre es: "+ sNombre);

        //Conversion de datos usando Parse
        //Tienen el objetivo de convertir la entrada de nextLine() al tipo que necesitamos asi convertir a su valor final
        System.out.print("Introduce valor entero: ");
        var iEntero = Integer.parseInt(scanner.nextLine());
        System.out.print("Introduce valor float: ");
        var fFlotante = Float.parseFloat(scanner.nextLine());
        System.out.println("Valor: "+ iEntero + " Flotante: %.2f".formatted(fFlotante)); //%.2 Sirve para dar formado, dos digitos despues del punto
        //System.out con formato, mas parecido a C
        // %.2f=tipo de valor y digitos despues del punto  %n salto de linea independite de plataforma
        System.out.printf("Variable flotante: %.2f%n", fFlotante);
    }
}

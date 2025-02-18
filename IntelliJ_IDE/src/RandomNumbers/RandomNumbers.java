package RandomNumbers;

import java.util.Random;
public class RandomNumbers {
    public static void main(String[] args) {

        var oRandom = new Random();

        //Numero entero aandom entre 0 al 9
        System.out.println("Entero entre 0-9: " + oRandom.nextInt(10));
        //Numero entero aandom entre 1 al 10
        System.out.println("Entero entre 1-10: " + (oRandom.nextInt(10)+1));
        //Numero flotante entre 0.0 y 1.0
        System.out.println("Flotante entre 0.0-1.0: " + oRandom.nextFloat());

        //Formato de cadenas y uso de printf  \s= Espacios en blanco \t= Tabulador %04d=decimal formato 4 digitos
        var sString = "Ejemplo de formato de cadenas";
        var oResult = oRandom.nextInt(10);
        var cResultado = """
                \n Uso de formato de cadenas\s
                *******************************
                \t Valor: %04d
                \t String: %s 
                """.formatted(oResult,sString);
        System.out.println(cResultado);

        //Directamente en un printf
        System.out.printf("""
                \n Uso de formato de cadenas\s
                *******************************
                \t Valor: %04d
                \t String: %s 
                """,oResult,sString);

        //Generador numeros Random con formato
        var iNumero = oRandom.nextInt(999)+1;
        var sResult = String.format("%06d",iNumero);
        System.out.println(" \n Con formato y Random: " + sResult);
    }
}

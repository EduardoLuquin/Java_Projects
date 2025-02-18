package StringMethods;

public class MetodosDeCadena {
    public static void main(String[] args) {
        var sCad1 = "Hola mundo";

        //Sacar tamaño de string
        System.out.println("Tamaño de cadena: " + sCad1.length());
        //Remplazar caracteres,quita todas las coincidencias y remplaza
        var sCad2 = sCad1.replace('o','a');
        System.out.println("Nueva cadena: " + sCad2);
        //Cadena a mayusculas
        System.out.println("Cadena a mayusculas: "+ sCad1.toUpperCase());
        //Cadena a minusculas
        System.out.println("Cadena a minusculas: "+ sCad1.toLowerCase());
        //Quita espacios inicio y final de una cadena
        var sCad3 = "   Hola  Adios   ";//los intermedios no los quita
        System.out.println("Cadena de espacios: "+ sCad3);
        System.out.println("Cadena trim: "+ sCad3.trim());
        //Obtener subcadenas
        var sCad4 = "Hola mundo";
        System.out.println("Cadena orginal:" +sCad4);
        System.out.println("Cadena subcadena:" +sCad4.substring(5)); //forma 1
        System.out.println("Cadena subcadena:" +sCad4.substring(5,10));//forma 2
        //Busqueda de subcadenas, regresa el indice solo de la primera aparicion
        var sCad5 = "Hola Mundo Mundo Hola";
        System.out.println("Primera aparicion de Hola:" + sCad5.indexOf("Hola"));
        System.out.println("Ultima aparicion de Mundo:" + sCad5.lastIndexOf("Mundo"));
        System.out.println("Aparicion de Perro:" + sCad5.indexOf("Perro"));
        //Remplazar subcadenas(Mismo metodo que caracteres)
        System.out.println("Remplazo de  Hola x Eduardo: " + sCad5.replace("Hola","Eduardo"));

        //Metodos de concatenacion de cadenas
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        //concat: No es muy eficiente, cada concatenacion crea una cadena nueva, mucha memoria
        System.out.println("Resultado concat: " + cadena1.concat(" ").concat(cadena2));
        //String builder, tipo de objeto que solo crea uno la primera vez y agrega por medio de append.Mas eficiente
        var stringBuilder = new StringBuilder();
        System.out.println("Resultado StringBuilder: " + stringBuilder.append(cadena1).append(" ").append(cadena2));
        //String buffer, tipo de objeto que solo crea uno la primera vez y agrega por medio de append.Ideal para multihilos
        var sBuffer = new StringBuffer();
        System.out.println("Resultado StringBuffer: " + sBuffer.append(cadena1).append(" ").append(cadena2));

        //Caracteres especiales \n= espacio \t= tabulador \'= comilla simple \"= Comilla doble \\= diagonal invertida
        System.out.println(" \n\n Caracteres \n Especiales \' \" \\ ");

    }
}

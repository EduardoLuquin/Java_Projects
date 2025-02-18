package Variables;

public class Variables {
    public static void main(String[] args) {

        //Tipos de datos

        //Enteros (Valor default 0)
        byte bByte = 127;
        //Imprimir cadena + variable. Operador funciona como concatenador de cadenas
        System.out.println("Variable Byte = " + bByte );
        //16bits
        short sShort = 32000;
        System.out.println("Variable short = " + sShort );
        //32bits
        int iInt = 2147483647;
        System.out.println("Entero = "+ iInt);
        //64bits agrega L mayuscula al final
        long lLong = 987654321098765432L;
        System.out.println("Long = "+ lLong);

        //Punto flotante indico F al final, sin F por default es de tipo doble 32 bits (Valor default 0.0)
        float fFloat = 3.14F;
        System.out.println("float = "+ fFloat);
        //64bits
        double dDouble = 3.14168080D;
        System.out.println("Double = "+ dDouble);

        //Caracter (Valor default '\u0000')
        char cChar = 'A'; //Juego de caracteres unicode
        System.out.println("Char = " + cChar);
        cChar = 65; //Su valor en hexa
        System.out.println("Char = " + cChar);

        //Boolean (Valor default false)
        boolean bBoolean = true;
        System.out.println("boolean = " + bBoolean);

        //string o Object (Valor default null)
        String sString = "Mi string";
        System.out.println("string = " + sString);

        //Tipo var, fue introducido en Java 10
        var sNombre = "Eduardo";
        var iEdad = 34;
        var bActividad = true;

        //String con mucho texto
        var stringL = """
                Toda esta es la capacidad 
                del string
                """;
        System.out.println("Cadena larga:"+stringL);

        //Otra manera de inicializar string
        var stringAsObj = new String("Cadena inicializada como objeto");
        System.out.println("Cadena con new string: "+ stringAsObj);

        //***********Manejo de indices en una cadena*************************/
        String sCadena = "Recupera indice";
        char cCaracter = sCadena.charAt(14); //Recupera el caracter del index
        System.out.println("*****Manejo de indices en una cadena*****");
        System.out.println("Caracter del index: " + cCaracter);

        //***********Inmutabilidad de una cadena*************************/
        var sCadena1 = "Cadena inicial"; //se crea en el heap
        sCadena1 = "Nueva cadena"; //la referencia anterior se pierde sCadena1, un nuevo string se crea en el Heap
        System.out.println("*****Inmutabilidad de una cadena*****");
        System.out.println("Valor final de sCadena1: "+ sCadena1);

        //***********Comparacion pools de cadenas*************************/
        var sCad1 = "Java";
        var sCad2 = "Java";  //sCad1 y sCad2 al ser igual contenido solo crea un objeto en HEAP el contenido lo manda a un Pool de cadenas
        var sCad3 = new String("Java"); //El metodo new forza a crear un nuevo objeto en HEAP aunque el contenido sea igual

        //Operador == sirve para comparar referencias
        System.out.println("*****Comparacion y pools de cadenas*****");
        System.out.print("Comparacion sCad1 vs sCad2 por referencia: ");
        System.out.println(sCad1==sCad2); //misma referencia
        System.out.print("Comparacion sCad1 vs sCad3 por referencia: ");
        System.out.println(sCad1==sCad3); //Diferente referencia

        //Operador equals para comparar contenidos
        System.out.print("Comparacion sCad1 vs sCad2 por contenido: ");
        System.out.println(sCad1.equals(sCad2)); //misma contenido
        System.out.print("Comparacion sCad1 vs sCad3 por contenido: ");
        System.out.println(sCad1.equals(sCad3)); //mismo contenido
    }
}

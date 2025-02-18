package Arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        var console = new Scanner(System.in);
        //Declaration stored in Stack
        int[] integers;
        //Initialization, objects stored in Heap
        integers = new int [5];
        //Array with initialization
        int[] integersInit = {100,200,300,400,500};

        System.out.println("Array Memory: " + integersInit);
        System.out.println("Array ItemX: " + integersInit[0]);
        System.out.println("Array Size: " + integersInit.length);

        System.out.println("Give array size:");
        int iSize = Integer.parseInt(console.nextLine());
        var newIntegers = new int[iSize];

        for(var i=0; i<newIntegers.length;i++)
        {
            System.out.println("Give value for index" + i + ":");
            newIntegers[i] = Integer.parseInt(console.nextLine());
        }

        for(var i=0; i<newIntegers.length;i++)
            System.out.println("Your array" + newIntegers[i] );

        //Matrix
        final int ROWS = 2;
        final int COLUMNS = 3;
        //int[][] mMatrix = new int [5][5]; ////Declaration option1
        var mMatrix1 = new int[5][5];

        for(var i=0; i<ROWS; i++)
        {
            for(var j=0; j<COLUMNS;j++)
            {
                System.out.println("["+i+"]"+","+"["+j+"]");
            }
        }

        //Simplified sintax for matriz
        var mMatrix2 = new int[][]{ {1,2},{4,5},{6,7} };
        //Get columns
        System.out.println("Matrix columns:"+mMatrix2.length);
        //Get rows
        System.out.println("Matrix rows:"+mMatrix2[0].length);


    }
}

package Functions;

public class Functions {

    static void vMyfunction(String sSting)//Declaration and implementation. It shall be static!
    {
        System.out.println(sSting + "vMyfunction() shall be static!");
    }

    static void vRecursive(int iParameter)
    {

        if (iParameter == 1)//Break recursive call
        {
            System.out.println("Bye vRecursive()" +iParameter);
        }
        else
        {
            System.out.println("vRecursive()" + iParameter);
            vRecursive(iParameter-1);
        }
    }
    public static void main(String[] args) {
        vMyfunction("Calling: ");
        //Calling recursive function
        vRecursive(5);
    }
}

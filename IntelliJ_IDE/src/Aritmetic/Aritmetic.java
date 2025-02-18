/*This code has the purpose to explain the "this operator" usage. Same as C++!*/
package Aritmetic;

public class Aritmetic {

    int mOper1;
    int mOper2;
    //Custom Constructor
    public Aritmetic(int opt1, int opt2){
        System.out.println("Constructor Execution");
        //Equivalent to mOper1 = opt1;
        //this operator just valid inside de class! It's good practice.
        this.mOper1 = opt1;
        this.mOper2 = opt2;

        //Confirm "this" points to Object in execution
        System.out.println("Memory address for this: "+ this);
    }

    public static void main(String[] args) {
        System.out.println("Object creation");
        var oAritmetic1 = new Aritmetic(10,20);
        System.out.println("Memory address: Obj1"+ oAritmetic1);

        var oAritmetic2 = new Aritmetic(30,40);
        System.out.println("Memory address: Obj2"+ oAritmetic2);
    }

}

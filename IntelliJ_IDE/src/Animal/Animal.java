/*This code has the purpose to explain the "Inheritance and Polymorphism" usage*/
package Animal;

/* Restriction levels
    public
    protected
    default
    private
 */

public class Animal {
    //modifier protected is accessible for child objects.
    //modifier private is not accessible for child objects.
    protected void eat(){
        System.out.println("eat action");}

    protected void sleep(){
        System.out.println("sleep action");}

    protected  void makeSound(){
        System.out.println("Generic Sound");
    }
}

//"Use extends to define inheritance"
class Dog extends Animal{
    protected void makeSound(){
        System.out.println("Bark");
    }
    //overrides method, same access identifier
    protected void sleep(){
        System.out.println("sleep as a Dog");
        //"super" lets to access to the super class method. Different to C++!
        super.sleep();
    }
}

class Cat extends Animal {
    protected void makeSound() {
        System.out.println("Meow");
    }
}



class testAnimal{

    //Polymorphic method
    static void sendSound(Animal oAnimal){
        oAnimal.makeSound();
    }

    public static void main(String[] args) {
        System.out.println("*** Inheritance Example ***");

        var oAnimal1 = new Animal();
        oAnimal1.eat();
        oAnimal1.sleep();

        System.out.println("*** Dog object ***");
        var oDog1 = new Dog();
        oDog1.eat();
        oDog1.makeSound();  //Applying Polymorphism concept
        oDog1.sleep();

        System.out.println("*** Cat object ***");
        var oCat1 = new Cat();
        oCat1.makeSound(); //Applying Polymorphism concept

        //Using  Polymorphic method
        System.out.println("*** Print Sound for objects using  Polymorphic method ***");
        sendSound(oAnimal1);
        sendSound(oDog1);
        sendSound(oCat1);
    }
}

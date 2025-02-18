package ObjectCreation;

public class ObjectCreation { //In Java just one class can be public
    //Not "var" attributes allowed
    String sName;
    String sLastName;

    //Method constructor is created by default if is not defined. Just for empty constructor.
    void vPrintPerson(){
        System.out.println("Name:"+ sName);
        System.out.println("Last Name:"+ sLastName);
    }

    public static void main(String[] args) {

        System.out.println("***Object Creation***");
        var oObject1 = new ObjectCreation();
        oObject1.sName = "Eduardo";
        oObject1.sLastName = "Luquin";
        oObject1.vPrintPerson();
    }
}

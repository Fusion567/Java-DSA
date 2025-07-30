//Abstraction
abstract class Animal{
    abstract void walk();
    //non-abstract methods
    public void eats(){
        System.out.println("Animal Eats");
    }

    Animal(){
        System.out.println("You are creating a new animal");
    }
}

class Cow extends Animal{
    Cow(){
        System.out.println("Cow is created");
    }
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Hen extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}
public class Abstract {
    public static void main(String[] args) {
        Cow cow = new Cow();
        Hen hen = new Hen();
        cow.walk();
        hen.walk();
        hen.eats();

        /*To check abtstraction , genreally occurs at run time
        Animal animal = new Animal();
        animal.walk();
        */

    }
}

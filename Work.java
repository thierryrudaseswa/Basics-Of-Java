class Animal{
    void makeSound(){
        System.out.println("make asound");
    }
}
// upcasting
class Dog extends Animal{
    void makeSound(){
        System.out.println("barking Dog");
    }
}

public class Work{
    public static void main(Main[] args){

        // upcasting
        Animal animal = new Dog();
        animal.makeSound();

        // Dog dog
// downcasting
        Dog dog = (Dog) animal;
        dog.makeSound();
    }

}
// class reference type
class Car {
    String name;
    int year;    

    // Each Car object will have its own name and year.

    // constructor to initialize objects
    Car(String name, int year) {
        this.name = name;
        this.year = year;
    }

    void display() {
        System.out.println("Name: " + name + "   Year: " + year);
    }
}

// Interface Animal
interface Animal {
    void sound();
}

class Dog implements Animal { //a class that implements the interface
    public void sound() {
        System.out.println("Woof");
    }
}


public class Types {

    public static void main(String[] args) {

        // string reference type
        String str = "Hello";
        System.out.println(str);

        // class reference type
        Car newObj = new Car("BMW", 2025);
        newObj.display();
        System.out.println(newObj.name);

        //object reference type
        Object obj = new Car("Toyota", 2023);

        //System.out.println(obj.name); will give error so we downcast

        // Downcasting allows to use the actual object type (Car) instead of the reference type (Object).
        
        Car carObj = (Car) obj;
        System.out.println(carObj.name);    
        System.out.println(carObj.year);    
        ((Car) obj).display();


        //interface reference type
        Animal doggy = new Dog(); //The interface reference variable doggy holds the reference (address) of a Dog object
        doggy.sound();


        //array reference type

        int[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"sub1", "sub2", "sub3"};
        System.out.println("First number: " + numbers[0]);
        System.out.println("Second name: " + names[1]);
    }
}

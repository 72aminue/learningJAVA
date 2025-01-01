class superclass {
    String name;

    superclass(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("This is the method of superclass A");
    }

    void sound(String environment) {
        System.out.println("Animal makes a sound in the " + environment);
    }
}

class subclass extends superclass {
    String name;

    subclass(String name, String subname) {
        super(name); // Call superclass constructor
        this.name = subname;
    }

    @Override
    void display() {
        super.display(); // Calls the method from superclass
        System.out.println("This is additional method in subclass B");
    }

    @Override
    void sound(String environment) {
        super.sound(environment); // Call the superclass method
        System.out.println("Dog barks loudly in the " + environment);
    }
}

public class superMethod {
    public static void main(String[] args) {
        subclass obj = new subclass("AnimalName", "DogName"); // Provide required arguments
        obj.display();   // Call the display method
        System.out.println(obj.name);
        obj.sound("park"); // Call the sound method
    }
}

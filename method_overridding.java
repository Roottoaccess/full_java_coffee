class Animal{
    void sound(){
        System.out.println("Animal makes sound Faul");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog use to bark !");
    }
}


public class method_overridding {
    public static void main(String[] args) {
        Dog obj1 = new Dog();
        obj1.sound();
    }
}
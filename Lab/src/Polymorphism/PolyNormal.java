package Polymorphism;

class Animall{
    public void AnimalSound(){
        System.out.println("Animal Sound");
    }
};

class Catt extends Animall{
    public void size(){
        System.out.println("small");
    }


    //Can we override private method
    public void AnimalSound(){
        System.out.println("Meow");
    }
};

class Elephantt extends Animall{
    public void size(){
        System.out.println("big");
    }
};
public class PolyNormal {
    public static void main(String[] args) {

        Catt cat= new Catt();
        cat.AnimalSound();
        cat.size();

        Elephantt elephant = new Elephantt();
        elephant.AnimalSound();
        elephant.size();
    }
}

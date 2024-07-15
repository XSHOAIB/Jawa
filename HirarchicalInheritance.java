class animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("dog is barking");
    }
}
class cat extends animal{
    void meow(){
        System.out.println("Cat is meowing");
    }
}

public class imp{
    public static void main(String[] args){
        dog dog = new dog();
        dog.eat();
        dog.bark();
        
        cat cat = new cat();
        cat.eat();
        cat.meow();
    }
}

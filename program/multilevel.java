class Animal{
  public void eat(){
    System.out.println("eating");
  }
}
class Dog extends Animal{
  public void bark(){
    System.out.println("barking");
  }
}

class Puppy extends Dog{
  public void cry(){
    System.out.println("crying");
  }
}

public class Main{
  public static void main(String []args){
    Puppy p = new Puppy();
    p.cry();
    p.bark();
    p.eat();
  }
}

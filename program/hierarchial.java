class Animal(){
  public void eat(){
    System.out.println("eating");
  }
}
class Dog extends Animal{
  public void bark(){
    System.out.println("barking");
  }
}
class Cat extends Animal{
  public void meow(){
    system.out.println("meowing");
  }
}
public class Main{
  public static void main(String []args){
    Cat c = new Cat();
    c.meow(); 
    c.eat();
    c.bark();
  }
}

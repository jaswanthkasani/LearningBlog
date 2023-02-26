public class Animal{
  public void eat(){
    System.out.println("eating");
  }
}
public class Horse extends Animal{
  public void eat(){
    System.out.println("Horse is eating");
  }
  public void eat(String s){
    System.out.println("name is" + s);
  }
}
class Main{
  public static void main(String []args){
    Animal a1 = new Animal();
    a1.eat();
    Horse h1 = new Horse();
    h.eat();
    Animal a2 = new Horse();
    a2.eat();
    Horse h2 = new Horse();
    h2.eat("pony"); //method eat with parameters will be called
    
    Animal a3 = new Animal(); // compile time error(no eat() with parameters in class Animal)
    a3.eat("grass");
  }
}

    

class Animal{
  Animal(){  //constructor
    System.out.println(" This is an Animal");
  }
}
class Dog extends Animal{
  Dog(){
    super(); // to call constructor in super class
    System.out.println("Labrador");
  }
}

class Main{
  public static void main(String []args){
    Dog d = new Dog();
  }
}

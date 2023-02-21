class Test{
  public void eat(){
    System.out.println("eating");
  }
}

class Test1 extends Test{
  public void bark(){
    System.out.println("barking");
  }
}

class Main{
  public static void main(String []args){
    Test1 t1 - new Test1();
    t1.bark();
    t1.eat(); //calling method of base class using object of derived class
  }
}

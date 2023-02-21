class Encap{
  private int a;
  private int b;
  
 public void setA(int input){
   a = input;
   b = a/3;
 }
}

class Test{
  Public static void main(String []args){
    Encap E = new Encap();
    E.setA(12);
  }
}


//without Encapsulation

class Foo{
  public int a;
  public int b;
public void setA(int input){
  a = input;
  b = a/3;
  
class Test{
  public static void main(String []args){
    Foo f = new Foo();
    f.a = 1;
    f.b = 2;
  }
}

//Since the variables are public, they can be accessed outside the class

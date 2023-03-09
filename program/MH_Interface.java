interface Printable{
  void print();
}
interface Showable{
  void show();
}
class Testt implements Printable, Showable{
  public void print(){
    System.out.println("printing");
  }
    public void show(){
      System.out.println("showing");
    }
  
  public static void main(String []args){
    Test t = new Test();
    t.print();
    t.show();
  }
}
  

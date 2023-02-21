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

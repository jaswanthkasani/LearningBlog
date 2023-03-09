abstract class Bank{
  abstract int getRateOfInterest();
}
class BOFA extends Bank{
  int getRateOfInterest(){
    return 7;
  }
}
  
 class USBANK extends Bank{
   int getRateOfInterest(){
     return 10;
   }
 }
  class Test{
    public static void main(String []args){
      Bank B = new BOFA();
      System.out.println(b.getRateOfInterest()+ "%");
       Bank B = new USBANK();
       System.out.println(b.getRateOfInterest()+ "%");
    }
  }

      

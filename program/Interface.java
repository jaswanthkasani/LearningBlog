interface Bank{
  abstract float getRateOfInterest();
}
class BOFA implements Bank{
  public float getRateOfInterest(){
    return 7.5f;
  }
}
class USBANK implements Bank{
  pubic float getRateOfInterest(){
    return 9.5f;
  }
}
class Test{
  public static void main(String []args){
    Bank B = new BOFA();
    System.out.println(B.getRateOfInterest()+ "%");
    }
}

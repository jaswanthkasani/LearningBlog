public class Student{
  private int age;
  private String name;
 
 public int getage(){
   return age;
   
 }
  public void setage(int age){
    this.age = age;
  }
  
  public String getname(){
    return name; //returns the value to where we call it
  }
  
  public int setname(){
    this.name = name;
  }
}

class Test{
  public static void main(String []args){
    Student s = new Student();
    s.setage(12);
    s.setname("jk");
    
   System.out.println(s.getname()+" "+ s.getage());
  }
}

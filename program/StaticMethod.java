Class Student{
  int rollNo;
  String name;
  
Static String college = "SLU";

Static void change(){
  college = "Saint Louis University";
}
  
Student(int id, string n){
  rollNo = id;
  name = n;
}

void display(){
  System.out.println(rollNo +" "+name +""+ college);
}
}

public class TestStaticMethod{
  public Static void main(String []args){
    Student.change();
    Student s1 = new Student(111, JK);
    Student s2 = new Student(112, Kasani);
    s1.display();
    s2.display();
    
  }
}

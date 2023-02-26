class Person{
  int id;
  String name;
 
  Person(int id, String name){
    this.name = name;
    this.id = id;
  }
}
class Employee extends Person{
  float salary;
  Employee(int id, String name, float salary){
    Super(id, name); //reusing parent constructor
    this.salary = salary;
  }
  void display(){
    System.out.println(id+" "+name+" "+salary);
  }
  class Main{
    public Static void main(String []args){
      Employee e = new Employee(20, Jaswanth, 20000f);
      e.display();
    }
  }

public class Address{
  String city, state, country;
  public Address(String city, String state, String country){
    this.city = city;
    this.state = state;
    this.country = country;
  }
}

class Employee{
  int id;
  String name;
  Address address; //Aggregation
  
  public Employee(int id, String name, Address address){
    this.id = id;
    this.name = name;
    this.address = address;
  }
  void display(){
    System.out.println(id+" "+name);
    System.out.println(address.city+" "+address.state+" "+address.country);
  }
}

class Main{
  public static void main(String []args){
    Address address1 = new Address(STL, MO, USA);
    Address address2 = new Address(VEGAS, NV, USA);
    
    Employee e1 = new Employee(101, "JK", address1);
    
    Employee e2 = new Employee(102, "SK", address1);
    e1.display();
    e2.display();
  }
}
    
    

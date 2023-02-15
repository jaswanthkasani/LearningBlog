class Student{
  int age;
Student(){
  this(20);
}
Student(int age){
  this.age = age;
}

Public static void main(String []args){
  Student s1 = new Student(); //Student() constructor will be invoked
  Student s2 = new Student(25);//Student(int age) constructor will be invoked
}
}

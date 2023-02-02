class Student{  
   int rollno;//instance variable  
   String name;  
   static String college ="SLU";//static variable  
   //constructor  
   Student(String n){    
   name = n;  
   }  
   //method to display the values  
   void display (){
     System.out.println(college+" " +name);
   }  
}  

public class Main{  
 public static void main(String args[]){  
 Student s1 = new Student("Jaswanth");  
   
 s1.display(); 
 }  
} 

---
title: "week three preparation"
date: 2023-02-15
---

In the third week of my Java preperation, I have studied concepts such as Method Overloading and the rules for Method Overloading, This Keyword, Static keyword, Static method and Enum.

## Method Overloading ##

In java, with Method Overloading, multiple methods can have same name but with different parameters.
<code>
  return_type method_name(type1, type2,..){ 
  //statements 
  } 
</code> 
Public Static int add( int i, int j). Here is an [example](https://github.com/jaswanthkasani/LearningBlog/blob/main/program/methodOverloading.java) of Method Overloading in Java. Overloaded methods must differ in the argument list and depending on the number of arguments whether 2 or 3, it will know which method to invoke when the methods of same name are called. Even if the methods are samee, based on the parameters we pass, the values wil be sent. Also, the sequence of data type should differ. For instance, if a method has(int, double), the other method should have atleast (double, int).

## This keyword: ##
Next, I have studied **'this'** keyword. This is a reference variable that refers to the current object. The main purpose of **'this'** keyword is to differenciate between local variables and data members of the class. When we use <code> this.variablename </code>, we are refering to the variable of the class but not the variable inside the method. However, learning the concept of **'this'** was quite challenging because we can use this to refer to the variable of the class and also to call constructor within another constructor without having to create multiple objects for the same class. To overcome this, I have practiced few programs which helped me distinguish between these two types. Here is an [example](https://github.com/jaswanthkasani/LearningBlog/blob/main/program/this_keyword.java) of this keyword.

## Static Keyword: ##
Static keyword can be used in 6 scenarios. Static variables, Static methods, Static blocks of code, Static import, Static inner class and Interface Static methods. Whenever we declare a variable as Static, it will become a class variable and its memory will be allocated in the "Method area". If we do not declare a varible as Static, it will become an Instance Varible. Static Variables will be initialized before Instance Variables. A Static variable can directly be created without having to create an object for the class.
<code>
  className.variableName;
 </code>
 
 **Static methods** belongs to the class and will no longer use the Instance Variables. It can only access Static data. Also, Static methods can directly called by class name.
<code>
  className.methodName();
 </code>

Here is an [example](https://github.com/jaswanthkasani/LearningBlog/blob/main/program/StaticMethod.java) program of Static Method. Staic methods cannot refer to **'this'** and **'super'**.

## ENUM ##
  Enum in Java is a datatype which contains 'a fixed set of constants'. We should have all ENUM constants in Upper case letters. For instance, if we declare a variable 
"GRADE" which can only take four values (A, B, C, D), in this case we use ENUM. Enum decleration can be done outside a class or inside a class but not inside a method.
Example:
<code>
public enum Grade{
A,
B, 
C,
D;
}
</code>
 
  When we declare any object of type Grade, it can take either A or B or C or D.
 <code> Grade g = Grade.C; // which means we are assigning C to object g. </code>
 
  We can add constructors, instance variables and Methods in an Enum. Constructors in an Enum are private so we cannot call them directly. It is a good practice to use basic methods but not a good practice to add both constructors and methods. The methods inside java.lang.enum class are Values(), Ordinal(), toString() and ValueOf(). You can check [different methods of java](https://www.programiz.com/java-programming/enums) Enum class here. Here is a simple [program](https://github.com/jaswanthkasani/LearningBlog/blob/main/program/enum.java) on Enum. This has been my preperation this week so far and I will update my blog with  coming week's preperation.
 
 
  
  
  



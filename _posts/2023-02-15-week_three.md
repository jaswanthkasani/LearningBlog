---
title: "week three preparation"
date: 2023-02-15
---

In the third week of my Java preperation, I have studied concepts such as Method Overloadind and the rules for Method Overloading, This Keyword, Static keyword, Static method and Enum. In java, with Method Overloading, multiple methods can have same name but with different parameters.
<code>
  return_type method_name(type1, type2,..){ 
  //statements 
  } 
</code> 
Public Static int add( int i, int j). Here is an [example](https://github.com/jaswanthkasani/LearningBlog/blob/main/program/methodOverloading.java) of Method Overloading in Java. Overloaded methods must differ in the argument list and depending on the number of arguments whether 2 or 3, it will know which method to invoke when the methods of same name are called. Even if the methods are samee, based on the parameters we pass, the values wil be sent. Also, the sequence of data type should differ. For instance, if a method has(int, double), the other method should have atleast (double, int).

Next, I have studied 'this' keyword. This is a reference variable that refers to the current object. The main purpose of 'this' keyword is to differenciate between local variables and data members of the class. When we use <code> this.variablename </code>, we are refering to the variable of the class but not the variable inside te method. However, learning the concept of 'this' was quite challenging because we can use this to refer to the variable of the class and also to call constructor within another constructor without having to create multiple objects for the same class. Here is an example of this keyword.

Static keyword can be used in 6 scenarios. Static variables, Static methods, Static blocks of code, Static import, Static inner class and Interface Static methods. Whenever we declare a variable as Static, it will become a class variable and its memory will be allocated in the "Method area". If we do not declare a varible as Static, it will become an Instance Varible. Static Variables will be initialized before Instance Variables. A Static variable can directly be created without having to create an object for the class.
<code>
  className.variableName;
 </code>
 
 Static methods belongs to the class and will no longer use the Instance Variables. It can only access Static data. Also, Static methods can directly called by class name.
<code>
  className.methodName()
 </code>


  

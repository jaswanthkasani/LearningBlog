class InstanceVariables{
  int intField;
  float floatField;
  double doubleField;
}

class Main{
  public static void main(String []args)
  {
    InstanceVariable iv = new InstanceVariable();
    System.out.println("default value of int is " + iv.intField);
    System.out.println("default value of float is " + iv.floatField);
    System.out.println("default value of double is " + iv.doubleField);
  }
}

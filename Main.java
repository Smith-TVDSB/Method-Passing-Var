class Main {
  static void myMethod(String fname, int personAge) { 
    // the variable being passed is in brackets
    System.out.println(fname + " is " + personAge + " years old");
  }

  public static void main(String[] args) {
    String firstName = "Lucas";
    int age = 17;

    myMethod(firstName, age); 
    // Lucas is passed and entered into fname of the method
  }
}
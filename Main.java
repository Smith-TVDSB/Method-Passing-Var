class Main {
  static void myMethod(String fname) { 
    // the variable being passed is in brackets
    System.out.println(fname + " Refsnes");
  }

  public static void main(String[] args) {
    myMethod("Liam"); 
    // Liam is passed and entered into fname of the method
    myMethod("Jenny");
    // Liam is passed and entered into fname of the method
    myMethod("Anja");
    // Liam is passed and entered into fname of the method
  }
}
package testprogram;



public class Variable {
    static String x = "Aishu"; // static variable
    String school = "HAC"; // instance variable
    int year = 2020; // instance variable

    public static void main(String[] args) {
        Variable obj = new Variable(); // Creating an instance of Variable
        int Age = 15; // local variable
        System.out.println(x);
        System.out.println(Age);
        System.out.println(obj.school); // Accessing instance variable using object
        System.out.println(obj.year); // Accessing instance variable using object
    }
}


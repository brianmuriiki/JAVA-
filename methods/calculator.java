package methods;
import java.util.Scanner;
//calculator using functions
public class calculator {
    static int add(int a, int b){
        return a+b;
    }
    static int sub(int a, int b){
        return a -b;
    }
    static int mult(int a, int b){
        return a * b;
    }
    static double div(int a, int b){
        return a / b;
    }

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Functional calculator");
    System.out.println("========================");
    System.out.println("enter first number: ");
    int a = input.nextInt();
    System.out.println("Enter the second number: ");
    int b = input.nextInt();
    System.out.println("Select the operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1-4): ");
        int choice = input.nextInt();

    //logic
    switch(choice){
        case 1:
          System.out.println(add(a, b));
            break;
        case 2:
           System.out.println(sub(a, b));
            break;
        case 3:
          System.out.println(mult(a, b));
            break;
        case 4:
           System.out.println(div(a, b));
            break;

        default:{
                System.out.println("Invalid input");

        }
    }





  }
}

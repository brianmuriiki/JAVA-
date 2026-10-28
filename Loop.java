import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      //  System.out.println("Enter number you want to start to count from: ");
       // int i = scanner.nextInt();
       // System.out.println("Enter the index to end the count in: ");
       // int n = scanner.nextInt();
        //while loop
        /*while (i < n) {
           System.out.println("Value of i: " + i);
           i++;
        } */

       //do while loop

      /*  do { 
           System.out.println("Value of i: "+ i);
           i++;
       } while (i<n);*/

       //for loop
       /*int sum = 0;
       for (i = 0; i < n; i++) {
        System.out.println("value of i: " + i);
        sum =sum + i;
           
           
       }
       System.out.println("sum is :" + sum);*/

       //nested loops
       // Outer loop
/*for (int i = 1; i <= 2; i++) {
  System.out.println("Outer: " + i); // Executes 2 times
  
  // Inner loop
  for (int j = 1; j <= 3; j++) {
    System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
  }
} */
   
     //for each loop
    int[] numbers = {122, 234, 345, 567, 456};
     for(int num : numbers){
        System.out.println("number are :" + num);
     }
        scanner.close();
    }
}

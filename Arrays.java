public class Arrays {
    public static void main(String[] args){
        int[] num = {1, 2, 3, 4, 5};
       // System.out.println("numbers in the array: " + java.util.Arrays.toString(num));
       //for loop
        System.out.println("For loop");
       for(int i = 0; i<num.length;i++){
        System.out.println(num[i]);
       }
       //for-each loop
        System.out.println("For-each loop");
       for(int number:num){
        System.out.println(number);
       }
       //sum
       int sum = 0;
       for(int number:num){
        sum = sum + number;
       }
        System.out.println("sum is: " + sum);
    }
}

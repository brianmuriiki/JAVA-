package methods;

public class factorial {
    static int factorial(int b){
        if(b>1){
            return b * factorial(b-1);
        } else{
            return 1;
        }
    }
     public static void main(String[] args){
        int result = factorial(5);
        System.out.println(result);
     }
}

package methods;

public class overloading{
    static int mymethod(int a, int b){
        return a + b;
    }
    static double mymethod(double a, double b){
        return a + b;
    }
    public static void main(String[] args){
        System.out.println(mymethod(2.3 , 2.4));
        System.out.println(mymethod(4 , 3));
    }
}

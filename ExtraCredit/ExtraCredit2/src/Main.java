import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        HashMap<Integer, Integer> m = new HashMap<>();

        int n = 8;
        System.out.println("Computing Fib of n: " + fib(n));
    }

//    public static int fib(int x, HashMap<Integer,Integer> m){
    public static int fib(int n){

        if(n<=1){
            return n;
        }

//        if(m.containsKey(m)){
//            return m.get(x);
//        }

        int a = 0, c = 0;
        int b = 1;

        for(int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;

    }
}
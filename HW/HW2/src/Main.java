// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static boolean isBadVersion(int version){

        return version>=4;

    }

    public static int badversion(int n){
        int left = 1;
        int right = n;

        while (left<right){
            int mid = (left+right)/2;

            if(isBadVersion(mid)){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }


    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");


        int[] arr = {1,2,3,4,5,6,7};
        int n = 6;
        System.out.println("Bad Version: " + badversion(n));



    }
}
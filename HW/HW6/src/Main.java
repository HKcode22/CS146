import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static List<List<Integer>> tripletsum(int[] nums){

        Arrays.sort(nums);

//        Arrays.sort(nums);

        List<List<Integer>> trip = new ArrayList<>();
        int n = nums.length;

        for(int i=0; i<n; i++){
            int l=i+1, r=n-1;

            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }

            while(l<r){
                int t = nums[i] + nums[l] + nums[r];
                if(t == 0){
                    trip.add(Arrays.asList(nums[i], nums[l], nums[r]));

                    while(l<r && nums[r] == nums[r-1]){
                        r--;
                    }
                    while(l<r && nums[l] == nums[l+1]){
                        l++;
                    }
                    l++;
                    r--;
                }
                else if (t<0){
                    l++;
                }
                else{
                    r--;
                }
            }

        }

        return trip;
    }


    public static void main(String[] args) {

        int[] a1 = {-1,0,1};
//        int l =
        int[] a2 = {0,1,1};
        int [] a3 = {-5,0,5,10,-10,0};

        System.out.print(tripletsum(a1));
        System.out.println(tripletsum(a2));
        System.out.println(tripletsum(a3));



    }
}
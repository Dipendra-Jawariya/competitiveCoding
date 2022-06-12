import java.sql.Array;
import java.util.Arrays;

//Given an integer array nums, return true if any value appears at least twice in the array,
// and return false if every element is distinct.
//Input: nums = [1,2,3,1]
//        Output: true
public class ContainsDupliucate {
    public static boolean duplicate(int arr[]){
        int res =0; //This function will check if t he first element is repeating itself in the whole array
//        But it fails to check if any other element is repeating or not
        for (int i = 1; i < arr.length; i++) {
            if (arr[res] == arr[i]){
                res++;
                return true;
            }
            if (i ==arr.length-1){
                res++;
                i=1;
            }
        }
        return  false;
    }

//    Print the duplicate elements
    public static void printDUplicate(int arr[]){
        int n =arr.length;
        int count[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (count[arr[i]]==1){
                System.out.println(arr[i]+" ");
            }
            else
            {
                count[arr[i]]++;
            }
        }
    }
    public static boolean DP(int arr[]){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==arr[i+1]){
                return true;
            }
        }
        return false;

        
    }
    public static void main(String[] args) {
    int arr[] = {2,14,18,22,22};
//        boolean res = duplicate(arr); // it just misses som of the corner cases
        boolean res =DP(arr);
        System.out.println(res);
    }
}

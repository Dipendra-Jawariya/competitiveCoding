public class MaximumSubArray {
    public static int maxSumArray(int arr[]){
      int n = arr.length;
      int res = arr[0];
        for (int i = 0; i < n; i++) {
            int curr=0;
            for (int j = i; j < n; j++) {
                curr=  curr+arr[j];
                res =Math.max(res,curr);
            }
        }
        return res;
    }
    public  static int maxSubSum(int arr[]){
        int n =arr.length;
        int res = arr[0];
        int maxEnding = arr[0];
        for (int i = 0; i < n; i++) {
            maxEnding =Math.max(arr[i],maxEnding+arr[i]);
            res = Math.max(res,maxEnding);
        }
        return res;
    }
    public static void main(String[] args) {
    int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSumArray(arr));
        System.out.println("The Maximum subarray using efficient way is");
        System.out.println(maxSubSum(arr));
    }
}

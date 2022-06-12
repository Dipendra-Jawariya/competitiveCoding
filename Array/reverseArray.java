public class reverseArray {
    public static void reverse(int arr[]){
        int low = 0;
        int high = arr.length-1;
        for (int i = low; i < high; i++) {
            while (low<high){
            int temp = arr[low];
            arr[low]=arr[high];
            arr[high] = temp;
            low++;
            high--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
    }
    public static void main(String[] args) {
        int arr[] = {12,50,35,60,48,48,100,200,400,50};
        reverse(arr);
    }
}

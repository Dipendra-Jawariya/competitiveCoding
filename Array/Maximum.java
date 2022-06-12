///Arrays Maximum and Minimum Element in an Array
public class Maximum{
    public  static int largestElement(int arr[]){
        int n = arr.length;
        int maxElem = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i]>maxElem){
                maxElem = arr[i];
            }
        }
        return maxElem;
    }
    public static int smallesElement(int arr[]){
        int minElem = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<minElem){
                minElem = arr[i];
            }
        }
        return minElem;
    }

    public static void main(String[] args) {
        int arr[] = {10,50,60,880,20,45,14};
        int largest = largestElement(arr);
        System.out.println("The largest element of the array is:"+ largest);
        int min = smallesElement(arr);
        System.out.println("The minimus element of the array is:"+min);
    }

        }
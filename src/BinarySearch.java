import java.util.Scanner;
public class BinarySearch {
    public static int BinarySearch(int[] arr,int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int mid = start + (end - start)/2;
        for(int i=0;i<n;i++){
            if(target < arr[mid]){
                end = mid;
                mid = start + (end - start)/2;
            }
            else if(target > arr[mid]){
                start = mid;
                mid = start + (end - start)/2;
            }
            else if(target == arr[mid]){
                return mid;
}
        }
        end = n-1;
        start = 0;
        if(target < arr[start]){
            return 0;
        }
        if(target > arr[end]){
            return n;
        }
        else{
            return mid + 1;
        }
    }
 public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter size:");
     int n = sc.nextInt();
     System.out.print("Enter Element: ");
     int[] arr = new int[n];
     for(int i=0;i<n;i++){
         arr[i] = sc.nextInt();
     }
     System.out.print("Enter Target: ");
     int target = sc.nextInt();
     System.out.print(BinarySearch(arr,target));
 }
}

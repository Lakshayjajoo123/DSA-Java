import java.util.Scanner;
public class BubbleSort {
    static void BubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " Element in arrays");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        BubbleSort(arr);
    }
}

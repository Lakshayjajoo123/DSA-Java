import java.util.Scanner;
//[5,3,4,1,2]
//Sort try Sorting like part by part for rg first solve index no. 1,then 2, then 3, then 4,then 5
//for every index you are at put that index element at the correct index of LHS
//After FIrst Pass that is i=0 sort array till index 1, 5,3 will be sorted this will be 3,5,4,1,2
// After second pass that is i=1 sort array till index 2, 3,5,4 will be sorted this will be 3,4,5,1,2
// After third pass that is i=2 sort array till index 3, 3,4,5,1 will be sorted this will be 1,3,4,5,2
// After fourth pass that is i=3 sort array till index 4, 1,3,4,5,2 will be sorted this will be 1,2,3,4,5
// 5,3,4,1,2 i=0;j=1 -> 3,5,4,1,2
//i<n-2 and j > 0
//  i=1 and j=2 now
//3,5,4,1,2 then this time it will sort 3,5,4
//3,4,5,1,2 now j will be at 4 and it will check 3,4 as 3<4 no swap now break
// breaking is important part.(when element is not smaller then j-1 then break )
// so on this will go like this until whole array will be sorted

public class InsertionSort {
    static void insertionSort(int[] arr){
        for(int i=0;i<=arr.length-1;i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } else {
                    break;
                }
            }
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k] + " ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        insertionSort(arr);
    }
}

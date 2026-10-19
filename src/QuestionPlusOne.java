import java.util.Arrays;
import java.util.Scanner;

public class QuestionPlusOne {
    public static int[] plusOne(int[] digits){
        // Approach 1
        // int sums = 0;
//     for(int i=0;i<digits.length;i++){
//         sums = sums * 10 + digits[i];
//     }
//     int n=0;
//     sums = sums + 1;
//     int temp = sums;
//     while(temp!=0){
//         n++;
//         temp /= 10;
//     }
//     int[] sum = new int[n];
//     int j=n-1;
//     while(sums!=0){
//         sum[j] = sums%10;
//         sums = sums/10;
//         j = j - 1;
//     }
//     return sum;
        // Approach 2 down
        int n = digits.length;
        if(digits[n-1]!=9){
            digits[n-1] = digits[n-1] + 1;
            return digits;
        }else{
            int carry = 1;
            for (int i = digits.length - 1; i >= 0; i--) {
                int total = digits[i] + carry;
                digits[i] = total % 10;
                carry = total / 10;
            }
            if (carry != 0) {
                int[] result = new int[digits.length + 1];
                result[0] = carry;
                for (int i = 0; i < digits.length; i++) {
                    result[i + 1] = digits[i];
                }
                return result;
            }
            return digits;
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
        System.out.println(Arrays.toString(plusOne(arr)));
    }
}

import java.util.Scanner;

public class SumOfSubArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findSum(arr, n));
        sc.close();
    }

    public static int findSum(int[] arr,int n) {
        int sum = 0,t_sum = 0;
        if(n <= 1) {
            return arr[0];
        }
        for(int i=0;i<n;i++) {
            sum = 0;
            for(int j=i;j<n;j++) {
                sum += arr[j];
                t_sum += sum;
            }
        }
        return t_sum;
    }
}
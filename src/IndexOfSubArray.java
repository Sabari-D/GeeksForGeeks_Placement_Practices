import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSubArray {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        int j = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            while (sum > target && j <= i) {
                sum -= arr[j];
                j++;
            }
            if (sum == target) {
                ArrayList<Integer> result = new ArrayList<>();
                result.add(j + 1);
                result.add(i + 1);
                return result;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(-1);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int[] arr=new int[size];
        for(int i=0; i<size; i++){
            arr[i]=scanner.nextInt();
        }
        int target=scanner.nextInt();
        ArrayList<Integer> res =subarraySum(arr,target);
        System.out.println(res);
    }
}

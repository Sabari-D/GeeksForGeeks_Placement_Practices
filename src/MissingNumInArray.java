import java.util.Scanner;

public class MissingNumInArray {
    static int missingNum(int[] arr) {
        long n=arr.length+1;
        long sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }

        long total = n*(n+1)/2;
        return (int) (total-sum);

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int[] arr=new int[size];
        for(int i=0; i<size; i++){
            arr[i]=scanner.nextInt();
        }
        int res=missingNum(arr);
        System.out.println(res);
    }
}

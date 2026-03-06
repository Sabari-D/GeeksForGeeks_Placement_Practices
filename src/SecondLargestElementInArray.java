import java.util.Scanner;

public class SecondLargestElementInArray {
    static int getSecondLargest(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num:arr){

            if(num > largest){
                secondLargest = largest;
                largest = num;
            }

            else if(num>secondLargest && num != largest){
                secondLargest = num;
            }
        }

        if(secondLargest == Integer.MIN_VALUE)
            return -1;

        return secondLargest;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int[] arr=new int[size];
        for(int i=0; i<size; i++){
            arr[i]=scanner.nextInt();
        }
        int res=getSecondLargest(arr);
        System.out.println(res);
    }
}

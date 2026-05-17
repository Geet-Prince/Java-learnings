import java.util.Scanner;

public class day1slot2q1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int max=arr[0];
        int count=1;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                count++;
            }
        }
        System.out.println("res "+count);
    }
}

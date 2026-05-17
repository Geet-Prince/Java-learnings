
import java.util.Scanner;

public class day1slot1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int star=0;
        int hash=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='*'){
                star++;
            }
            else if(str.charAt(i)=='#'){
                hash++;
            }
        }
        System.out.println(hash-star);
    }
}

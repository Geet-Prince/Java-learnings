
import java.util.Scanner;

class calculator{
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
} 
class display{
    public void dis(int a,int b){
        Scanner s=new Scanner(System.in);
        System.out.println("choose your option what do you want to use");
        System.out.println("for add press 1");
        System.out.println("for sub press 2");
        System.out.println("for mul press 3");
        System.out.println("for div press 4");
        calculator calc=new calculator();
        int inp=s.nextInt();
        switch (inp) {
            case 1:
                System.out.println(calc.add(a, b));;
                break;
            case 2:
                System.out.println(calc.sub(a, b));
                break;
            case 3:
                System.out.println(calc.mul(a, b));
                break;
            case 4:
                System.out.println(calc.div(a, b));
                break;
            default:
                System.out.println("invalid input");;
        }
    }
}
class p1calc {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        display d=new display();
        System.out.println("enter the first value");
        int a=s.nextInt();
        System.out.println("enter the second value");
        int b=s.nextInt();
        d.dis(a,b);
    }
    
}

class computer{
    public void music(){
        System.out.println("music is playing");
    }
    public int number(){
        return 5;
    }
    public String sentence(){
        return "hi this is a string"; 
    }
}
public class p2uner_classes {
    public static void main(String[] args) {
        computer c1=new computer();
        c1.music();
        c1.number();
        c1.sentence();
    }    
}

import java.util.*;
public class Exception_Demo{
    
    
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();

        try{
            int c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
       
        finally{
            System.out.println("Final block");
        }
        System.out.println("after finally");
    }
}
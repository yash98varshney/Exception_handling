package ThrowandThrows;

public class throwandthrows {
    
    // propogation of exceptions we are handling it directly in main method we can handle those in any of the methods 
    public static int meth1(){
        return 10/0;
    }

    public static void meth2(){
        meth1();
    }

    public static void meth3(){
        meth2();
    }



    // Throw and Throws example 

    public static int area(int l,int b) throws NegativeParametrException{

        if(l<=0 || b<=0){
            throw new NegativeParametrException();
        }
        return l*b;
    }

    public static void meth4() throws NegativeParametrException{
        System.out.println(area(-10,5));
    }

    public static void main(String[] args){
        try{
            meth3();
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        
        // we can use throws Exception with main also ;
        try{
            meth4();
        }
        catch(NegativeParametrException e){
            System.out.println(e);
        }
    }
}

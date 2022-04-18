package ThrowandThrows;

public class throwandthrows {
    
    public static int meth1(){
        return 10/0;
    }

    public static void meth2(){
        meth1();
    }

    public static void meth3(){
        meth2();
    }

    public static void main(String[] args){
        meth3();
    }
}

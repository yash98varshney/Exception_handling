import java.io.*;
public class CheckedUnchecked {
    
    static void fun1(){

        try{
            System.out.println(10/0);  // this is uncheked exception as compiler does not force to use try catch block over here
        }
        catch (Exception e){
            System.out.println(e.getMessage());  // this will give us only exception does not give the Stack trace
            //System.out.println(e);
            //e.printStackTrace();
        }



        // finally{                                trying to catch exception from fileopen method;

        //     try{
        //         fileOpen();
        //     }
        //     catch(Exception e){
        //         e.getStackTrace();
        //     }
            
        // }
        
    }

    static void fun2(){   // I have handled the exception from func1 in func1 itself so didn't need to throws exeption from here otherwise we have throw that in func2 also
        fun1();
    }

    static void fun3() throws LowBalaceException{
        fun2();
        throw new LowBalaceException();
    }

    //Checked exceptions

    static void fileOpen() throws FileNotFoundException{

        FileInputStream f1= new FileInputStream("File.txt");  //I have written this without try catch so it says to handle he exception
        

        // We can use try catch over here or we can use throws -----  than exception name as done above .

        // try{
        //     FileInputStream f1= new FileInputStream("File.txt");
        // }
        // catch(FileNotFoundException e){
        //     S.O.P(e.getMessage());
        // }
        
    }

    public static void main(String[] args){
        try{
            fun3();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

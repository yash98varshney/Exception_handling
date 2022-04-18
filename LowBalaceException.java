package Exception_Handling;

public class LowBalaceException extends Exception {
    
    @Override
    public String toString(){
        return " Balace should be greater than 5000";
    }
}

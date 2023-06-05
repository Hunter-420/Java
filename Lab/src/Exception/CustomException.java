package Exception;
import java.lang.*;

class AmountNotEnoughException extends Exception{
    public String toString()
    {
        return "AmountNotEnoughException";
    }
    public String getMessage(){
        return "Amount should be greater than 500";
    }
}
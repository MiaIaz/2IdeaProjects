package week15.customExceptions;

public class BreakTimeExceptions extends RuntimeException{

    public BreakTimeExceptions(String message){
        super(message); // call the constructor of RunTimeException class
    }
}

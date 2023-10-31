package exceptions;

public class EtudiantExisteException extends Exception{
    public EtudiantExisteException(){
        super("Student already exist!");
    }
}

package rs.ac.ni.pmf.web.demo_rest.exception;

public class ExceptionNotFound extends RuntimeException{

    public  ExceptionNotFound(final long id){
        super("Note with id= " + id + " not found");
    }
}

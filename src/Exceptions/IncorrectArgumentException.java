package Exceptions;

public class IncorrectArgumentException extends Exception{
    private String argument;

    public IncorrectArgumentException(String field, String argument) {
        super("Incorrect argument for field " + field + ": " + argument);
        this.argument = argument;
    }

    public String getArgument() {
        return argument;
    }

    public String toString() {
        return "Exceptions.IncorrectArgumentException{" +
                "message='" + getMessage() + '\'' +
                ", argument='" + argument + '\'' +
                '}';
    }
}
import Exceptions.IncorrectArgumentException;

public enum Type {
    WORK,
    PERSONAL;

    Type() {
    }

    public static Type fromString(String str) throws IncorrectArgumentException {
        try {
            return Type.valueOf(str);
        } catch (IllegalArgumentException e) {
            throw new IncorrectArgumentException("Invalid type: " + str, "type");
        }
    }
}
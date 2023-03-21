public interface Validator <T> {
    public abstract boolean validate(T ob) throws IllegalStateException;
}

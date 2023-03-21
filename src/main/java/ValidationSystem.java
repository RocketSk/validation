public class ValidationSystem<T> {
    public boolean validate(T ob) {
        Validator validator = null;

        if (ob instanceof Integer) {
            validator = new IntegerValidator();
            return validator.validate(ob);
        } else if (ob instanceof String) {
            validator = new StringValidator<String>();
            return validator.validate(ob);
        }
        return false;
    }
}
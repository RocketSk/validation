public class StringValidator<S> implements Validator <String>{

    private static final String STRING_REGEX = "^[A-Z].*";

    @Override
    public boolean validate(String ob) throws IllegalStateException {
        if (ob.toString().matches(STRING_REGEX)){
            return true;
        }
        System.out.println("Please input correct int");
        throw new IllegalStateException("Please input correct int");
    }
}
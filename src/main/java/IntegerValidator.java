public class IntegerValidator<I> implements Validator <Integer>{

    private static final Integer MIN = 0;
    private static final Integer MAX = 10;

    @Override
    public boolean validate(Integer ob) throws IllegalStateException {
        if (ob <= MIN || ob > MAX) {
            throw new IllegalStateException("Please input correct int");
        }
        return true;
    }
}

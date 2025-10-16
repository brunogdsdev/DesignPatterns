package Composite.Composite02;

public class CompositeMain02 {
    public static void main(String[] args) {
        ValidationComponent validateEmail = new ValidateEmail();
        ValidationComponent validateNumber = new ValidateNumber();
        ValidateString validateString = new ValidateString();

        ValidateComposite validationCompositeBox = new ValidateComposite();

        validationCompositeBox.add(validateEmail);
        validationCompositeBox.add(validateString);
        validationCompositeBox.add(validateNumber);

        System.out.println(validationCompositeBox.validate("1@"));
    }
}

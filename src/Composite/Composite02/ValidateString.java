package Composite.Composite02;

public class ValidateString extends ValidationComponent{
    boolean validate(String value){
        return !value.isEmpty();
    }
}

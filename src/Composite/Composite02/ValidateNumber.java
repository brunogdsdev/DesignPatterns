package Composite.Composite02;

public class ValidateNumber extends ValidationComponent{
    boolean validate(String value){
        return value.matches(".*\\d.*");
    }
}

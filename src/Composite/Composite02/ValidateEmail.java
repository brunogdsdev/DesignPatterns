package Composite.Composite02;

public class ValidateEmail extends ValidationComponent{

    boolean validate(String value){
        return value.contains("@");
    }
}

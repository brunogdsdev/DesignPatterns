package Composite.Composite02;

import java.util.ArrayList;

public class ValidateComposite extends ValidationComponent{
    private ArrayList<ValidationComponent> children = new ArrayList<ValidationComponent>();

    boolean validate(String value){
        for(ValidationComponent child : this.children){
            boolean validation = child.validate(value);
            if(!validation){
                return false;
            }

        }
        return true;
    }

    void add(ValidationComponent child){
       this.children.add(child);
    }
}

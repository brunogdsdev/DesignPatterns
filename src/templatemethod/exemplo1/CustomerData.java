package org.designpatterns.templatemethod.exemplo1;

public class CustomerData {
    public String name;
    public String age;
    public String cpf;

    CustomerData(CustomerData otherCustomer){
        this.name = otherCustomer.name;
        this.age = otherCustomer.age;
        this.cpf = otherCustomer.cpf;
    }
}

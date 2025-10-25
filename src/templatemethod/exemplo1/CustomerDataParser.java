package org.designpatterns.templatemethod.exemplo1;

import java.util.ArrayList;

abstract public class CustomerDataParser {
    public ArrayList<CustomerData> customerData;

    public CustomerDataParser(String filePath){

    }

    void fixCustomerData(){
        this.parseData();
    }

    private ArrayList<CustomerData> fixCpf(){
        ArrayList<CustomerData> fixedList = new ArrayList<>();

        for(CustomerData customer : this.customerData){
            CustomerData newCustomer = new CustomerData(customer);
            newCustomer.cpf = customer.cpf.replaceAll("\\D", "");
            fixedList.add(newCustomer);
        }
        return fixedList;
    }

    protected abstract ArrayList<CustomerData> parseData();

}

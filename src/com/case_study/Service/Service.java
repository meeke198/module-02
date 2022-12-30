package com.case_study.Service;

public class Service {
    private int service_id;
    private String service_name;
    private float price;
    private boolean status;
public Service(){

}
    public Service (int service_id, String service_name,
                Float price, boolean status){
        this.service_id = service_id;
        this.service_name = service_name;
        this.price = price;
        this.status = status;
    }

}

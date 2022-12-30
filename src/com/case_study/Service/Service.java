package com.case_study.Service;

public class Service {
    private int serviceId;
    private String serviceName;
    private float price;
    private boolean status;
public Service(){

}
    public Service (int service_id, String service_name,
                Float price, boolean status){
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.price = price;
        this.status = status;
    }

    public int getServiceId(){
        return this.serviceId;
    }
    public String getServiceName(){
        return this.serviceName;
    }
    public float getPrice(){
        return this.price;
    }
    public boolean getStatus(){
        return this.status;
    }
    public void setServiceId(int newServiceId){
        this.serviceId = newServiceId;
    }

    public void setServiceName(String newServiceName){
        this.serviceName = newServiceName;

    }
    public void setPrice(float newPrice){
        this.price = newPrice;
    }

    public void setStatus(boolean newStatus){
        this.status = newStatus;
    }

}

package com.case_study.Customer;

public class Customer {
    private int id;
    private int pet_id;
    private String name;
    private byte age;
    private String address;
    private String phoneNumber;
    public Customer (){

    }

    public Customer (int id, String name, byte age,
                     String address, String phoneNumber){
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public int getAge(){
        return this.age;
    }
    public void setName(String newName){
        this.name = newName;
    }

    public void setAddress(String newAddress){
        this.address = newAddress;

}
    public void setAge(byte newAge){
        this.age = newAge;
    }

    public void setPhoneNumber(String newPhoneNumber){

        this.phoneNumber = newPhoneNumber;
    }
    
}

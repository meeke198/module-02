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

}

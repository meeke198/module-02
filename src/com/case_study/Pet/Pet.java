package com.case_study.Pet;

public class Pet {
    private int pet_id;
    private int customer_id;
    private int service_id;
    private String description;
    public Pet (){

    }
    public Pet (int pet_id, int customer_id, int service_id,
                     String description){
        this.pet_id = pet_id;
        this.customer_id = customer_id;
        this.service_id = service_id;
        this.description = description;
    }
}

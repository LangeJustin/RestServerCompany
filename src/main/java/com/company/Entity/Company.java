package com.company.Entity;

/**
 * Created by Justin on 26.04.2017.
 */
public class Company {
    private int id;
    private String name;
    private String industry;

    public Company (int id, String name, String industry){
    this.id = id;
    this.name = name;
    this.industry = industry;
    }

    //Default

    public Company()
    {}

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    public String getIndustry(){
        return industry;
    }

    public void setIndustry(String industry){
        this.industry = industry;
    }

}

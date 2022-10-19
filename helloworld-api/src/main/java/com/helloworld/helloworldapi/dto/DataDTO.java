package com.helloworld.helloworldapi.dto;

public class DataDTO {
    private String name;
    private String phone;
    private int yearOld;

    public DataDTO(String name, String phone, int yearOld) {
        this.name = name;
        this.phone = phone;
        this.yearOld = yearOld;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getYearOld() {
        return this.yearOld;
    }

    public void setYearOld(int yearOld) {
        this.yearOld = yearOld;
    }

}

package com.tchepannou.event.client.v1;

public class AddressResponse {
    private String street;
    private String zipCode;
    private String city;
    private String state;
    private String country;
    private String countryName;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getLocation (){
        StringBuilder location = new StringBuilder();
        if (state != null && state.length() > 0){
            location.append(state);
        }
        if (countryName != null && countryName.length() > 0){
            if (state != null && state.length() > 0){
                location.append(", ");
            }
            location.append(countryName);
        }
        return location.toString();
    }
}

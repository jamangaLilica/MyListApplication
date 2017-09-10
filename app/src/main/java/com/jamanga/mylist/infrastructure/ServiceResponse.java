package com.jamanga.mylist.infrastructure;


import java.util.HashMap;

public class ServiceResponse {
    private HashMap<String,String> propertyErrors;

    public ServiceResponse(HashMap<String, String> propertyErrors) {
        propertyErrors = new HashMap<>();
    }

    public ServiceResponse() {

    }

    public void setPropertyErrors(String property, String error){
        propertyErrors.put(property,error);
    }

    public String getPropertyError(String property){
        return propertyErrors.get(property);
    }

    public boolean didSuceed(){
        return (propertyErrors.size()==0);
    }
}

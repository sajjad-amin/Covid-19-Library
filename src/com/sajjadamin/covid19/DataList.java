/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sajjadamin.covid19;
/**
 *
 * @author sayem
 */
public class DataList {
    String countryName,totalCases,newCases,totalDeaths,newDeaths,totalRecovered,activeCases,seriousCases,tested;

    public DataList() {
    }

    public DataList(String countryName, String totalCases, String newCases, String totalDeaths, String newDeaths, String totalRecovered, String activeCases, String seriousCases, String tested) {
        this.countryName = countryName;
        this.totalCases = totalCases;
        this.newCases = newCases;
        this.totalDeaths = totalDeaths;
        this.newDeaths = newDeaths;
        this.totalRecovered = totalRecovered;
        this.activeCases = activeCases;
        this.seriousCases = seriousCases;
        this.tested = tested;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getTotalCases() {
        return totalCases;
    }

    public String getNewCases() {
        return newCases;
    }

    public String getTotalDeaths() {
        return totalDeaths;
    }

    public String getNewDeaths() {
        return newDeaths;
    }

    public String getTotalRecovered() {
        return totalRecovered;
    }

    public String getActiveCases() {
        return activeCases;
    }

    public String getSeriousCases() {
        return seriousCases;
    }
    
    public String getTested() {
        return tested;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setTotalCases(String totalCases) {
        this.totalCases = totalCases;
    }

    public void setNewCases(String newCases) {
        this.newCases = newCases;
    }

    public void setTotalDeaths(String totalDeaths) {
        this.totalDeaths = totalDeaths;
    }

    public void setNewDeaths(String newDeaths) {
        this.newDeaths = newDeaths;
    }

    public void setTotalRecovered(String totalRecovered) {
        this.totalRecovered = totalRecovered;
    }

    public void setActiveCases(String activeCases) {
        this.activeCases = activeCases;
    }

    public void setSeriousCases(String seriousCases) {
        this.seriousCases = seriousCases;
    }
    
    public void setTested(String tested){
        this.tested = tested;
    }
    
}

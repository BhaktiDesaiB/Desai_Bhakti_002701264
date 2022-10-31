/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author bhakti
 */
public class HospitalDetails {
    public static ArrayList<String> Cities = new ArrayList<String>();
    public static ArrayList<String> Communities = new ArrayList<String>();
    public static ArrayList<String> Hospitals = new ArrayList<String>();
    public static ArrayList<String> Doctors = new ArrayList<String>();
    public static Map<String,ArrayList<String>> CityandCommunity = new HashMap<String,ArrayList<String>>();
    
    public String City;
    public String Community;
    public String Hospital;
    public String Doctor;
    
    
    public static void AddCityandCommunity(String s, ArrayList<String> x){
        CityandCommunity.put(s, x);
    }
    public static Set<String> getCitykeys(){
        Set<String> keyset =CityandCommunity.keySet();
        return keyset;
    }
    public static ArrayList<String> getCommunityArray(String s){
        return CityandCommunity.get(s);
    }

    public static ArrayList<String> getCities() {
        return Cities;
    }
    public static void addCity(String x){
        Cities.add(x);
    }
    public static void addCommunity(String x){
        Communities.add(x);
    }
    public static void addHospital(String x){
        Hospitals.add(x);
    }
    public static void addDoctor(String x){
        Doctors.add(x);
    }

    public static void setCities(ArrayList<String> Cities) {
        HospitalDetails.Cities = Cities;
    }

    public static ArrayList<String> getCommunities() {
        return Communities;
    }

    public static void setCommunities(ArrayList<String> Communities) {
        HospitalDetails.Communities = Communities;
    }

    public static ArrayList<String> getHospitals() {
        return Hospitals;
    }

    public static void setHospitals(ArrayList<String> Hospitals) {
        HospitalDetails.Hospitals = Hospitals;
    }

    public static ArrayList<String> getDoctors() {
        return Doctors;
    }

    public static void setDoctors(ArrayList<String> Doctors) {
        HospitalDetails.Doctors = Doctors;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getCommunity() {
        return Community;
    }

    public void setCommunity(String Community) {
        this.Community = Community;
    }

    public String getHospital() {
        return Hospital;
    }

    public void setHospital(String Hospital) {
        this.Hospital = Hospital;
    }

    public String getDoctor() {
        return Doctor;
    }

    public void setDoctor(String Doctor) {
        this.Doctor = Doctor;
    }
    
    
    
    
}

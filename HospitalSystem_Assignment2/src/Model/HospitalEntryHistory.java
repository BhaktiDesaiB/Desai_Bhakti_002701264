/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author bhakti
 */
public class HospitalEntryHistory {
    public static ArrayList<HospitalEntry> HospitalDetailsHistory=new ArrayList<HospitalEntry>();
    public static ArrayList<String> Cities = new ArrayList<String>();
    public static ArrayList<String> Communities = new ArrayList<String>();

    public static ArrayList<String> getCommunities() {
        return Communities;
    }

    public static void setCommunities(ArrayList<String> Communities) {
        HospitalEntryHistory.Communities = Communities;
    }

    public static ArrayList<String> getCities() {
        return Cities;
    }
    public static void addCity(String s){
        Cities.add(s);
    }
    public static void addCommunity(String s){
        Communities.add(s);
    }

    public static void setCities(ArrayList<String> Cities) {
        HospitalEntryHistory.Cities = Cities;
    }
    
    public HospitalEntryHistory(){
        
    }
    public HospitalEntry addNewHospitalDetails(){
        HospitalEntry newDetails = new HospitalEntry();
        HospitalDetailsHistory.add(newDetails);
        return newDetails;
    }

    public static ArrayList<HospitalEntry> getHospitalDetailsHistory() {
        return HospitalDetailsHistory;
    }

    public static void setHospitalDetailsHistory(ArrayList<HospitalEntry> HospitalDetailsHistory) {
        HospitalEntryHistory.HospitalDetailsHistory = HospitalDetailsHistory;
    }
    
}

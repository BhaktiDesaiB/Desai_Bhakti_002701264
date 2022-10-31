/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author bhakti
 */
public class LoginDetails {
    public static Map<String,String> PatientDetails;
    public static Map<String,String> AdminDetails;
    public static Map<String,String> DoctorDetails;
    public static Map<String,String> HospitalAdminDetails;
    public static Map<String,String> CommunityAdminDetails;
    
    public LoginDetails(){
        PatientDetails = new HashMap<>();
        AdminDetails = new HashMap<>();
        DoctorDetails = new HashMap<>();
        HospitalAdminDetails = new HashMap<>();
        CommunityAdminDetails = new HashMap<>();
        AdminDetails.put("system", "password");
    }
    public void addkeyValue(String x, String y){
        PatientDetails.put(x, y);
    }
    public void addAdminkeyValue(String x, String y){
        AdminDetails.put(x, y);
    }
    public void addDoctorkeyValue(String x, String y){
        DoctorDetails.put(x, y);
    }
    public void addHAkeyValue(String x, String y){
        HospitalAdminDetails.put(x, y);
    }
    public void addCommunitykeyValue(String x, String y){
        CommunityAdminDetails.put(x, y);
    }
    public void deletePatientKeyValue(String s){
        PatientDetails.remove(s);
    }
    public void deleteAdminKeyValue(String s){
        AdminDetails.remove(s);
    }
    public void deleteDoctorKeyValue(String s){
        DoctorDetails.remove(s);
    }
    public void deleteHAKeyValue(String s){
        HospitalAdminDetails.remove(s);
    }
    public void deleteCAKeyValue(String s){
        CommunityAdminDetails.remove(s);
    }
    
    public Set<String> keys(){
        Set<String> keyset =PatientDetails.keySet();
        return keyset;
    }
    public Set<String> AdminKeys(){
        Set<String> keyset = AdminDetails.keySet();
        return keyset;
    }
    public Set<String> DoctorsKeys(){
        Set<String> keyset = DoctorDetails.keySet();
        return keyset;
    }
    public Set<String> HAKeys(){
        Set<String> keyset = HospitalAdminDetails.keySet();
        return keyset;
    }
    public Set<String> CommunityKeys(){
        Set<String> keyset = CommunityAdminDetails.keySet();
        return keyset;
    }
    public String getValue(String s){
        return PatientDetails.get(s);
    }
    public String getAdminValue(String s){
        return AdminDetails.get(s);
    }
    public String getDoctorValue(String s){
        return DoctorDetails.get(s);
    }
    public String getHAValue(String s){
        return HospitalAdminDetails.get(s);
    }
    public String getCommunityValue(String s){
        return CommunityAdminDetails.get(s);
    }
    
    
    
}

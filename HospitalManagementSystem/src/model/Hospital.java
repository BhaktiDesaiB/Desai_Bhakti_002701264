/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author bhakti
 */
public class Hospital 
{
    private int hospitalId;
    private String hospitalName;
    private String hospitalAddress;
    private String hospitalCommunity;
    private long hospitalEmergencyContact;
    private short hospitalPincode;
    private String hospitalCity; 
    private String hospitalEmail;

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }

    public String getHospitalCommunity() {
        return hospitalCommunity;
    }

    public void setHospitalCommunity(String hospitalCommunity) {
        this.hospitalCommunity = hospitalCommunity;
    }

    public long getHospitalEmergencyContact() {
        return hospitalEmergencyContact;
    }

    public void setHospitalEmergencyContact(long hospitalEmergencyContact) {
        this.hospitalEmergencyContact = hospitalEmergencyContact;
    }

    public short getHospitalPincode() {
        return hospitalPincode;
    }

    public void setHospitalPincode(short hospitalPincode) {
        this.hospitalPincode = hospitalPincode;
    }

    public String getHospitalCity() {
        return hospitalCity;
    }

    public void setHospitalCity(String hospitalCity) {
        this.hospitalCity = hospitalCity;
    }

    public String getHospitalEmail() {
        return hospitalEmail;
    }

    public void setHospitalEmail(String hospitalEmail) {
        this.hospitalEmail = hospitalEmail;
    }
    
    
}

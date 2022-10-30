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
    //private int hospitalId;
    private String hospitalName;
    private String hospitalAddress;
    private String hospitalCommunity;
    private long hospitalContact;
    private int hospitalPincode;
    private String hospitalCity; 
    private String hospitalEmail;
    
    private String hospitalUserName;
    private String hospitalPassword;

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

    public long getHospitalContact() {
        return hospitalContact;
    }

    public void setHospitalContact(long hospitalContact) {
        this.hospitalContact = hospitalContact;
    }

    public int getHospitalPincode() {
        return hospitalPincode;
    }

    public void setHospitalPincode(int hospitalPincode) {
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

    public String getHospitalUserName() {
        return hospitalUserName;
    }

    public void setHospitalUserName(String hospitalUserName) {
        this.hospitalUserName = hospitalUserName;
    }

    public String getHospitalPassword() {
        return hospitalPassword;
    }

    public void setHospitalPassword(String hospitalPassword) {
        this.hospitalPassword = hospitalPassword;
    }
    
}

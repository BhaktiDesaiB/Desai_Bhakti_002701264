/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author bhakti
 * 
 */
    
public class HospitalDirectory 
{
    private ArrayList<Hospital> hospitalDirectory;
    
    public HospitalDirectory()
    {
        this.hospitalDirectory = new ArrayList<Hospital>();
    }

    public ArrayList<Hospital> getHospitalDirectory()
    {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(ArrayList<Hospital> hospitalDirectory) 
    {
        this.hospitalDirectory = hospitalDirectory;
    }
    
    
       public Hospital addNewHospital()
    {
        Hospital newHospital = new Hospital();
        hospitalDirectory.add(newHospital);
        return newHospital;
    }
}

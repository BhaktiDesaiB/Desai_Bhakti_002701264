/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author bhakti
 */
public class DoctorDirectory 
{
    private ArrayList<Doctor> doctorDirectory;
    
     public DoctorDirectory()
    {
        this.doctorDirectory = new ArrayList<Doctor>();
    }

    public ArrayList<Doctor> getDoctorDirectory() 
    {
        return doctorDirectory;
    }

    public void setDoctorDirectory(ArrayList<Doctor> doctorDirectory) 
    {
        this.doctorDirectory = doctorDirectory;
    }
    
        public Doctor addNewDoctor()
    {
        Doctor newDoctor = new Doctor();
        doctorDirectory.add(newDoctor);
        return newDoctor;
    }
    
}

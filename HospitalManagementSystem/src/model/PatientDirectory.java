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
public class PatientDirectory 
{
    private ArrayList<Patient> patientHistory;

    public ArrayList<Patient> getPatientHistory() 
    {
        return patientHistory;
    }

    public void setPatientHistory(ArrayList<Patient> patientHistory) 
    {
        this.patientHistory = patientHistory;
    }
    
    
    
}

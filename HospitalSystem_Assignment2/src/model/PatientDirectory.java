/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author bhakti
 */
public class PatientDirectory 
{
   private ArrayList<Patient> patientDirectory;

   public PatientDirectory()
    {
        this.patientDirectory = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<Patient> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
  
    public Patient addNewPatient()
    {
        Patient newPatient = new Patient();
        patientDirectory.add(newPatient);
        return newPatient;
    }
}

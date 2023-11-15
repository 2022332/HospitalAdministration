/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitaladministration;

/**
 *
 * @author Ari
 */
public class Patient {
     /*
    Name
    Date of Birth
    Blood Type
    ID
    */
    
    String name;
    String birthDate;
    String bloodType;
    int patientID;
    // Static means it is a class variable
    // It is shared by ALL the objects of this class
    // We use this to auto generate the patient ids - will increment
    // with each patient
    private static int currentID = 1;

    public Patient(String name, String birthDate, String bloodType) {
        this.name = name;
        this.birthDate = birthDate;
        this.bloodType = bloodType;
        this.patientID = currentID;
        System.out.println(name + " has a birthday on " + birthDate);
        currentID++;
    }

    public static int getCurrentID() {
        return currentID;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getBloodType() {
        return bloodType;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setName(String name) {
        this.name = name;
    }
}

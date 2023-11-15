/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospitaladministration;

import java.sql.SQLException;
/**
 *
 * @author Ari
 */
public class HospitalAdministration {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.ClassNotFoundException
     * @throws java.lang.IllegalAccessException
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Patient p1 = new Patient("Stiles", "27/06/01", "O+");
        Patient p2 = new Patient("Derek", "08/07/99", "A-");
        
        System.out.println(p1.getPatientID());
        System.out.println(p2.getPatientID());
        
        System.out.println(Patient.getCurrentID());
        if (DatabaseSetup.setupDB()) {
            System.out.println("Database and table created");
        } 
        else {
            System.out.println("Oh no! There was a database creation problem...");
        }
        
        DatabaseWriter dbw = new  DatabaseWriter();
        if (dbw.addPatient(p1)){
            System.out.println("p1 added");
        }
    }
    
}

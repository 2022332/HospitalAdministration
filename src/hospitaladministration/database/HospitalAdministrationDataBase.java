/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospitaladministration.database;

import java.sql.SQLException;
/**
 *
 * @author Ari
 */
public class HospitalAdministrationDataBase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Patient p1 = new Patient("Stiles", "27/06/01", "O+");
        Patient p2 = new Patient("Derek", "08/07/99", "A-");
        
        System.out.println(p1.getPatientID());
        System.out.println(p2.getPatientID());
        
        System.out.println(Patient.getCurrentID());
        if (DatabaseSetup.setupDB()) {
            System.out.println("Database and table created");
        } else {
            System.out.println("Oh no! There was a database creation problem...");
        }
    }
    
}

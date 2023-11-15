/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitaladministration;

import static hospitaladministration.Database.DB_BASE_URL;
import static hospitaladministration.Database.PASSWORD;
import static hospitaladministration.Database.USER;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
/**
 *
 * @author Ari
 */
public class DatabaseWriter extends Database {
    public boolean addPatient(Patient patient) throws SQLException {
        try(
            Connection conn = DriverManager.getConnection(DB_BASE_URL, USER, PASSWORD);
            Statement stmt = conn.createStatement();  
        ){
            String sql = String.format("INSERT INTO " + TABLE_NAME + " VALUES ("
                    + "'%s', '%s', '%s', %d);",
                    patient.getName(), patient.getBirthDate(), patient.getBloodType(), patient.getPatientID());
            stmt.execute(sql);
            return true;
        }
    }
    public boolean addAllPatients(List<Patient> patientList) {
        return true;
    }
}

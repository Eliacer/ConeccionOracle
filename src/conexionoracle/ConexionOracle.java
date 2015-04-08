/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionoracle;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author alumno04
 */
public class ConexionOracle {
    public static void main(String[] args) {
        if (Conexion.conectar()== null) {
            System.out.println("La conexion fallo!!!..");
        } else {
            System.out.println("Conexion exitosa");

            try {
                Statement st = Conexion.conectar().createStatement();
                ResultSet rs = st.executeQuery("select * from persona");
                while (rs.next()) {                    
                    System.out.println("id_persona: "+rs.getInt("id_persona"));
                    System.out.println("nombre: "+rs.getInt("nombre"));
                    System.out.println("Ap_paterno: "+rs.getInt("ap_paterno"));
                    
                }
            } catch (Exception e) {
            }
        }
    }
    
}

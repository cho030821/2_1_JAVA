package inhatc.cse.java.app.ex5_DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {
    public static void main(String[] args){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            java.sql.Connection con =DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/javadb",
                    "root",
                    "Ha770524)(*&^%$"
            );
            Statement stmt = con.createStatement();
            stmt.executeUpdate("DROP TABLE IF EXISTS test");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("OK!");

    }
}

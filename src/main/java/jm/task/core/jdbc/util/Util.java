package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String userName = "root";
    private static final String password = "root";
    private static final String url = "jdbc:mysql://localhost:3306/mybase";




    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, userName, password);
    }
//      в коде везде используется try with resources, вызывать этот метод явно не требуется нигде
//    public static void close (Connection conn) {
//        if (conn != null) {
//            try{
//                conn.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }





}

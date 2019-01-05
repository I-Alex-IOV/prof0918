package com.vertex.jdbc;

import com.vertex.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class UserDB {

    private String url = "jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7272784";

    private String username = "sql7272784";

    private String password = "PmzTszft1n";

    private String driver = "com.mysql.cj.jdbc.Driver";

    public List<User> getUsers() {
        List<User> result = new ArrayList<>();

        Connection con = null;
        try {
            Class.forName(driver);

            con = DriverManager.getConnection(url, username, password);

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select id, name, surname, birthdate, email from users");

            while (rs.next()) {
                result.add(extractUser(rs));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public List<User> getUsers(String name) {
        List<User> result = new ArrayList<>();

        Connection con = null;
        try {
            Class.forName(driver);

            con = DriverManager.getConnection(url, username, password);

            PreparedStatement stmt = con.prepareStatement("select id, name, surname, birthdate, email from users where name = ?");
            stmt.setString(1, name);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                result.add(extractUser(rs));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    private User extractUser(ResultSet rs) throws SQLException {
        return User.builder()
                .id(rs.getInt("id"))
                .name(rs.getString("name"))
                .surname(rs.getString("surname"))
                .email(rs.getString("email"))
                .age(getAge(rs.getTimestamp("birthdate")))
                .build();
    }

    private int getAge(Timestamp birthdate) {
        Calendar now = Calendar.getInstance();

        Calendar birth = Calendar.getInstance();
        birth.setTimeInMillis(birthdate.getTime());

        return now.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
    }

    public static void main(String[] args) {
        UserDB userDB = new UserDB();

        System.out.println(userDB.getUsers());

        System.out.println(userDB.getUsers("Anka"));
    }

}

package databaseconnect.dao;


import databaseconnect.connection.DBConnection;
import databaseconnect.entity.AliviaDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class AliviaDBDao implements Dao<AliviaDB> {

    @Override
    public AliviaDB get(int id) {
        Connection connection = DBConnection.getConnection();
        AliviaDB phs = new AliviaDB();
        try {
            PreparedStatement ps = connection.prepareStatement("Select * from stocks where id = ?;");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                int idd = rs.getInt("id");
                String source_name = rs.getString("source_name");
                String url = rs.getString("url");
                String tag = rs.getString("tag");
                phs = new AliviaDB(idd, source_name,url, tag);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return phs;
    }

    @Override
    public List<AliviaDB> getAll() {
        Connection connection = DBConnection.getConnection();
        List<AliviaDB> AliviaDB = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("Select * from stocks;");
            while (rs.next()) {
                int id = rs.getInt("id");
                String source_name = rs.getString("source_name");
                String url = rs.getString("url");
                String tag = rs.getString("tag");

                AliviaDB phs = new AliviaDB(id, source_name, url, tag);
                AliviaDB.add(phs);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return AliviaDB;
    }

    public static void main(String[] args) {

    }

    @Override
    public void save(AliviaDB AliviaDB) {
        Connection connection = DBConnection.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement("insert into stocks(source_name, url) VALUES (?,?);");
            ps.setString(1, AliviaDB.getSource_name());
            ps.setString(2, AliviaDB.getUrl());


            int i = ps.executeUpdate();
            System.out.println(i);
            System.out.println("Object was created successful");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void update(AliviaDB aliviadb){
        Connection connection = DBConnection.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement("update stocks set id = ?, source_name = ?, url = ?, tag = ? where id = ?;");
            ps.setString(1, aliviadb.getSource_name());
            ps.setString(2, aliviadb.getUrl());
            ps.setString(3, aliviadb.getTag());
            ps.setInt(4, aliviadb.getId());
            int i = ps.executeUpdate();
            System.out.println(i);
            System.out.println("Object was updated successful");

        } catch (SQLException throwables) {
            throwables.printStackTrace();

        }
    }

    @Override
    public void delete(AliviaDB aliviadb) {
    delete(aliviadb.getId());
    }

    @Override
    public void delete(int id) {
            Connection connection = DBConnection.getConnection();
            try {
                PreparedStatement ps = connection.prepareStatement("delete from stocks where id = ?;");
                ps.setInt(1, id);
                int i = ps.executeUpdate();
                System.out.println(i);
                System.out.println("Object was deleted successful");

            } catch (SQLException throwables) {
                throwables.printStackTrace();

            }
        }
    }



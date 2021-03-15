package databaseconnect.dao;

import databaseconnect.connection.DBConnection;
import databaseconnect.entity.AliviaObjectInfo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class AliviaDBDao implements Dao<AliviaObjectInfo> {

    @Override
    public AliviaObjectInfo get(int id) {
        Connection connection = DBConnection.getConnection();
        AliviaObjectInfo phs = new AliviaObjectInfo();
        try {
            PreparedStatement ps = connection.prepareStatement("Select * from stocks where id = ?;");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int idd = rs.getInt("id");
                String source_name = rs.getString("source_name");
                String url = rs.getString("url");
                String description = rs.getString("description");
                String img = rs.getString("img");
                phs = new AliviaObjectInfo(idd, source_name, url, description, img);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return phs;
    }

    @Override
    public List<AliviaObjectInfo> getAllClouds() {
        Connection connection = DBConnection.getConnection();
        List<AliviaObjectInfo> AliviaObjectInfo = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("Select * from cloud_sources");
            while (rs.next()) {
                int id = rs.getInt("id");
                String source_name = rs.getString("source_name");
                String url = rs.getString("url");
                String description = rs.getString("description");
                String img = rs.getString("img");

                AliviaObjectInfo phs = new AliviaObjectInfo(id, source_name, url, description, img);
                AliviaObjectInfo.add(phs);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return AliviaObjectInfo;
    }

    @Override
    public List<AliviaObjectInfo> getAllInspiration() {
        Connection connection = DBConnection.getConnection();
        List<AliviaObjectInfo> AliviaObjectInfo = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("Select * from inspiration");
            while (rs.next()) {
                int id = rs.getInt("id");
                String source_name = rs.getString("source_name");
                String url = rs.getString("url");
                String description = rs.getString("description");
                String img = rs.getString("img");

                AliviaObjectInfo phs = new AliviaObjectInfo(id, source_name, url, description, img);
                AliviaObjectInfo.add(phs);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return AliviaObjectInfo;
    }

    @Override
    public List<AliviaObjectInfo> getAllEditSoft() {
        Connection connection = DBConnection.getConnection();
        List<AliviaObjectInfo> AliviaObjectInfo = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("Select * from editsoft");
            while (rs.next()) {
                int id = rs.getInt("id");
                String source_name = rs.getString("source_name");
                String url = rs.getString("url");
                String description = rs.getString("description");
                String img = rs.getString("img");

                AliviaObjectInfo phs = new AliviaObjectInfo(id, source_name, url, description, img);
                AliviaObjectInfo.add(phs);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return AliviaObjectInfo;
    }

    @Override
    public List<AliviaObjectInfo> getAllEducation() {
        Connection connection = DBConnection.getConnection();
        List<AliviaObjectInfo> AliviaObjectInfo = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("Select * from education");
            while (rs.next()) {
                int id = rs.getInt("id");
                String source_name = rs.getString("source_name");
                String url = rs.getString("url");
                String description = rs.getString("description");
                String img = rs.getString("img");

                AliviaObjectInfo phs = new AliviaObjectInfo(id, source_name, url, description, img);
                AliviaObjectInfo.add(phs);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return AliviaObjectInfo;
    }

    @Override
    public List<AliviaObjectInfo> getAllStocks() {
        Connection connection = DBConnection.getConnection();
        List<AliviaObjectInfo> AliviaObjectInfo = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("Select * from stocks");
            while (rs.next()) {
                int id = rs.getInt("id");
                String source_name = rs.getString("source_name");
                String url = rs.getString("url");
                String description = rs.getString("description");
                String img = rs.getString("img");

                AliviaObjectInfo phs = new AliviaObjectInfo(id, source_name, url, description, img);
                AliviaObjectInfo.add(phs);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return AliviaObjectInfo;
    }


    @Override
    public void save(AliviaObjectInfo aliviaobjectinfo) {
        Connection connection = DBConnection.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement("insert into stocks(source_name, url, description, img) VALUES (?,?,?,?);");
            ps.setString(1, aliviaobjectinfo.getSource_name());
            ps.setString(2, aliviaobjectinfo.getUrl());
            ps.setString(3, aliviaobjectinfo.getDescription());
            ps.setString(4, aliviaobjectinfo.getImg());

            int i = ps.executeUpdate();
            System.out.println(i);
            System.out.println("Object was created successful");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void update(AliviaObjectInfo aliviaobjectinfo) {
        Connection connection = DBConnection.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement("update stocks set id = ?, source_name = ?, url = ?, description = ?, img = ? where id = ?;");
            ps.setString(1, aliviaobjectinfo.getSource_name());
            ps.setString(2, aliviaobjectinfo.getUrl());
            ps.setString(3, aliviaobjectinfo.getDescription());
            ps.setString(4, aliviaobjectinfo.getImg());
            ps.setInt(5, aliviaobjectinfo.getId());
            int i = ps.executeUpdate();
            System.out.println(i);
            System.out.println("Object was updated successful");

        } catch (SQLException throwables) {
            throwables.printStackTrace();

        }
    }

    @Override
    public void delete(AliviaObjectInfo aliviaobjectinfo) {
        delete(aliviaobjectinfo.getId());
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



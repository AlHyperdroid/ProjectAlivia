package dao;

import JDBCFirst.JDBCExample;
import connection.DBConnection;
import entity.PhotoSites;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class PhotoSitesDao implements Dao<PhotoSites> {

    @Override
    public PhotoSites get(int id) {
        Connection connection = DBConnection.getConnection();
        PhotoSites phs = new PhotoSites();
        try {
            PreparedStatement ps = connection.prepareStatement("Select * from photosites where id = ?;");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                int idd = rs.getInt("id");
                String source_name = rs.getString("source_name");
                String url = rs.getString("url");
                String tag = rs.getString("tag");
                phs = new PhotoSites(idd, source_name,url, tag);
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
    public List<PhotoSites> getAll() {
        Connection connection = DBConnection.getConnection();
        List<PhotoSites> photoSites = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("Select * from photosites;");
            while (rs.next()) {
                int id = rs.getInt("id");
                String source_name = rs.getString("source_name");
                String url = rs.getString("url");
                String tag = rs.getString("tag");

                PhotoSites phs = new PhotoSites(id, source_name, url, tag);
                photoSites.add(phs);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return photoSites;
    }

    public static void main(String[] args) {

    }


    @Override
    public void save(PhotoSites photoSites) {

    }

    @Override
    public void update(PhotoSites photoSites, String[] params) {

    }

    @Override
    public void delete(PhotoSites photoSites) {
    delete(photoSites.getId());
    }

    @Override
    public void delete(int id) {
            Connection connection = DBConnection.getConnection();
            try {
                PreparedStatement ps = connection.prepareStatement("delete from photosites where id = ?;");
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();
                if(!rs.next()) {
                    System.out.println("Object was deleted successful");
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
        }
    }



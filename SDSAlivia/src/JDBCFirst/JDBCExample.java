package JDBCFirst;

import java.sql.*;

public class JDBCExample {

    private static class PhotoSites{
        private int id;
        private String source_name;
        private String url;
        private String tag;

        public PhotoSites(int id, String source_name, String url, String tag) {
            this.id = id;
            this.source_name = source_name;
            this.url = url;
            this.tag = tag;

        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getSource_name() {
            return source_name;
        }

        public void setSource_name(String source_name) {
            this.source_name = source_name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        @Override
        public String toString() {
            return "PhotoSites{" +
                    "id=" + id +
                    ", source_name='" + source_name + '\'' +
                    ", url='" + url + '\'' +
                    ", tag='" + tag + '\'' +
                    '}';
        }
    }

    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "35271720";

    public static void main(String[] args) {
        Connection connection = null;

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            if (connection != null) {
                System.out.println("Successful Connection to PostgreSQL");
            }

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("Select * from photosites;");
            while(rs.next()){
               int id = rs.getInt("id");
               String source_name = rs.getString("source_name");
               String url = rs.getString("url");
               String tag = rs.getString("tag");

               PhotoSites ps = new PhotoSites(id, source_name, url, tag);
                System.out.println(ps);

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
    }
}

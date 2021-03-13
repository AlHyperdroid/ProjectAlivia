package databaseconnect.JDBCFirst;

import databaseconnect.dao.AliviaDBDao;
import databaseconnect.entity.AliviaDB;

public class JDBCExample {

    public static void main(String[] args) {
        AliviaDBDao photoSitesDao = new AliviaDBDao();
        AliviaDB src = new AliviaDB();
        src.setSource_name("123RF");
        src.setUrl("https://ru.123rf.com/aboutus.php");
        photoSitesDao.save(src);
    }
}


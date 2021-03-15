package databaseconnect.JDBCFirst;

import databaseconnect.dao.AliviaDBDao;
import databaseconnect.entity.AliviaObjectInfo;

public class JDBCExample {

    public static void main(String[] args) {
        AliviaDBDao photoSitesDao = new AliviaDBDao();
        AliviaObjectInfo src = new AliviaObjectInfo();
        //src.setSource_name("123RF");
        //src.setUrl("https://ru.123rf.com/aboutus.php");
        //photoSitesDao.save(src);
        //photoSitesDao.getAll();
    }
}


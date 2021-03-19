package databaseconnect.JDBCFirst;

import databaseconnect.dao.AliviaInfoDao;
import databaseconnect.entity.AliviaObjectInfo;

public class JDBCExample {

    public static void main(String[] args) {
        AliviaInfoDao photoSitesDao = new AliviaInfoDao();
        AliviaObjectInfo src = new AliviaObjectInfo();
        //src.setSource_name("123RF");
        //src.setUrl("https://ru.123rf.com/aboutus.php");
        //photoSitesDao.save(src);
        //photoSitesDao.getAll();
    }
}


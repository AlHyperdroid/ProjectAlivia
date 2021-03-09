package JDBCFirst;

import dao.PhotoSitesDao;
import entity.PhotoSites;

public class JDBCExample {

    public static void main(String[] args) {
        PhotoSitesDao photoSitesDao = new PhotoSitesDao();
        PhotoSites src = new PhotoSites();
        src.setSource_name("123RF");
        src.setUrl("https://ru.123rf.com/aboutus.php");
        photoSitesDao.save(src);
    }
}


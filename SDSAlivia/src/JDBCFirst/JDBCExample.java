package JDBCFirst;

import dao.PhotoSitesDao;
import entity.PhotoSites;

public class JDBCExample {

    public static void main(String[] args) {
        PhotoSitesDao photoSitesDao = new PhotoSitesDao();
        PhotoSites src = new PhotoSites();
        src.setSource_name("Pinterest");
        src.setUrl("https://www.pinterest.com");
        src.setTag("pinterest");
        photoSitesDao.save(src);
    }
}


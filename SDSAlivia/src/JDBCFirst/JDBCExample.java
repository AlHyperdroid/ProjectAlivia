package JDBCFirst;

import dao.PhotoSitesDao;
import entity.PhotoSites;

public class JDBCExample {



    public static void main(String[] args) {
        PhotoSitesDao photoSitesDao = new PhotoSitesDao();
        PhotoSites National = photoSitesDao.get(1);
        System.out.println(National);

    }
}


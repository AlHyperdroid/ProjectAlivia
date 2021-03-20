package springboot;

import databaseconnect.dao.AliviaInfoDao;
import databaseconnect.entity.AliviaObjectInfo;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class SpringController {

  /* @RequestMapping("/")
    public String welcome() {
        return "/index.html";
    }

    @RequestMapping("/1")
    public String welcome1() {
        return "page1.html";
    }*/
   @GetMapping("/home")
   public List<AliviaObjectInfo> getAllHome() {
       AliviaInfoDao aliviaInfoDao = new AliviaInfoDao();
       return aliviaInfoDao.getAllHome();
   }

    @GetMapping("/inspiration")
    public List<AliviaObjectInfo> getAllInspiration() {
        AliviaInfoDao aliviaInfoDao = new AliviaInfoDao();
        return aliviaInfoDao.getAllInspiration();
    }

    @GetMapping("/education")
    public List<AliviaObjectInfo> getAllEducation() {
        AliviaInfoDao aliviaInfoDao = new AliviaInfoDao();
        return aliviaInfoDao.getAllEducation();
    }

    @GetMapping("/editsoft")
    public List<AliviaObjectInfo> getAllEditSoft() {
        AliviaInfoDao aliviaInfoDao = new AliviaInfoDao();
        return aliviaInfoDao.getAllEditSoft();
    }

    @GetMapping("/stocks")
    public List<AliviaObjectInfo> getAllStocks() {
        AliviaInfoDao aliviaInfoDao = new AliviaInfoDao();
        return aliviaInfoDao.getAllStocks();
    }

    @GetMapping("/clouds")
    public List<AliviaObjectInfo> getAllClouds() {
        AliviaInfoDao aliviaInfoDao = new AliviaInfoDao();
        return aliviaInfoDao.getAllClouds();
    }
}


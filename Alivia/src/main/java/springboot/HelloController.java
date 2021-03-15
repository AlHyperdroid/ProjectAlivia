package springboot;

import databaseconnect.dao.AliviaDBDao;
import databaseconnect.entity.AliviaObjectInfo;
import org.json.JSONArray;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class HelloController {

  /*  @RequestMapping("/")
    public String welcome() {
        return "index";
    }

    @RequestMapping("/1")
    public String welcome1() {
        return "page1.html";
    }*/

    @GetMapping("/inspiration")
    public List<AliviaObjectInfo> getAllInspiration() {
        AliviaDBDao aliviaDBDao = new AliviaDBDao();
        return aliviaDBDao.getAllInspiration();
    }

    @GetMapping("/education")
    public List<AliviaObjectInfo> getAllEducation() {
        AliviaDBDao aliviaDBDao = new AliviaDBDao();
        return aliviaDBDao.getAllEducation();
    }

    @GetMapping("/editsoft")
    public List<AliviaObjectInfo> getAllEditSoft() {
        AliviaDBDao aliviaDBDao = new AliviaDBDao();
        return aliviaDBDao.getAllEditSoft();
    }

    @GetMapping("/stocks")
    public List<AliviaObjectInfo> getAllStocks() {
        AliviaDBDao aliviaDBDao = new AliviaDBDao();
        return aliviaDBDao.getAllStocks();
    }

    @GetMapping("/clouds")
    public List<AliviaObjectInfo> getAllClouds() {
        AliviaDBDao aliviaDBDao = new AliviaDBDao();
        return aliviaDBDao.getAllClouds();
    }


}


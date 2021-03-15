package databaseconnect.dao;

import java.util.List;

public interface Dao<T> {
    T get(int id);

    List<T> getAllClouds();

    List<T> getAllEditSoft();

    List<T> getAllEducation();

    List<T> getAllInspiration();

    List<T> getAllStocks();


    void save(T t);

    void update(T t);

    void delete(T t);

    void delete(int id);
}

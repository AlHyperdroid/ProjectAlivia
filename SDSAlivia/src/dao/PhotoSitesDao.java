package dao;

import entity.PhotoSites;

import java.util.List;
import java.util.Optional;

public class PhotoSitesDao implements Dao<PhotoSites> {


    @Override
    public Optional<PhotoSites> get(int id) {
        return Optional.empty();
    }

    @Override
    public List<PhotoSites> getAll() {
        return null;
    }

    @Override
    public void save(PhotoSites photoSites) {

    }

    @Override
    public void update(PhotoSites photoSites, String[] params) {

    }

    @Override
    public void delete(PhotoSites photoSites) {

    }

    @Override
    public void delete(int id) {

    }
}


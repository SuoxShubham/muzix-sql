package com.stackroute.springMuzix.dao;

//import com.stackroute.springMuzix.entity.Track;
//import com.stackroute.springMuzix.entity.Track;
import com.stackroute.springMuzix.entity.Track;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TrackDAO {
    public List<Track> findAll();

    public void save(Track t);
//
    public void deleteById(int trackId);
//
    public Track findById(int trackId);
}

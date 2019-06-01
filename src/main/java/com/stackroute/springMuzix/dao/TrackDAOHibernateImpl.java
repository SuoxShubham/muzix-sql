package com.stackroute.springMuzix.dao;

import com.stackroute.springMuzix.entity.Track;
import com.stackroute.springMuzix.entity.Track;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class TrackDAOHibernateImpl implements TrackDAO {

    //define field for EntityManager
    private EntityManager entityManager;

    //setup constructor injection
    @Autowired
    public TrackDAOHibernateImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }
    @Override
    //@Transactional
    public List<Track> findAll() {

        //get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        //create a query
        Query<Track> theQuery = currentSession.createQuery("from Track", Track.class);
        // execute query and get result list
        List<Track> tracks = theQuery.getResultList();
        //return the results
        return tracks;
    }


    @Override
    public Track findById(int trackId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Track tr = currentSession.get(Track.class,trackId);
        return tr;
    }
    @Override
    public void save(Track track) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(track);
    }
    @Override
    public void deleteById(int trackId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query query = currentSession.createQuery("delete from track where id=:id");
        query.setParameter("id",trackId);
        query.executeUpdate();
    }

}

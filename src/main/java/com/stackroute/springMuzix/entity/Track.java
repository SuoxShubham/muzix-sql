package com.stackroute.springMuzix.entity;


import javax.persistence.*;

@Entity
@Table(name = "track")
public class Track {

    //defince the fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "track_name")
    private String trackName;

    @Column(name = "track_comments")
    private String trackComments;



    //defince the constructor

    public Track() {

    }

    public Track(String trackName, String trackComments) {
        this.trackName = trackName;
        this.trackComments = trackComments;
    }

    //define the getter/setter method

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getTrackComments() {
        return trackComments;
    }

    public void setTrackComments(String trackComments) {
        this.trackComments = trackComments;
    }


    //define the toString

    @Override
    public String toString() {
        return "Track{" +
                "id=" + id +
                ", trackName='" + trackName + '\'' +
                ", trackComments='" + trackComments + '\'' +
                '}';
    }
}

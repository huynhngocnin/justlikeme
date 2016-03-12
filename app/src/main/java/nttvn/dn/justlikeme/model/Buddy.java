package nttvn.dn.justlikeme.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import nttvn.dn.justlikeme.common.Constants;

/**
 * Created by NinHN on 3/10/16.
 */
public class Buddy implements Serializable {
    private String id;
    private String token = Constants.BLANK;
    private String name;
    private double[] location;
    private Date lastUpTime;

    private List<Hashtag> hashtags;
    private PokeType pokeType;
    private Double radius;

    private Double distance;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getLocation() {
        return location;
    }

    public void setLocation(double[] location) {
        this.location = location;
    }

    public Date getLastUpTime() {
        return lastUpTime;
    }

    public void setLastUpTime(Date lastUpTime) {
        this.lastUpTime = lastUpTime;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public PokeType getPokeType() {
        return pokeType;
    }

    public void setPokeType(PokeType pokeType) {
        this.pokeType = pokeType;
    }

    public List<Hashtag> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<Hashtag> hashtags) {
        this.hashtags = hashtags;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }


}

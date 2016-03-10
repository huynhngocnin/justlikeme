package nttvn.dn.justlikeme.model;

import java.util.List;

import nttvn.dn.justlikeme.common.Constants;

/**
 * Created by NinHN on 3/10/16.
 */
public class Buddy {
    private String token = Constants.BLANK;
    private String name;
    private Long lat;
    private Long lon;
    private List<String> listHash;

    public Buddy() {
    }

    public Buddy(String token, String name) {
        setToken(token);
        setName(name);
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

    public Long getLat() {
        return lat;
    }

    public void setLat(Long lat) {
        this.lat = lat;
    }

    public Long getLon() {
        return lon;
    }

    public void setLon(Long lon) {
        this.lon = lon;
    }

    public List<String> getListHash() {
        return listHash;
    }

    public void setListHash(List<String> listHash) {
        this.listHash = listHash;
    }
}

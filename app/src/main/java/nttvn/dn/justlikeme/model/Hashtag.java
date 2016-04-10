package nttvn.dn.justlikeme.model;

import java.io.Serializable;

/**
 * Created by ninhn on 2016/03/12.
 */
public class Hashtag implements Serializable {

    private String id;
    private String hash;
    private String type;
    private String lastUpTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLastUpTime() {
        return lastUpTime;
    }

    public void setLastUpTime(String lastUpTime) {
        this.lastUpTime = lastUpTime;
    }
}

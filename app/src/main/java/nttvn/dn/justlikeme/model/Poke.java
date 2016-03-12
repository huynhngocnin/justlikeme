package nttvn.dn.justlikeme.model;

import java.io.Serializable;

/**
 * Created by ninhn on 2016/03/12.
 */
public class Poke implements Serializable {
    private String myToken;
    private String yourToken;
    private PokeType pokeType;

    public String getMyToken() {
        return myToken;
    }

    public void setMyToken(String myToken) {
        this.myToken = myToken;
    }

    public String getYourToken() {
        return yourToken;
    }

    public void setYourToken(String yourToken) {
        this.yourToken = yourToken;
    }

    public PokeType getPokeType() {
        return pokeType;
    }

    public void setPokeType(PokeType pokeType) {
        this.pokeType = pokeType;
    }
}

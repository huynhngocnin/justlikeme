package nttvn.dn.justlikeme.model;

/**
 * Created by ninhn on 2016/03/12.
 */
public enum PokeType {
    POKE(1), ACCEPT(2), CANCEL(3);

    PokeType(int num) {
        this.num = num;
    }

    private int num;

    public int getNum() {
        return num;
    }
}
package nttvn.dn.justlikeme.helper;

/**
 * Created by ninhn on 2016/03/12.
 */
public class AppValue {

    private static AppValue instace;
    private double[] location;

    public static AppValue getInstance() {
        if (instace == null) {
            instace = new AppValue();
        }
        return instace;
    }

    public double[] getLocation() {
        return location;
    }

    public void setLocation(double[] location) {
        this.location = location;
    }
}

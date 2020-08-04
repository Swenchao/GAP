import java.util.List;
import java.util.Map;

/**
 * 用户设备
 * @author sc
 */
public class UserEquipments {
    private int id;
    /**用户可用微云列表*/
    private List<CloudLets> cloudLetsList;
    /**用户avatr所在微云*/
    private CloudLets cloudLets;
    /**Avatar*/
    private Avatar avatar;
    /**所在坐标*/
    private Float[] location = new Float[2];
    /**目的地坐标*/
    private Float[] desLocation = new Float[2];

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<CloudLets> getCloudLetsList() {
        return cloudLetsList;
    }

    public void setCloudLetsList(List<CloudLets> cloudLetsList) {
        this.cloudLetsList = cloudLetsList;
    }

    public CloudLets getCloudLets() {
        return cloudLets;
    }

    public void setCloudLets(CloudLets cloudLets) {
        this.cloudLets = cloudLets;
    }

    public Float[] getLocation() {
        return location;
    }

    public void setLocation(Float[] location) {
        this.location = location;
    }

    public Float[] getDesLocation() {
        return desLocation;
    }

    public void setDesLocation(Float[] desLocation) {
        this.desLocation = desLocation;
    }

    public Avatar getAvatar() {
        return avatar;
    }

    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }
}

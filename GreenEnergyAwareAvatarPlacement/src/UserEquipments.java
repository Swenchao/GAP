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
    /** 用户avatr所在微云*/
    private CloudLets cloudLets;
    /**Avatar*/
    private Avatar avatar;
    /**横坐标*/
    private int x;
    /**横坐标*/
    private int y;

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

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Avatar getAvatar() {
        return avatar;
    }

    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }
}

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * 微云
 * @author sc
 */
public class CloudLets {
    private int id;
    // PM数量
    private static int physicalMachinesNum = 20;
    // avatar数量
    private static int avatarNum = 100;
    /**当前avatar可放剩余数量*/
    private int avatarNumNow;
    /**微云基站*/
    private BaseStation baseStation;
    /**绿色能源发电*/
    private int greenEng;
    /**微云中包含的 pm 集合*/
    private List<PhysicalMachines> pmList;
    /**微云中avatar集合*/
    private List<Avatar> avatarList;
    /**利润*/
    private Map<Integer, Float> profit;
    /**横坐标范围*/
    private Integer[] x = new Integer[2];
    /**纵坐标范围*/
    private Integer[] y = new Integer[2];

    public Integer[] getX() {
        return x;
    }

    public void setX(Integer[] x) {
        this.x = x;
    }

    public Integer[] getY() {
        return y;
    }

    public void setY(Integer[] y) {
        this.y = y;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getPhysicalMachinesNum() {
        return physicalMachinesNum;
    }

    public static void setPhysicalMachinesNum(int physicalMachinesNum) {
        CloudLets.physicalMachinesNum = physicalMachinesNum;
    }

    public BaseStation getBaseStation() {
        return baseStation;
    }

    public void setBaseStation(BaseStation baseStation) {
        this.baseStation = baseStation;
    }

    public int getGreenEng() {
        return greenEng;
    }

    public void setGreenEng(int greenEng) {
        this.greenEng = greenEng;
    }

    public List<PhysicalMachines> getPmList() {
        return pmList;
    }

    public void setPmList(List<PhysicalMachines> pmList) {
        this.pmList = pmList;
    }

    public List<Avatar> getAvatarList() {
        return avatarList;
    }

    public void setAvatarList(List<Avatar> avatarList) {
        this.avatarList = avatarList;
    }

    public Map<Integer, Float> getProfit() {
        return profit;
    }

    public void setProfit(Map<Integer, Float> profit) {
        this.profit = profit;
    }

    public static int getAvatarNum() {
        return avatarNum;
    }

    public static void setAvatarNum(int avatarNum) {
        CloudLets.avatarNum = avatarNum;
    }

    public int getAvatarNumNow() {
        return avatarNumNow;
    }

    public void setAvatarNumNow(int avatarNumNow) {
        this.avatarNumNow = avatarNumNow;
    }

    @Override
    public String toString() {
        return "CloudLets{" +
                "id=" + id +
                ", avatarNumNow=" + avatarNumNow +
                ", baseStation=" + baseStation +
                ", greenEng=" + greenEng +
                ", pmList=" + pmList +
                ", avatarList=" + avatarList +
                ", profit=" + profit +
                ", x=" + Arrays.toString(x) +
                ", y=" + Arrays.toString(y) +
                '}';
    }
}

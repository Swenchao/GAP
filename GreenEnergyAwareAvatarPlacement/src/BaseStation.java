// 基站
public class BaseStation {
    private int baseStationId;

    /**对应微云*/
    private CloudLets cloudLets;

    /**微云到基站延迟*/
    private int bsToclDelay;

    public int getBaseStationId() {
        return baseStationId;
    }

    public void setBaseStationId(int baseStationId) {
        this.baseStationId = baseStationId;
    }

    public CloudLets getCloudLets() {
        return cloudLets;
    }

    public void setCloudLets(CloudLets cloudLets) {
        this.cloudLets = cloudLets;
    }

    public int getBsToclDelay() {
        return bsToclDelay;
    }

    public void setBsToclDelay(int bsToclDelay) {
        this.bsToclDelay = bsToclDelay;
    }
}

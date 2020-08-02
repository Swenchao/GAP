public class Avatar {
    private int avatarID;
    /**用户 id*/
    private UserEquipments userEquipments;
    /**所在微云id*/
    private int cloudLetsId;
    /**休眠状态能源消耗*/
    private int pIdle;
    /**cpu利用率*/
    private float cpuUtilization;

    public int getAvatarID() {
        return avatarID;
    }

    public void setAvatarID(int avatarID) {
        this.avatarID = avatarID;
    }

    public UserEquipments getUserEquipments() {
        return userEquipments;
    }

    public void setUserEquipments(UserEquipments userEquipments) {
        this.userEquipments = userEquipments;
    }

    public int getCloudLetsId() {
        return cloudLetsId;
    }

    public void setCloudLetsId(int cloudLetsId) {
        this.cloudLetsId = cloudLetsId;
    }

    public int getpIdle() {
        return pIdle;
    }

    public void setpIdle(int pIdle) {
        this.pIdle = pIdle;
    }

    public float getCpuUtilization() {
        return cpuUtilization;
    }

    public void setCpuUtilization(float cpuUtilization) {
        this.cpuUtilization = cpuUtilization;
    }
}

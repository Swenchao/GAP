import java.io.ByteArrayInputStream;
import java.util.*;


public class GAP {
    /**根据区域存放微云，方便后面avatar添加*/
    public static Map<String, CloudLets> cloudLetsMap = new HashMap<>();

    public static void main(String[] args) {

        // CloudLets数量
        int numCloudLets = 16;
        List<CloudLets> cloudLetsList = initCloudLets(numCloudLets);
//        System.out.println(cloudLetsMap);
//        for (CloudLets cloudLets : cloudLetsList) {
//            System.out.println("===============================");
//            System.out.println(cloudLets.getId());
//            System.out.println(cloudLets.getX()[0]);
//            System.out.println(cloudLets.getX()[1]);
//            System.out.println("---------------------------------");
//            System.out.println(cloudLets.getY()[0]);
//            System.out.println(cloudLets.getY()[1]);
//        }

        /**UserEquipments数量*/
        int numUE = 1000;
        List<UserEquipments> userEquipmentsList = initUserEquipments(numUE);
//        for (UserEquipments userEquipments : userEquipmentsList){
//            System.out.println("----------------------------");
//            System.out.println(userEquipments.getCloudLets());
//        }

    }

    /**
     * 初始化微云
     * @param num
     * @return
     */
    public static List<CloudLets> initCloudLets(int num){
        List<CloudLets> cloudLetsList = new ArrayList<>();

        // 微云横坐标范围
        int xLeft = 0;
        // 微云纵坐标范围
        int yLeft = 0;

        for (int i = 0 ; i < num ; ++i) {

            // 坐标赋值（X Y）
            Integer[] tempX = new Integer[2];
            Integer[] tempY = new Integer[2];

            CloudLets cloudLets = new CloudLets();
            cloudLets.setId(i);
            BaseStation bs = new BaseStation();
            bs.setBaseStationId(i);
            bs.setCloudLets(cloudLets);
            cloudLets.setBaseStation(bs);

            // 区分城市还是农村
            if (i == 5 || i == 6 || i == 9 || i == 10) {
                bs.setCity(true);
            } else {
                bs.setCity(false);
            }

            // 微云区域赋值
            if ((i+1) % 4 != 0) {
                tempX[0] = xLeft;
                tempX[1] = xLeft + 2;
                cloudLets.setX(tempX);
                String key = xLeft + "";
                xLeft += 2;
                tempY[0] = yLeft;
                tempY[1] = yLeft + 2;
                cloudLets.setY(tempY);
                key = key + yLeft + "";
                cloudLets.setAvatarNumNow(0);
                cloudLetsMap.put(key, cloudLets);
            } else {
                tempX[0] = xLeft;
                tempX[1] = xLeft + 2;
                cloudLets.setX(tempX);
                String key = xLeft + "";
                tempY[0] = yLeft;
                tempY[1] = yLeft + 2;
                cloudLets.setY(tempY);
                key = key + yLeft + "";
                cloudLets.setAvatarNumNow(0);
                cloudLetsMap.put(key, cloudLets);
                xLeft = 0;
                yLeft += 2;
            }
            cloudLetsList.add(cloudLets);
        }
        return cloudLetsList;
    }

    /**
     * 初始化用户
     * @param num
     * @return
     */
    public static List<UserEquipments> initUserEquipments(int num){
        List<UserEquipments> userEquipmentsList = new ArrayList<>();
        for (int i = 0 ; i < num ; ++i){

            Float[] location = new Float[2];
            Float[] desLocation = new Float[2];
            UserEquipments userEquipments = new UserEquipments();
            userEquipments.setId(i);
            Avatar avatar = new Avatar();

            // 用户所在位置(初始位置和终点位置)
            float xLocation = Utils.formatNum(Utils.nextFloat(0,8));
            float yLocation = Utils.formatNum(Utils.nextFloat(0,8));
            float xDesLocation = Utils.formatNum(Utils.nextFloat(0,8));
            float yDesLocation = Utils.formatNum(Utils.nextFloat(0,8));
            location[0] = xLocation;
            location[1] = yLocation;
            desLocation[0] = xDesLocation;
            desLocation[1] = yDesLocation;
            userEquipments.setLocation(location);
            userEquipments.setDesLocation(desLocation);

            // 查找可用微云
            findCloudLets(userEquipments);

            userEquipmentsList.add(userEquipments);
        }
        return userEquipmentsList;
    }

    /**
     * 根据 userEquipments 位置获得可用微云
     * @param userEquipments
     */
    public static void findCloudLets(UserEquipments userEquipments){
        List<CloudLets> cloudLetsList = new ArrayList<>();

        Float[] location = userEquipments.getLocation();
        float x = location[0];
        float y = location[1];

        // 获取x范围
        int xKey = ((int)Math.floor(x/2))*2;
        int yKey = ((int)Math.floor(y/2))*2;

        if (xKey == 8){
            xKey = 6;
        }
        if (yKey == 8){
            yKey = 6;
        }

        // 选择可用微云
        CloudLets cloudLets = cloudLetsMap.get(xKey + "" + yKey + "");
        int num = cloudLets.getAvatarNumNow();
        if (num < CloudLets.getAvatarNum()){
            cloudLets.setAvatarNumNow(num+1);
            userEquipments.setCloudLets(cloudLets);
        }

        int temp;
        if (xKey - 2 > 0){
            temp = xKey - 2;
            CloudLets cloudLetsAvaliable = cloudLetsMap.get(temp + "" + yKey + "");
            cloudLetsList.add(cloudLetsAvaliable);
        }
        if (yKey - 2 > 0){
            temp = yKey - 2;
            CloudLets cloudLetsAvaliable = cloudLetsMap.get(xKey + "" + temp + "");
            cloudLetsList.add(cloudLetsAvaliable);
        }
        if (xKey + 2 <= 8){
            temp = xKey + 2;
            CloudLets cloudLetsAvaliable = cloudLetsMap.get(temp + "" + yKey + "");
            cloudLetsList.add(cloudLetsAvaliable);
        }
        if (yKey + 2 <= 8){
            temp = yKey + 2;
            CloudLets cloudLetsAvaliable = cloudLetsMap.get(xKey + "" + temp + "");
            cloudLetsList.add(cloudLetsAvaliable);
        }
        userEquipments.setCloudLetsList(cloudLetsList);
    }
}

import java.io.ByteArrayInputStream;
import java.util.*;


public class GAP {
    public static void main(String[] args) {
        List<UserEquipments> userEquipmentsList = new ArrayList<UserEquipments>(1000);
        List<CloudLets> cloudLetsList = new ArrayList<CloudLets>(16);

        // 根据区域存放微云，方便后面avatar添加
        Map<String, CloudLets> cloudLetsMap = new HashMap<>();
        int id = 0;
        int bsId = 0;

        // 微云横坐标范围
        int xLeft = 0;
        // 微云纵坐标范围
        int yLeft = 0;

        for (CloudLets cloudLets : cloudLetsList){
            cloudLets.setId(id++);
            BaseStation bs = new BaseStation();
            bs.setBaseStationId(bsId++);
            bs.setCloudLets(cloudLets);
            cloudLets.setBaseStation(bs);
            if (id == 6 || id ==7 || id == 10 || id == 11){
                bs.setCity(true);
            }
            else{
                bs.setCity(false);
            }
            // 微云区域赋值
            if (id % 4 != 0 ) {
                Integer[] temp = new Integer[2];
                temp[0] = xLeft;
                temp[1] = xLeft + 2;
                cloudLets.setX(temp);
                String key = xLeft + "";
                xLeft += 2;
                temp[0] = yLeft;
                temp[1] = yLeft + 2;
                cloudLets.setY(temp);
                key = key + yLeft + "";
                cloudLetsMap.put(key, cloudLets);
            }
            else {
                Integer[] temp = new Integer[2];
                temp[0] = xLeft;
                temp[1] = xLeft + 2;
                cloudLets.setX(temp);
                String key = xLeft + "";
                temp[0] = yLeft;
                temp[1] = yLeft + 2;
                cloudLets.setY(temp);
                key = key + yLeft + "";
                cloudLetsMap.put(key, cloudLets);
                xLeft = 0;
                yLeft += 2;
            }
        }
        id = 0;
        for (UserEquipments userEquipment : userEquipmentsList){
            Avatar avatar = new Avatar();
            Random random = new Random();

            // 用户所在位置
            float x = Utils.formatNum(Utils.nextFloat(0,8));
            float y = Utils.formatNum(Utils.nextFloat(0,8));
            Float[] location = new Float[2];
            location[0] = x;
            location[1] = y;
            userEquipment.setId(id++);
            userEquipment.setLocation(location);
            float xTemp = x;
            float yTemp = y;
            if(x % 2 != 0){
                xTemp = x - 1;
            }
            if(y % 2 != 0){
                yTemp = y - 1;
            }
            String[] keyList = new String[5];
            keyList[0] = xTemp + "" + yTemp + "";
            /**未修正*/
//            int x1 = xTemp + 2;
//            int y1 = yTemp + 2;
            int x1 = 2;
            int y1 = 2;
            keyList[1] = x1 + "" + yTemp + "";
            x1 -= 4;
            keyList[2] = x1 + "" + yTemp + "";
            keyList[3] = xTemp + "" + y1 + "";
            y1 -= 4;
            keyList[4] = xTemp + "" + y1 + "";
            for (String index : keyList){
                CloudLets cloudLets = cloudLetsMap.get(index);
                if(cloudLets.getAvatarNumNow() >= 1){
//                    cloudLets.getAvatarList().add()
                }
            }
            // 判断微云还能不能放
//            int available = cloudLets.get
//            List<CloudLets> cloudLetsListAvailable = new ArrayList<>();
//
//            cloudLetsListAvailable.add();
//            userEquipment.setCloudLets(cloudLets);
//            cloudLets.se
        }
        List<BaseStation> baseStationsList = new ArrayList<BaseStation>();
        for (BaseStation item : baseStationsList){

        }
    }
}

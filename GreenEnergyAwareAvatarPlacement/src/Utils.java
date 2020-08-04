import java.util.*;
import java.text.DecimalFormat;

/**工具类
 * @author sc**/

public class Utils {

    /**
     * 获取随机数
     * @param min
     * @param max
     * @return
     */
    public static float nextFloat(final int min, final int max) {
        return min + ((max - min) * new Random().nextFloat());
    }

    /**
     * 保留小数点后两位小数
     * @param num xx.xxxxx
     * @return res
     * */
    public static float formatNum(final float num) {
        //构造方法的字符格式这里如果小数不足2位,会以0补足
        DecimalFormat decimalFormat = new DecimalFormat(".00");
        //format 返回的是字符串
        String numFormat = decimalFormat.format(num);
        //字符串转 float
        float res = Float.parseFloat(numFormat);
        return res;
    }

}

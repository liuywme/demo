package mode.multition;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 皇帝
 * Created by yanwen.liu on 2018/8/6.
 */
public class Emperor {
    /**
     * 皇帝的数量
     */
    private static int maxNumberEmperor = 2;
    /**
     * 皇帝的名字列表
     */
    private static List<String> emperorInfoList = new ArrayList(maxNumberEmperor);

    /**
     * 皇帝对象列表
     */
    private static List<Emperor> emperorList = new ArrayList(maxNumberEmperor);

    private static int numberOfEmperor = 0; // 当前皇帝对象
    /**
     * 初始化皇帝
     */
    static {
        for (int i = 0; i < maxNumberEmperor; i++) {
            emperorList.add(new Emperor((i+1) + "位皇帝"));
        }
    }

    private Emperor() {
    }
    private Emperor(String emperorInfo) {
        emperorInfoList.add(emperorInfo);
    }

    public static Emperor getEmperor() {
        Random random = new Random();
        numberOfEmperor = random.nextInt(maxNumberEmperor);
        return emperorList.get(numberOfEmperor);
    }

    public static Emperor getEmperor(int param) {
        numberOfEmperor = param;
        return emperorList.get(numberOfEmperor);
    }

    public void emperorInfo() {
        System.out.println(emperorInfoList.get(numberOfEmperor));
    }
}

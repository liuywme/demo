package mode.factory;

import java.util.HashMap;

/**
 * 八卦炉
 * Created by yanwen.liu on 2018/8/6.
 */
public class HuManFactory {

    /**
     * 延迟始化(Lazy initialization)，什么是延迟始化呢？
     * 一个对象初始化完毕后就不释放，等到再次用到得就不用再次初始化了，直接从内存过中拿到就可以了，
     * 这个在类初始化很消耗资源的情况比较实用，比如你要连接硬件，或者是为了初始化一个类需要准备比较多条件（参数），
     * 通过这种方式可以很好的减少项目的复杂程度。
     */
    private static HashMap<String, HuMan> huManHashMap = new HashMap<>();

    public static HuMan createHuMan(Class c) {
        HuMan huMan = null;
        try {
            if(huManHashMap.containsKey(c.getSimpleName())) {
                huMan = huManHashMap.get(c.getSimpleName());
            } else {
                huMan = (HuMan)Class.forName(c.getName()).newInstance(); // 创建一个人类
                huManHashMap.put(c.getSimpleName(), huMan);
            }
        } catch (InstantiationException e) {
            System.out.println("必须执行创建人类的颜色");
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            System.out.println("人类定义错误");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("你指定的人类找不到");
            e.printStackTrace();
        }
        return huMan;
    }
}

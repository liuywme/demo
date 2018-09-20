package mode.singleton;

/**
 * 皇帝
 * Created by yanwen.liu on 2018/8/6.
 */
public class Emperor {
    private static Emperor emperor = new Emperor();

    /**
     * 私有化构造函数
     */
    private Emperor() {
    }

    /**
     * 提供获取单例对象的方法
     * @return
     */
    public synchronized static Emperor getEmperor() {
        return emperor;
    }

    public void getEmperorInfo() {
        System.out.println("我是皇帝某某某。。");
    }
}

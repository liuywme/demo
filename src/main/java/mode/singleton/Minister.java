package mode.singleton;

/**
 * 单例模式
 * 大臣
 * Created by yanwen.liu on 2018/8/6.
 */
public class Minister {
    public static void main(String[] args) {

        {
            Emperor emperor = Emperor.getEmperor();
            System.out.print("第一天：");
            emperor.getEmperorInfo();
        }

        {
            Emperor emperor = Emperor.getEmperor();
            System.out.print("第二天：");
            emperor.getEmperorInfo();
        }

        {
            Emperor emperor = Emperor.getEmperor();
            System.out.print("第三天：");
            emperor.getEmperorInfo();
        }

    }
}

package mode.multition;

/**
 * 有上线的多例模式
 * Created by yanwen.liu on 2018/8/6.
 */
public class Minister {
    public static void main(String[] args) {
        int numberMinister = 10;
        for (int i = 0; i < numberMinister; i++) {
            {
                Emperor emperor = Emperor.getEmperor();
                System.out.print("第"+(i+1)+"位大臣参拜的是：");
                emperor.emperorInfo();
            }
            if(i >= 5) {
                Emperor emperor = Emperor.getEmperor(0);
                System.out.print("第"+(i+1)+"位大臣参拜的是：");
                emperor.emperorInfo();
            } else {
                Emperor emperor = Emperor.getEmperor(1);
                System.out.print("第"+(i+1)+"位大臣参拜的是：");
                emperor.emperorInfo();
            }

        }
    }
}

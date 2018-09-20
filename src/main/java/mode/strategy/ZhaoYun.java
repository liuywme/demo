package mode.strategy;

import mode.strategy.impl.BackDoor;
import mode.strategy.impl.BlockEnemy;
import mode.strategy.impl.GivenGreenLight;

/**
 * 策略模式
 * 执行者
 * Created by yanwen.liu on 2018/8/3.
 */
public class ZhaoYun {
    public static void main(String[] args) {
        Context context;

        {
            System.out.println("刚到吴国拆开第一个锦囊");
            context = new Context(new BackDoor());
            context.operate();
            System.out.println("第一锦囊执行完毕");
        }
        {
            System.out.println("开始执行第二个锦囊");
            context = new Context(new GivenGreenLight());
            context.operate();
            System.out.println("第二个锦囊执行完毕");
        }
        {
            System.out.println("开始执行第三个锦囊");
            context = new Context(new BlockEnemy());
            context.operate();
            System.out.println("第三个锦囊执行完毕");
        }
    }
}

package mode.factory;

import mode.factory.impl.BlackHuMan;
import mode.factory.impl.WhiteHuMan;
import mode.factory.impl.YellowHuMan;

/**
 * Created by yanwen.liu on 2018/8/6.
 */
public class NvWa {
    public static void main(String[] args) {
        {
            System.out.println("女娲第一次造人");
            HuMan huMan = HuManFactory.createHuMan(WhiteHuMan.class);
            huMan.laugh();
            huMan.cry();
            huMan.talk();
        }

        {
            System.out.println("女娲第二次造人");
            HuMan huMan = HuManFactory.createHuMan(BlackHuMan.class);
            huMan.laugh();
            huMan.cry();
            huMan.talk();
        }
        {
            System.out.println("女娲第三次造人");
            HuMan huMan = HuManFactory.createHuMan(YellowHuMan.class);
            huMan.laugh();
            huMan.cry();
            huMan.talk();
        }
    }
}

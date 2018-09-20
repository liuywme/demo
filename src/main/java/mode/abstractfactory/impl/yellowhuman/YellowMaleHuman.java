package mode.abstractfactory.impl.yellowhuman;

import mode.abstractfactory.impl.AbstractYellowHuman;

/**
 * Created by yanwen.liu on 2018/8/7.
 */
public class YellowMaleHuman extends AbstractYellowHuman {
    @Override
    public void sex() {
        System.out.println("男性黄色人类");
    }
}

package mode.abstractfactory.impl.whitehuman;

import mode.abstractfactory.impl.AbstractWhiteHuman;

/**
 * Created by yanwen.liu on 2018/8/7.
 */
public class WhiteMaleHuman extends AbstractWhiteHuman {
    @Override
    public void sex() {
        System.out.println("男性白色人类");
    }
}

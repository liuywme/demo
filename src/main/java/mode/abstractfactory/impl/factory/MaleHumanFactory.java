package mode.abstractfactory.impl.factory;

import mode.abstractfactory.HuMan;
import mode.abstractfactory.HumanEnum;
import mode.abstractfactory.impl.AbstractHumanFactory;

/**
 * Created by yanwen.liu on 2018/8/7.
 */
public class MaleHumanFactory extends AbstractHumanFactory{
    @Override
    public HuMan createYellowHuman() {
        return super.createHuman(HumanEnum.YellowMaleHuman);
    }

    @Override
    public HuMan createBlackHuman() {
        return super.createHuman(HumanEnum.BlackMaleHuman);
    }

    @Override
    public HuMan createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteMaleHuman);
    }
}

package mode.abstractfactory.impl.factory;

import mode.abstractfactory.HuMan;
import mode.abstractfactory.HumanEnum;
import mode.abstractfactory.impl.AbstractHumanFactory;

/**
 * Created by yanwen.liu on 2018/8/7.
 */
public class FamaleHumanFactory extends AbstractHumanFactory{
    @Override
    public HuMan createYellowHuman() {
        return super.createHuman(HumanEnum.YellowFemaleHuman);
    }

    @Override
    public HuMan createBlackHuman() {
        return super.createHuman(HumanEnum.BlackFemaleHuman);
    }

    @Override
    public HuMan createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteFemaleHuman);
    }
}

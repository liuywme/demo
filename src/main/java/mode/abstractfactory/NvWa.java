package mode.abstractfactory;

import mode.abstractfactory.impl.factory.MaleHumanFactory;

/**
 * Created by yanwen.liu on 2018/8/7.
 */
public class NvWa {
    public static void main(String[] args) {
        MaleHumanFactory maleHumanFactory = new MaleHumanFactory();
        HuMan huMan = maleHumanFactory.createYellowHuman();
        huMan.laugh();
        huMan.cry();
        huMan.talk();
        huMan.sex();
    }
}

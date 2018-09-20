package mode.abstractfactory.impl;

import mode.abstractfactory.HuMan;

/**
 * Created by yanwen.liu on 2018/8/7.
 */
public abstract class AbstractBlackHuman implements HuMan{

    @Override
    public void laugh() {
        System.out.println("黑色人类大笑");
    }

    public void cry() {
        System.out.println("黑色人类哭泣");
    }

    public void talk() {
        System.out.println("黑色人类说话");
    }


}

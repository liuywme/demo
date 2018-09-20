package mode.abstractfactory.impl;


import mode.abstractfactory.HuMan;

/**
 * Created by yanwen.liu on 2018/8/7.
 */
public abstract class AbstractYellowHuman implements HuMan{
    @Override
    public void laugh() {
        System.out.println("黄色人类大笑");
    }

    @Override
    public void cry() {
        System.out.println("黄色人类哭泣");
    }

    @Override
    public void talk() {
        System.out.println("黄色人类说话");
    }
}

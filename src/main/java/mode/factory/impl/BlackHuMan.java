package mode.factory.impl;

import mode.factory.HuMan;

/**
 * Created by yanwen.liu on 2018/8/6.
 */
public class BlackHuMan implements HuMan{
    @Override
    public void laugh() {
        System.out.println("黑色人类大笑");
    }

    @Override
    public void cry() {
        System.out.println("黑色人类哭泣");
    }

    @Override
    public void talk() {
        System.out.println("黑色人类说话");
    }
}

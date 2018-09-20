package mode.strategy.impl;

import mode.strategy.IStrategy;

/**
 * Created by yanwen.liu on 2018/8/3.
 */
public class BackDoor implements IStrategy{
    @Override
    public void operate() {
        System.out.println("开后门");
    }
}

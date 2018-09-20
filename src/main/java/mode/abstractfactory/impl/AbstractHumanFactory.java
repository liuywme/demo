package mode.abstractfactory.impl;

import mode.abstractfactory.HuMan;
import mode.abstractfactory.HumanEnum;
import mode.abstractfactory.HumanFactory;

/**
 * Created by yanwen.liu on 2018/8/7.
 */
public abstract class AbstractHumanFactory implements HumanFactory {

    protected HuMan createHuman(HumanEnum humanEnum) {
        HuMan human = null;
        //如果传递进来不是一个Enum中具体的一个Element的话，则不处理
        if (!humanEnum.getValue().equals("")) {
            try {
                //直接产生一个实例
                human = (HuMan) Class.forName(humanEnum.getValue()).newInstance();
            } catch (Exception e) {
                //因为使用了enum，这个种异常情况不会产生了，除非你的enum有问题；
                e.printStackTrace();
            }
        }

        return human;
    }
}

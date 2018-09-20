package mode.proxy;

import mode.proxy.impl.JiaShi;
import mode.proxy.impl.WangPo;

/**
 * 代理模式
 * Created by yanwen.liu on 2018/8/3.
 */
public class XiMenQing {
    public static void main(String[] args) {
        {
            WangPo wangPo = new WangPo();
            wangPo.makeEyesWithMan();
            wangPo.happyWithMan();
        }
        {
            JiaShi jiaShi = new JiaShi();
            WangPo wangPo = new WangPo(jiaShi);
            wangPo.makeEyesWithMan();
            wangPo.happyWithMan();
        }
    }
}

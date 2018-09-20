package mode.proxy.impl;

import mode.proxy.KindWomen;

/**
 * Created by yanwen.liu on 2018/8/3.
 * 王婆这个人老聪明了，她太老了，是个男人都看不上，
 * 但是她有智慧有经验呀，她作为一类女人的代理！
 */
public class WangPo implements KindWomen{

    private KindWomen women;

    /**
     * 默认代理潘金莲
     */
    public WangPo() {
        women = new PanJinLian();
    }

    public WangPo(KindWomen women) {
        this.women = women;
    }

    @Override
    public void makeEyesWithMan() {
        this.women.makeEyesWithMan();
    }

    @Override
    public void happyWithMan() {
        this.women.happyWithMan();
    }
}

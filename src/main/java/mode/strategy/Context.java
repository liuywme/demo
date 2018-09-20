package mode.strategy;

/**
 * 锦囊
 * Created by yanwen.liu on 2018/8/3.
 */
public class Context {
    //构造函数，你要使用那个妙计
    private IStrategy straegy;
    public Context(IStrategy strategy){
        this.straegy = strategy;
    }
    //使用计谋了，看我出招了
    public void operate(){
        this.straegy.operate();
    }
}

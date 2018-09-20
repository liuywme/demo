package mode.abstractfactory;

/**
 * Created by yanwen.liu on 2018/8/7.
 */
public enum HumanEnum {

    YellowFemaleHuman("mode.abstractfactory.impl.yellowhuman.YellowFemaleHuman"),
    YellowMaleHuman("mode.abstractfactory.impl.yellowhuman.YellowMaleHuman"),

    WhiteFemaleHuman("mode.abstractfactory.impl.whitehuman.WhiteFemaleHuman"),
    WhiteMaleHuman("mode.abstractfactory.impl.whitehuman.WhiteMaleHuman"),

    BlackFemaleHuman("mode.abstractfactory.impl.blackhuman.BlackFemaleHuman"),
    BlackMaleHuman("mode.abstractfactory.impl.blackhuman.BlackMaleHuman");

    private String value = "";

    private HumanEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

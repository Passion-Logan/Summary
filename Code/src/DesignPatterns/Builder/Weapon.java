package DesignPatterns.Builder;

/**
 * @author wql
 * @desc Weapon
 * @date 2021/5/11
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/11
 */
public enum Weapon {

    DAGGER("匕首"), SWORD("剑"), AXE("卷轴"), WARHAMMER("战锤"), BOW("弓");

    private final String name;

    Weapon(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}

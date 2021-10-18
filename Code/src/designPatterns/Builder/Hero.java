package designPatterns.Builder;

/**
 * 建造者
 *
 * @author wql
 * @desc Hero
 * @date 2021/5/11
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/11
 */
public final class Hero {

    /**
     * 职业
     */
    private final Profession profession;
    /**
     * 姓名
     */
    private final String name;
    /**
     * 头发类型
     */
    private final HairType hairType;
    /**
     * 头发颜色
     */
    private final HairColor hairColor;
    /**
     * 盔甲
     */
    private final Armor armor;
    /**
     * 武器
     */
    private final Weapon weapon;

    private Hero(Builder builder) {
        this.profession = builder.profession;
        this.name = builder.name;
        this.hairColor = builder.hairColor;
        this.hairType = builder.hairType;
        this.weapon = builder.weapon;
        this.armor = builder.armor;
    }

    public Profession getProfession() {
        return profession;
    }

    public String getName() {
        return name;
    }

    public HairType getHairType() {
        return hairType;
    }

    public HairColor getHairColor() {
        return hairColor;
    }

    public Armor getArmor() {
        return armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("这是一个名叫")
                .append(name)
                .append("的 ")
                .append(profession);
        if (hairColor != null || hairType != null) {
            sb.append(" 有着 ");
            if (hairColor != null) {
                sb.append(hairColor).append(' ');
            }
            if (hairType != null) {
                sb.append(hairType).append(' ');
            }
            sb.append(hairType != HairType.BALD ? "头发" : "头");
        }
        if (armor != null) {
            sb.append(" 穿着 ").append(armor);
        }
        if (weapon != null) {
            sb.append(" 并挥舞着 ").append(weapon);
        }
        sb.append('.');
        return sb.toString();
    }

    /**
     * The builder class.
     */
    public static class Builder {

        private final Profession profession;
        private final String name;
        private HairType hairType;
        private HairColor hairColor;
        private Armor armor;
        private Weapon weapon;

        /**
         * Constructor.
         */
        public Builder(Profession profession, String name) {
            if (profession == null || name == null) {
                throw new IllegalArgumentException("profession and name can not be null");
            }
            this.profession = profession;
            this.name = name;
        }

        public Builder withHairType(HairType hairType) {
            this.hairType = hairType;
            return this;
        }

        public Builder withHairColor(HairColor hairColor) {
            this.hairColor = hairColor;
            return this;
        }

        public Builder withArmor(Armor armor) {
            this.armor = armor;
            return this;
        }

        public Builder withWeapon(Weapon weapon) {
            this.weapon = weapon;
            return this;
        }

        public Hero build() {
            return new Hero(this);
        }
    }
}

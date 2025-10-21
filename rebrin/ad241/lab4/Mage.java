package rebrin.ad241.lab4;

/**
 * Клас мага - потужні магічні атаки, слабкий фізично
 */
public class Mage extends Character implements Levelable {
    private int level;
    private int mana;

    public Mage(String name) {
        super(name, 80, 45);
        this.level = 1;
        this.mana = 100;
    }

    @Override
    public void attack() {
        if (mana >= 20) {
            System.out.println(name + " випускає вогняний шар!");
            mana -= 20;
        } else {
            System.out.println("Мана закінчилась, " + name + " не може атакувати!");
        }
    }

    @Override
    public void defend() {
        System.out.println(name + " захищається магічним бар'єром і встигає відновити трішки мани!");
        mana += 10;
    }

    @Override
    public void levelUp() {
        level++;
        health += 10;
        damage += 9;
        mana += 25;
        System.out.println(name + " досяг рівня " + level + " , характеристики підвищені!");
    }

    @Override
    public int getLevel() {
        return level;
    }
}

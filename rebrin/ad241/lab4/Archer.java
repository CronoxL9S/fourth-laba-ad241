package rebrin.ad241.lab4;

/**
 * Клас лучника - дистанційні атаки, швидкий - золота середина
 */
public class Archer extends Character implements Levelable {
    private int level;
    private int arrows;

    public Archer(String name) {
        super(name, 110, 32);  // середнє здоров'я і урон
        this.level = 1;
        this.arrows = 30;
    }

    @Override
    public void attack() {
        if (arrows > 0) {
            System.out.println(name + " стріляє з лука! Урон: " + damage);
            arrows--;
        } else {
            System.out.println("У " + name + " закінчились стріли!");
        }
    }

    @Override
    public void defend() {
        System.out.println(name + " ловко ухиляється від атаки!");
    }

    @Override
    public void levelUp() {
        level++;
        health += 15;
        damage += 6;
        arrows += 10;
        System.out.println(name + " досяг рівня " + level + " , характеристики підвищені!");
    }

    @Override
    public int getLevel() {
        return level;
    }
}


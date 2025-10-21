package rebrin.ad241.lab4;

/**
 * Клас воїна - атакує мечем, міцний захист і багато здоров'я
 */
public class Warrior extends Character implements Levelable {
    private int level;

    public Warrior(String name) {
        super(name, 150, 25);
        this.level = 1;
    }

    @Override
    public void attack() {
        System.out.println(name + " атакує своїм гострим мечем!");
    }

    @Override
    public void defend() {
        System.out.println(name + " відбив атаку щитом!");
    }

    @Override
    public void levelUp() {
        level++;
        health += 15;
        damage += 7;
        System.out.println(name + " досяг рівня " + level + " , характеристики підвищені!");
    }

    @Override
   public int getLevel() {
        return level;
    }
}

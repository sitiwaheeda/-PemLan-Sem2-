package Tugas8;

public class Titan extends Character {
    public Titan() {
        setHP(200);
        setAttack(45);
    }

    public boolean attack() {
        int randomRandom = (int)
                (Math.random() * 100) + 1;

        if (randomRandom <= 40) {
            return true;
        } else {
            return false;
        }
    }

    public void info() {
        super.info();
        System.out.println("Role\t= Titan");
        System.out.println("HP \t= " + getHP());
        System.out.println("Attack\t= " + getAttack());
        System.out.println("Defense\t= " + getDefense());
    }
}

package Tugas8;

public class Warrior extends Character {
    public Warrior() {
        setHP(80);
        setAttack(25);
        setDefense(30);
    }

    public boolean attack() {
        int randomRandom = (int)
                (Math.random() * 100) + 1;
        if (randomRandom <= 60) {
            return true;
        } else {
            return false;
        }
    }

    public void info() {
        super.info();
        System.out.println("Role\t= Warrior");
        System.out.println("HP\t= " + getHP());
        System.out.println("Attack\t= " + getAttack());
        System.out.println("Defense\t= " + getDefense());
    }

}


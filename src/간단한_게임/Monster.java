package 간단한_게임;

public class Monster implements GameInterface{
    private String name;
    private int health;
    private int attackPower;

    public Monster(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }
        System.out.println(name + "이(가) 피해를 입었습니다. 남은 체력: " + health);
    }
    @Override
    public void attack() {
        System.out.println(name + "이(가) 공격합니다! 공격력: " + attackPower);
    }

    @Override
    public void defend() {
        System.out.println(name + "이(가) 방어합니다!");
    }
}

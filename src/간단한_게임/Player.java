package 간단한_게임;

public class Player implements GameInterface {
    private String name;
    private int health;
    private int attackPower;
    private String[] items = new String[10]; // 플레이어가 가지고 있는 아이템 이름 배열
    private int itemCount = 0; // 현재 아이템 개수

    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.attackPower = 10;
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

    public void heal(int amount) {
        this.health += amount;
        if (health > 100) {
            health = 100; // 최대 체력은 100
        }
    }

    public void boostAttack(int amount) {
        this.attackPower += amount;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }
        System.out.println(name + "이(가) 피해를 입었습니다. 남은 체력: " + health);
    }

    // 아이템 추가
    public void addItem(String item) {
        if (itemCount < items.length) {
            items[itemCount] = item;
            itemCount++;
            System.out.println(item + "이(가) 추가되었습니다.");
        } else {
            System.out.println("더 이상 아이템을 추가할 수 없습니다.");
        }
    }

    // 아이템 목록 출력
    public void showItems() {
        System.out.println(name + "의 아이템 목록:");
        for (int i = 0; i < itemCount; i++) {
            System.out.println((i + 1) + ". " + items[i]);
        }
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

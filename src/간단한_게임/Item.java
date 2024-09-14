package 간단한_게임;

public class Item {
    private String name;
    private int healAmount; // 체력 회복량
    private int attackBoost; // 공격력 증가량

    public Item(String name, int healAmount, int attackBoost) {
        this.name = name;
        this.healAmount = healAmount;
        this.attackBoost = attackBoost;
    }

    public String getName() {
        return name;
    }

    public int getHealAmount() {
        return healAmount;
    }

    public int getAttackBoost() {
        return attackBoost;
    }

    public void use(Player player) {
        if (healAmount > 0) {
            player.heal(healAmount);
            System.out.println(player.getName() + "이(가) " + name + "을(를) 사용하여 체력을 " + healAmount + " 회복했습니다.");
        }
        if (attackBoost > 0) {
            player.boostAttack(attackBoost);
            System.out.println(player.getName() + "이(가) " + name + "을(를) 사용하여 공격력이 " + attackBoost + " 증가했습니다.");
        }
    }
}

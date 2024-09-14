package 간단한_게임;

public class GameController {
    private Player player;
    public Monster monster;

    public GameController() {
        // 플레이어와 몬스터 생성
        this.player = new Player("Hero");
        this.monster = new Monster("Goblin", 50, 15);
    }

    public void startGame() {
        System.out.println("게임을 시작합니다!");

        // 플레이어가 아이템을 추가
        player.addItem("검");
        player.addItem("방패");

        // 아이템 목록 출력
        player.showItems();

        // 아이템을 사용하여 체력 회복
        Item potion = new Item("회복 물약", 20, 0);
        potion.use(player);

        // 플레이어가 몬스터를 공격
        player.attack();
        monster.takeDamage(player.getAttackPower());

        // 몬스터가 플레이어를 공격
        monster.attack();
        player.takeDamage(monster.getAttackPower());

        // 플레이어 방어
        player.defend();

        // 몬스터 방어
        monster.defend();
    }
}

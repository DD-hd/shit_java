import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class ShowHand {
    // 表示支持多少个玩家
    private final int PLAY_NUM = 5;
    // 四个是特殊字符，会在控制台打印出方块，草花，红心，黑桃
    private String[] types = { "\4 ", "\5 ", "\3 ", "\6 " };
    private String[] values = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };

    private List<String> cards = new LinkedList<String>();
    private String[] players = new String[PLAY_NUM];
    private List<String>[] playersCards = new List[PLAY_NUM];

    /**
     * 初始化扑克牌
     */
    public void initCards() {
        for (int i = 0; i < types.length; i++) {
            for (int j = 0; j < values.length; j++) {
                cards.add(types[i] + values[j]);
            }
        }
    }

    /**
     * 初始化玩家
     * 
     * @param names
     */
    public void initPlayer(String... names) {
        if (names.length > PLAY_NUM || names.length < 2) {
            System.out.println("玩家数量不对");
            return;
        } else {
            for (int i = 0; i < names.length; i++) {
                players[i] = names[i];
            }
        }
    }

    /**
     * 初始化玩家的扑克牌
     */
    public void initPlayerCards() {
        for (int i = 0; i < players.length; i++) {
            if (players[i] != null && !players[i].equals("")) {
                playersCards[i] = new LinkedList<String>();
            }
        }
    }

    /**
     * 输出全部扑克牌
     */
    public void showAllCards() {
        for (String card : cards) {
            System.out.println(card);
        }
    }

    /**
     * 派扑克牌
     */
    public void deliverCard(String first) {
        int firstPos = this.search(players, first);
        for (int i = firstPos; i < PLAY_NUM; i++) {
            if (players[i] != null) {
                playersCards[i].add(cards.get(0));
                cards.remove(0);
            }
        }

        for (int i = 0; i < firstPos; i++) {
            if (players[i] != null) {
                playersCards[i].add(cards.get(0));
                cards.remove(0);
            }
        }

    }

    /**
     * 输出玩家手上的扑克牌
     */
    public void showPlayerCards() {
        for (int i = 0; i < PLAY_NUM; i++) {
            if (players[i] != null) {
                System.out.print(players[i] + ": ");
                for (String card : playersCards[i]) {
                    System.out.print(card + "\t");
                }
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        ShowHand sh = new ShowHand();
        sh.initPlayer("电脑玩家", "孙悟空");
        sh.initCards();
        sh.initPlayerCards();
        // 下面测试所有扑克牌，没有实际作用
        sh.showAllCards();
        System.out.println("----------------------");

        sh.deliverCard("孙悟空");
        sh.showPlayerCards();

        sh.deliverCard("电脑玩家");
        sh.showPlayerCards();
    }

    private int search(String[] arr, String name) {
        for (int i = 0; i < arr.length; i++) {
            if (name.equals(arr[i])) {
                return i;
            }
        }
        return -1;
    }
}
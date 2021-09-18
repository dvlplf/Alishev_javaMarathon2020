package day7;

public class Player {
    private int stamina;
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    public static int countPlayers = 0;
    public static int totalPlayers = 0;

    public Player() {
        this.stamina = (int) (Math.random() * 10 + 1);
        totalPlayers++;
        if (countPlayers < 6) {
            countPlayers++;
        }

    }

    public String getStamina() {
        return this.toString() + " stamina = " + this.stamina;
    }

    public void run() {
        if (stamina == 0) {
            return;
        }
        stamina--;
        if (stamina == 0) {
            totalPlayers--;
            if (totalPlayers < 6) {
                countPlayers--;
            }
        }
    }

    public static void info() {
        String status;
        if (countPlayers < 6) {
            status = "Команды неполные. На поле еще есть " +(6 - countPlayers) + "мест";
        } else {
            status = "На поле нет свободных мест";
        }
        System.out.println(status);
        System.out.println("totalPlayers = " + totalPlayers);
        System.out.println("countPlayers = " + countPlayers);
    }
}

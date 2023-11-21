package Example_6;

import java.util.HashMap;
import java.util.Random;

/**
 * Реализовать код для демонстрации парадокса Монти Холла,
 * наглядно убедиться в верности парадокса (запустить игру в цикле на 1000 и вывести итоговый счет).
 * Необходимо:
 * ● Создать свой Java Maven или Gradle проект;
 * ● Самостоятельно реализовать прикладную задачу;
 * ● Сохранить результат в HashMap<шаг теста, результат>
 * ● Вывести на экран статистику по победам и поражениям
 */

public class MontyHall {
    public static final String WIN = "Victory";
    public static final String LOSE = "Defeat";

    public static void main(String[] args) {
        Random rnd = new Random();
        HashMap<Integer, String> statistics = new HashMap<>();
        int numberOfGames = 1000-1;
        int gameType = 1;   // 1 - Игрок выбирает другую дверь, 2 - Не меняет первоначальное решение

        for (int i = 0; i <= numberOfGames; i++) {
            // Случайное размещение машины за одной из дверей
            int carPlace = rnd.nextInt(0, 3);

            // Первоначальный выбор игроком случайной двери
            int playerDecision1 = rnd.nextInt(0, 3);

            // Ведущий выбирает дверь без машины и невыбранную игроком
            int leadingDecision = rnd.nextInt(0, 3);
            while (leadingDecision == playerDecision1 || leadingDecision == carPlace) {
                leadingDecision = rnd.nextInt(0, 3);
            }

            int playerDecisionResult = 0; // Итоговый выбор двери игроком

            switch (gameType) {
                case 1:
                    // Игрок меняет своё решение
                    playerDecisionResult = 3 - playerDecision1 - leadingDecision;
                    break;
                case 2:
                    // Игрок не меняет своё решение
                    playerDecisionResult = playerDecision1;
                    break;
            }

            // Проверка выигрыша
            if (playerDecisionResult == carPlace) {
                statistics.put(i, WIN);
            } else {
                statistics.put(i, LOSE);
            }
        }

        // Сбор статистики
        int win = 0;
        int lose = 0;
        for (String s: statistics.values()) {
            if (s.equals(WIN)) {
                win++;
            } else {
                lose++;
            }
        }

        switch (gameType) {
            case 1:
                System.out.println("Player changes his original decision");
                System.out.printf("Number of wins = %d (%d percent)\n", win, Math.round(win * 1.0 / numberOfGames * 100));
                System.out.printf("Number of defeats = %d (%d percent)\n", lose, Math.round(lose * 1.0 / numberOfGames * 100));
                break;
            case 2:
                System.out.println("Player does not change his decision");
                System.out.printf("Number of wins = %d (%d percent)\n", win, Math.round(win * 1.0 / numberOfGames * 100));
                System.out.printf("Number of defeats = %d (%d percent)\n", lose, Math.round(lose * 1.0 / numberOfGames * 100));
                break;
            default:
                System.out.println("Wrong game type");
        }
    }
}

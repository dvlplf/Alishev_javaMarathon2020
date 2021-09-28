package day17;
import java.lang.reflect.Array;
import java.util.Arrays;


public class Task1 {
    public static void main(String[] args) {
        String[] pieses = new String[8];
        for (int i = 0; i < pieses.length; i++) {
            if (i < 4) {
                pieses[i] = ChessPiese.PAWN_WHITE.getStrImage();
                continue;
            }
            pieses[i] = ChessPiese.ROOK_BLACK.getStrImage();;
        }
        for (String item: pieses) {
            System.out.print(item + " ");
        }
    }
}
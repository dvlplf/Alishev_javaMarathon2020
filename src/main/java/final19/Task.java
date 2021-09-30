package final19;


public class Task {
    public static void main(String[] args) {
        String[][] field = new String[10][10];

        for (int i = 0; i < field.length; i++) {
            for(int j = 0; j< field[i].length; j++) {
                field[i][j] = CellField.CELL.getCellImage();
                if (i == 1 && j > 5) field[i][j] = CellField.BOAT_DESTROY.getCellImage();
                if (i == 2) field[i][j] = CellField.BOAT_WHOLE.getCellImage();
                if (i == 3) field[i][j] = CellField.BOAT_WHOLE_AREA.getCellImage();

            }
        }
        for (int i = 0; i < field.length; i++) {
            for(int j = 0; j< field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
        }
    }


package final19;

public enum CellField {
    CELL("\u25FB"),
    BOAT_WHOLE("\u25FC"),
    BOAT_DESTROY(
            "\u25A3"),
    BOAT_WHOLE_AREA(
            "\u25A4"),
    BOAT_DESTROY_AREA("\uD83D");

    private String cellImage;

    CellField(String cellImage) {
        this.cellImage = cellImage;
    }

    public String getCellImage() {
        return cellImage;
    }
}

package inputLayer;

public class Plateau {
    private PlateauSize plateauSize;

    public Plateau(PlateauSize size) {
        this.plateauSize = new PlateauSize(size.getX(), size.getY());
    }

    public PlateauSize getPlateauSize() {
        return plateauSize;
    }
}

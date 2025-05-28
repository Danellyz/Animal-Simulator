package animals;

public class Fox extends Predator {
    public Fox(int id, int x, int y) {
        super(id, x, y, 4);
    }

    @Override
    public char getSymbol() {
        return 'F';
    }
    @Override
    public String toString(){
        return String.format("Fox #%d @(%d, %d)", getId(), getX(), getY());
    }
}

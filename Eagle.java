package animals;

public class Eagle extends Predator {
    public Eagle(int id, int x, int y) {
        super(id, x, y, 6);
    }

    @Override
    public char getSymbol() {
        return 'E';
    }
    @Override
    public String toString(){
        return String.format("Eagle #%d @(%d, %d)", getId(), getX(), getY());
    }
}

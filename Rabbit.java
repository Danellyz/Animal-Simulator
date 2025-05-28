package animals;

public class Rabbit extends Prey { //Rabbit does not have a power because it is prey
    public Rabbit(int id, int x, int y) {
        super(id, x, y);
    }

    @Override
    public char getSymbol() {
        return 'R';  //appears on the board
    }
    @Override
    public String toString(){
        return String.format("Rabbit #%d @(%d, %d)", getId(), getX(), getY());
    }
}

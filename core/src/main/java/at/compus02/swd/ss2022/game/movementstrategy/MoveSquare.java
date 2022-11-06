package at.compus02.swd.ss2022.game.movementstrategy;

public class MoveSquare implements MoveStrategy {

    private float positionX, positionY;
    private int counter = 0;

    public MoveSquare() {
        this.positionX = 2;
        this.positionY = 2;
    }

    @Override
    public MoveVector getMoveVector(float x, float y) {
        return null;
    }

    @Override
    public MoveVector getMoveVector() {
        counter++;
        if (counter <= 50) {
            if (counter == 50)
                positionX *= -1;
            return new MoveVector(positionX, 0);
        } else {
            if (counter == 100) {
                positionX *= -1;
                counter = 0;
            }
            return new MoveVector(0, positionX);
        }
    }
}

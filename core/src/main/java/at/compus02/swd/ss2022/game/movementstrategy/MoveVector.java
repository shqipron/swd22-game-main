package at.compus02.swd.ss2022.game.movementstrategy;

public class MoveVector {
    private float posX, posY;

    public MoveVector(float x, float y) {
        this.posX = x;
        this.posY = y;
    }

    public float getPosX() {
        return posX;
    }

    public float getPosY() {
        return posY;
    }
}

package at.compus02.swd.ss2022.game.observer;

public interface PlayerMovement {
    void Moved(float fromX, float fromY, float byX, float byY);
    void Attacked(float posX, float posY);
}

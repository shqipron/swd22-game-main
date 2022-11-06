package at.compus02.swd.ss2022.game.observer;

import com.badlogic.gdx.graphics.OrthographicCamera;

public class MovePlayerObserver implements PlayerMovement{
    private OrthographicCamera camera;

    public MovePlayerObserver(OrthographicCamera camera) {
        this.camera = camera;
    }

    @Override
    public void Moved(float fromX, float fromY, float byX, float byY) {
        camera.translate(byX, byY);
        camera.update();
    }

    @Override
    public void Attacked(float posX, float posY) {
    }
}

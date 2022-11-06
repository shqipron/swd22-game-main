package at.compus02.swd.ss2022.game.gameobjects;

import at.compus02.swd.ss2022.game.observer.MovePlayerObserver;
import at.compus02.swd.ss2022.game.observer.PlayerMovement;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;

public class Player implements GameObject{
    private Texture image;
    private Sprite sprite;
    private ArrayList<PlayerMovement> playerObservers = new ArrayList<>();

    public Player(){
        image = new Texture(TilesPath.PLAYER);
        sprite = new Sprite(image, 48, 56, 48, 56);
    }
    @Override
    public void act(float delta) {
       //not yet implemented
    }
    public void attack(){
        float x = sprite.getX();
        float y = sprite.getY();

        for (PlayerMovement playerObserver : playerObservers) {
            playerObserver.Attacked(x, y);
        }
    }

    public void move(float x, float y) {
        float fromX = sprite.getX();
        float fromY = sprite.getY();

        sprite.translate(x, y);
        for (PlayerMovement playerObserver : playerObservers) {
            playerObserver.Moved(fromX, fromY, x, y);
        }
    }
    public void registerObserver(PlayerMovement playerObserver) {
        playerObservers.add(playerObserver);
    }
    @Override
    public void setPosition(float x, float y) {
        sprite.setPosition(x,y);
    }

    @Override
    public void draw(SpriteBatch batch) {
        sprite.draw(batch);
    }

    @Override
    public int getGameObjectOrder() {
        return GameObjectOrder.PLAYER;
    }
}

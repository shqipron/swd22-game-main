package at.compus02.swd.ss2022.game.gameobjects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class TileWall implements GameObject{
    @Override
    public void act(float delta) {

    }

    @Override
    public void setPosition(float x, float y) {

    }

    @Override
    public void draw(SpriteBatch batch) {

    }

    @Override
    public int getGameObjectOrder() {
        return 0;
    }

    /*private Texture image;
    private Sprite sprite;
    public TileWall(){
        image = new Texture("tile_wall.png");
        sprite = new Sprite(image);
    }
    @Override
    public void act(float delta) {

    }

    @Override
    public void setPosition(float x, float y) {
        sprite.setPosition(x,y);
    }

    @Override
    public void draw(SpriteBatch batch) {
        sprite.draw(batch);
    }*/
}

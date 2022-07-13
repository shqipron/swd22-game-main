package at.compus02.swd.ss2022.game.gameobjects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class TileGras extends TileBase{

    public TileGras(){
        super("tile_gras.png", 32, 32);
    }

    @Override
    public int getGameObjectOrder(){
        return GameObjectOrder.GRAS;
    }

    /* private Texture image;
    private Sprite sprite;
    public TileGras(){
        image = new Texture("tile_gras.png");
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

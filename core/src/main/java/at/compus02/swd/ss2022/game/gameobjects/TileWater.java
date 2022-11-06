package at.compus02.swd.ss2022.game.gameobjects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class TileWater extends TileBase{

    public TileWater(){
        super(TilesPath.WATER, 32, 32);
    }

    @Override
    public int getGameObjectOrder(){

        return GameObjectOrder.WATER;
    }

    @Override
    public void setPosition(float x, float y) {
        sprite.setPosition(x,y);
    }

    @Override
    public void draw(SpriteBatch batch) {
        sprite.draw(batch);
    }
}

package at.compus02.swd.ss2022.game.gameobjects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class TileWall extends TileBase{

    public TileWall(boolean isVertical) {
        super(TilesPath.WALL, 32, 32);
        sprite.rotate90(isVertical);
    }

    @Override
    public int getGameObjectOrder() {
        return GameObjectOrder.WALL;
    }
}

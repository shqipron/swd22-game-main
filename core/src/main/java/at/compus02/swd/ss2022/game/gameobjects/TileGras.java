package at.compus02.swd.ss2022.game.gameobjects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class TileGras extends TileBase{

    public TileGras(){
        super(TilesPath.GRAS, 32, 32);
    }

    @Override
    public int getGameObjectOrder(){
        return GameObjectOrder.GRAS;
    }
}

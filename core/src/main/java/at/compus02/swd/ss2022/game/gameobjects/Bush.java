package at.compus02.swd.ss2022.game.gameobjects;

import at.compus02.swd.ss2022.game.factory.AssetRepository;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Bush implements GameObject{
    private Texture image;
    private Sprite sprite;
    public Bush(){
        image = AssetRepository.
                getInstance().
                getTexture(TilesPath.BUSH);
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
    }

    @Override
    public int getGameObjectOrder() {
        return GameObjectOrder.BUSH;
    }
}

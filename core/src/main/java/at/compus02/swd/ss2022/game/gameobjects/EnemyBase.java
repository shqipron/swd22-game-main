package at.compus02.swd.ss2022.game.gameobjects;

import at.compus02.swd.ss2022.game.factory.AssetRepository;
import at.compus02.swd.ss2022.game.movementstrategy.MoveStrategy;
import at.compus02.swd.ss2022.game.movementstrategy.MoveVector;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class EnemyBase implements GameObject {
    private Texture image;
    private Sprite sprite;
    private MoveStrategy moveStrategy;

    public EnemyBase(String enemy, MoveStrategy moveStrategy) {
        image = AssetRepository.getInstance().getTexture(enemy);
        sprite = new Sprite(image);
        this.moveStrategy = moveStrategy;
    }

    @Override
    public void act(float delta) {

    }

    @Override
    public void setPosition(float x, float y) {
        sprite.setPosition(x, y);
    }

    @Override
    public void draw(SpriteBatch batch) {
        sprite.draw(batch);
    }

    public float getPositionX() {
        return sprite.getX();
    }

    public float getPositionY() {
        return sprite.getY();
    }

    public void move () {
        MoveVector moveVector = moveStrategy.getMoveVector(sprite.getX(), sprite.getY());
        sprite.translate(moveVector.getPosX(), moveVector.getPosY());
    }
}

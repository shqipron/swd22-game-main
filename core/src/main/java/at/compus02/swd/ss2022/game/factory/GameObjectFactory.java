package at.compus02.swd.ss2022.game.factory;

import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import com.badlogic.gdx.Game;

public interface GameObjectFactory {

    GameObject create();

    GameObject create(float x, float y);
}

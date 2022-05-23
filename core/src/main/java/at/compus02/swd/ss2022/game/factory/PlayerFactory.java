package at.compus02.swd.ss2022.game.factory;

import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import at.compus02.swd.ss2022.game.gameobjects.Player;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.TextureData;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class PlayerFactory{
    private String type;

    public Player create(){
        return new Player();
    }
    public void initialize(){

    }

    public GameObject[] getObjects() {
        return null;
    }
}

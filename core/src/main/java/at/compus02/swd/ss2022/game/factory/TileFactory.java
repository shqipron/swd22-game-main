package at.compus02.swd.ss2022.game.factory;

import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import at.compus02.swd.ss2022.game.gameobjects.TileWater;

public class TileFactory {
    private String type;

    public TileWater create(){
        return new TileWater();
    }
    public void initialize(){

    }
    public GameObject[] getObjects() {
        return null;
    }
}

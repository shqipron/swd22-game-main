package at.compus02.swd.ss2022.game.factory;

import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import at.compus02.swd.ss2022.game.gameobjects.Stone;
import at.compus02.swd.ss2022.game.gameobjects.TileWater;

public class StoneFactory {
    private String type;

    public Stone create(){
        return new Stone();
    }
    public void initialize(){

    }
    public GameObject[] getObjects() {
        return null;
    }
}

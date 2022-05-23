package at.compus02.swd.ss2022.game.factory;

import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import at.compus02.swd.ss2022.game.gameobjects.Sign;
import at.compus02.swd.ss2022.game.gameobjects.TileWater;

public class SignFactory {
    private String type;

    public Sign create(){
        return new Sign();
    }
    public void initialize(){

    }
    public GameObject[] getObjects() {
        return null;
    }
}

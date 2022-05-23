package at.compus02.swd.ss2022.game.factory;

import at.compus02.swd.ss2022.game.gameobjects.Bush;
import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import at.compus02.swd.ss2022.game.gameobjects.Sign;

public class BushFactory {
    private String type;

    public Bush create(){
        return new Bush();
    }
    public void initialize(){

    }
    public GameObject[] getObjects() {
        return null;
    }
}

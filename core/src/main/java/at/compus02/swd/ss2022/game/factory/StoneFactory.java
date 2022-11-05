package at.compus02.swd.ss2022.game.factory;

import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import at.compus02.swd.ss2022.game.gameobjects.Stone;
import at.compus02.swd.ss2022.game.gameobjects.TileWater;

public class StoneFactory {
    private String type;

    public Stone create(){
        return new Stone();
    }
    public GameObject create(float x, float y){
        GameObject stone = create();
        stone.setPosition(x+10, y+10);
        return stone;
    }
}

package at.compus02.swd.ss2022.game.factory;

import at.compus02.swd.ss2022.game.gameobjects.*;

public class TileFactory {
    public TileBase createWaterTile(){

        return new TileWater();
    }
    public TileBase createGrasTile(){

        return new TileGras();
    }
    public TileBase createWallTile(){

        return new TileWater();
    }
    public TileBase createLavaTile(){

        return new TileLava();
    }
   /* public TileWater create(){
        return new TileWater();
    }
    public void initialize(){

    }
    public GameObject[] getObjects() {
        return null;
    }*/
}

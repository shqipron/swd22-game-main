package at.compus02.swd.ss2022.game.factory;

import at.compus02.swd.ss2022.game.gameobjects.TilesEnum;
import at.compus02.swd.ss2022.game.gameobjects.*;

public class TileFactory {
    public TileBase create(TilesEnum tile){
        switch (tile) {
            default:
            case GRAS:
                return new TileGras();
            case LAVA:
                return new TileLava();
            case WALL:
                return new TileWall(true);
            case WATER:
                return new TileWater();
        }
    }
}

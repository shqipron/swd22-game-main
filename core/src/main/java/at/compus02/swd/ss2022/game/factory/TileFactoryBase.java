package at.compus02.swd.ss2022.game.factory;

import at.compus02.swd.ss2022.game.gameobjects.TileBase;

public abstract class TileFactoryBase implements GameObjectFactory {

    abstract TileBase createTile();

}

package at.compus02.swd.ss2022.game.gameobjects;

public class TileLava extends TileBase{
    public TileLava() {
        super(TilesPath.LAVA, 32,32);

    }

    @Override
    public int getGameObjectOrder() {
        return GameObjectOrder.LAVA;
    }
}

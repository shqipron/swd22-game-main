package at.compus02.swd.ss2022.game.gameobjects;

public class TileStone extends TileBase{
    public TileStone(){
        super("stone.png", 32, 32);
    }

    @Override
    public int getGameObjectOrder() {
        return GameObjectOrder.STONE;
    }
}

package at.compus02.swd.ss2022.game.gameobjects;

import at.compus02.swd.ss2022.game.movementstrategy.MoveStrategy;

public class Enemy_2 extends EnemyBase implements GameObject {

    public Enemy_2(MoveStrategy moveStrategy) {
        super(TilesPath.ENEMY_2, moveStrategy);
    }

    @Override
    public int getGameObjectOrder() {
        return GameObjectOrder.ENEMY_2;
    }
}

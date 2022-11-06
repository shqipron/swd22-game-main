package at.compus02.swd.ss2022.game.gameobjects;

import at.compus02.swd.ss2022.game.movementstrategy.MoveStrategy;

public class Enemy_1 extends EnemyBase implements GameObject {

    public Enemy_1(MoveStrategy moveStrategy) {
        super(TilesPath.ENEMY_1, moveStrategy);
    }

    @Override
    public int getGameObjectOrder() {
        return GameObjectOrder.ENEMY_1;
    }
}

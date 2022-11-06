package at.compus02.swd.ss2022.game.factory;

import at.compus02.swd.ss2022.game.gameobjects.*;
import at.compus02.swd.ss2022.game.movementstrategy.MoveSquare;

public class EnemyFactory {
    public EnemyBase create(EnemyEnum enemy,float x, float y, MoveSquare moveStrategy){
        switch (enemy) {
            default:
            case ENEMY_1:
                EnemyBase enemy1 = new Enemy_1(moveStrategy);
                enemy1.setPosition(x,y);
                return enemy1;
            case ENEMY_2:
                EnemyBase enemy2 = new Enemy_1(moveStrategy);
                enemy2.setPosition(x,y);
                return enemy2;
        }
    }
}

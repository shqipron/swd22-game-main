package at.compus02.swd.ss2022.game.movementstrategy;

import at.compus02.swd.ss2022.game.gameobjects.EnemyBase;
import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import at.compus02.swd.ss2022.game.observer.PlayerMovement;
import com.badlogic.gdx.utils.Array;

import java.util.ArrayList;

public class EnemyLogic implements PlayerMovement {
    ArrayList<EnemyBase> enemyList = new ArrayList<>();
    Array<GameObject> gameObjects;

    public EnemyLogic(Array<GameObject> gameObjects) {
        this.gameObjects = gameObjects;
    }

    public void addEnemy(EnemyBase enemy) {
        enemyList.add(enemy);
    }

    public void update() {
        for (EnemyBase enemy : enemyList) {
            enemy.move();
        }
    }

    @Override
    public void Moved(float fromX, float fromY, float byX, float byY) {
        // nothing to do here
    }

    @Override
    public void Attacked(float posX, float posY) {
        float killRange = 20;

        EnemyBase enemyToKill = null;
        float distance = 0;
        for( EnemyBase enemy : enemyList) {
            if( Math.abs(posX - enemy.getPositionX() ) <= killRange &&
                    Math.abs(posY - enemy.getPositionY() ) <= killRange ) {

                float accumulatedDistance = Math.abs(posX - enemy.getPositionX() ) + Math.abs(posY - enemy.getPositionY());
                if( enemyToKill == null || accumulatedDistance < distance ) {
                    enemyToKill = enemy;
                    distance = accumulatedDistance;
                }
            }
        }

        if( enemyToKill != null ) {
            int index = gameObjects.indexOf(enemyToKill, true);
            if(index >= 0)
                gameObjects.removeIndex(index);

            enemyList.remove(enemyToKill);
        }
    }
}

package at.compus02.swd.ss2022.game.factory;

import at.compus02.swd.ss2022.game.gameobjects.TilesEnum;
import at.compus02.swd.ss2022.game.gameobjects.*;
import at.compus02.swd.ss2022.game.input.GameInput;
import at.compus02.swd.ss2022.game.movementstrategy.EnemyLogic;
import at.compus02.swd.ss2022.game.movementstrategy.MoveSquare;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.utils.Array;

public class MapFactory {
    static Player player = null;

    public static void createMap(Array<GameObject> gameObjectsList, GameInput gameInput, OrthographicCamera camera, EnemyLogic enemyLogic) {

        TileBase tile = null;

        TileFactory tileFactory = new TileFactory();
        BushFactory bushFactory = new BushFactory();

        EnemyFactory enemyFactory = new EnemyFactory();
        PlayerFactory playerFactory = new PlayerFactory();

        Pixmap mapImage = new Pixmap(new FileHandle(TilesPath.MAP));

        for (int x = 0; x < mapImage.getWidth(); x += 10){
            for (int y = 0; y < mapImage.getHeight(); y += 10){
                int positionPixel = mapImage.getPixel(x, y);
//x200, y200. i.e green
                int posX = x / 100;
                int posY = y / 100;

                switch (positionPixel){
                    default:
                    case TilesColors.Water:
                        tile = tileFactory.create(TilesEnum.WATER);
                        break;
                    case TilesColors.Gras:
                        tile = tileFactory.create(TilesEnum.GRAS);
                        break;
                    case TilesColors.Wall:
                        tile = tileFactory.create(TilesEnum.WALL);
                        break;
                    case TilesColors.Lava:
                        tile = tileFactory.create(TilesEnum.LAVA);
                        break;
                    case TilesColors.Bush:
                        tile = tileFactory.create(TilesEnum.GRAS);
                        gameObjectsList
                                .add(bushFactory.
                                        create(posX * tile.getWidth(),
                                                posY * tile.getHeight()));
                    case TilesColors.Player:
                        tile = tileFactory.create(TilesEnum.GRAS);
                        player = playerFactory.create(gameInput, camera, posX * tile.getWidth(), posY * tile.getHeight());
                        gameObjectsList.add(player);
                        camera.position.x = posX * tile.getWidth();
                        camera.position.y = posY * tile.getHeight();
                        break;
                    case TilesColors.Enemy1:
                        tile = tileFactory.create(TilesEnum.GRAS);
                        EnemyBase enemy_1 = enemyFactory.create(EnemyEnum.ENEMY_1,posX * tile.getWidth(), posY * tile.getHeight(), new MoveSquare());
                        gameObjectsList.add(enemy_1);
                        enemyLogic.addEnemy(enemy_1);
                        break;
                    case TilesColors.Enemy2:
                        tile = tileFactory.create(TilesEnum.GRAS);
                        EnemyBase enemy_2 = enemyFactory.create(EnemyEnum.ENEMY_2,posX * tile.getWidth(), posY * tile.getHeight(), new MoveSquare());
                        gameObjectsList.add(enemy_2);
                        enemyLogic.addEnemy(enemy_2);
                        break;

                }
                tile.setPosition(posX * tile.getWidth(), posY * tile.getHeight());
                gameObjectsList.add(tile);
            }
        }
        mapImage.dispose();
    }
}

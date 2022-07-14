package at.compus02.swd.ss2022.game.factory;

import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import at.compus02.swd.ss2022.game.gameobjects.TileBase;
import at.compus02.swd.ss2022.game.input.GameInput;
import at.compus02.swd.ss2022.game.movementstrategy.EnemyLogic;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.utils.Array;

public class MapFactory {

    public static void createMap(Array<GameObject> gameObjectsList, GameInput gameInput, OrthographicCamera camera, EnemyLogic enemyLogic) {

        final int colWater = 0x099cffff;
        final int colGras = 0x097b19ff;
        final int colLava = 0x661b0aff;
        final int colBush = 0x0fff26ff;
        final int colWall = 0x464646ff;


        TileFactory tileFactory = new TileFactory();
        BushFactory bushFactory = new BushFactory();
        EnemyFactory enemyFactory = new EnemyFactory();
        PlayerFactory playerFactory = new PlayerFactory();

        Pixmap mapImage = new Pixmap(new FileHandle("gamemap.png"));

        int width = mapImage.getWidth();
        int height = mapImage.getHeight();
        for (int x = 0; x < mapImage.getWidth(); x += 10){
            for (int y = 0; y < mapImage.getHeight(); y += 10){
                int px = mapImage.getPixel(x, y);

                int posX = x / 100;
                int posy = y / 100;

                TileBase tile;

                switch (px){
                    default:
                    case colWater:
                        tile = tileFactory.createWaterTile();
                        break;
                    case colGras:
                        tile = tileFactory.createGrasTile();
                        break;
                    case colWall:
                        tile = tileFactory.createWallTile();
                        break;
                    case colBush:
                        tile = tileFactory.createGrasTile();
                        gameObjectsList.add(bushFactory.create(posX * tile.getWidth(), posy * tile.getHeight()));
                }
                tile.setPosition(posX * tile.getWidth(), posy * tile.getHeight());
                gameObjectsList.add(tile);
            }
        }

        mapImage.dispose();

    }
}

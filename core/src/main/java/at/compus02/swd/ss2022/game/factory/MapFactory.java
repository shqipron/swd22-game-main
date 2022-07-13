package at.compus02.swd.ss2022.game.factory;

import at.compus02.swd.ss2022.game.gameobjects.TileBase;
import at.compus02.swd.ss2022.game.input.GameInput;
import at.compus02.swd.ss2022.game.movementstrategy.EnemyLogic;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Pixmap;

import java.lang.reflect.Array;

public class MapFactory {

    public static void main( GameInput gameInput, EnemyLogic enemyManager) {

        final int colWater = 0x099cffff;
        final int colGras = 0x097b19ff;

        TileFactory tileFactory = new TileFactory();
        BushFactory bushFactory = new BushFactory();
        EnemyFactory enemyFactory = new EnemyFactory();
        PlayerFactory playerFactory = new PlayerFactory();

        Pixmap mapImage = new Pixmap(new FileHandle("player.png"));

        int width = mapImage.getWidth();
        int height = mapImage.getHeight();
        for (int x = 0; x < mapImage.getWidth(); x += 10){
            for (int y = 0; y < mapImage.getHeight(); y += 10){
                int px = mapImage.getPixel(x, y);

                int posX = x / 10;
                int posy = y / 10;

                TileBase tile;

                switch (px){
                    default:
                    case colWater:
                        tile = tileFactory.createWaterTile();
                        break;
                    case colGras:
                        tile = tileFactory.createGrasTile();
                        break;
                }
                tile.setPosition(posX * tile.getWidth(), posy * tile.getHeight());
            }
        }

        mapImage.dispose();


    }
}

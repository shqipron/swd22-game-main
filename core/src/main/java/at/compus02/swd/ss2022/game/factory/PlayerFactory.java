package at.compus02.swd.ss2022.game.factory;

import at.compus02.swd.ss2022.game.gameobjects.Player;
import at.compus02.swd.ss2022.game.input.Attack;
import at.compus02.swd.ss2022.game.input.GameInput;
import at.compus02.swd.ss2022.game.input.Move;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.OrthographicCamera;
import at.compus02.swd.ss2022.game.observer.MovePlayerObserver;
import at.compus02.swd.ss2022.game.observer.ConsoleLoggerObserver;


public class PlayerFactory{

    public Player create(GameInput gameInput, OrthographicCamera camera) {

        Player player = new Player();

        gameInput.registerMoveCommand(Input.Keys.W | Input.Keys.UP, new Move(player, 0, 2));
        gameInput.registerMoveCommand(Input.Keys.S | Input.Keys.DOWN, new Move(player, 0, -2));
        gameInput.registerMoveCommand(Input.Keys.A | Input.Keys.LEFT, new Move(player, -2, 0));
        gameInput.registerMoveCommand(Input.Keys.D | Input.Keys.RIGHT, new Move(player, 2, 0));
        gameInput.registerSingleActionCommand(Input.Keys.SPACE, new Attack(player));

        player.registerObserver(new ConsoleLoggerObserver());
        player.registerObserver(new MovePlayerObserver(camera));
        return player;
    }

    public Player create(GameInput gameInput, OrthographicCamera camera, float x, float y) {
        Player player = create(gameInput, camera);
        player.setPosition(x, y);
        return player;
    }
}

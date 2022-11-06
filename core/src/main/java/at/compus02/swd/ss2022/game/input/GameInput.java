package at.compus02.swd.ss2022.game.input;

import com.badlogic.gdx.InputAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class GameInput extends InputAdapter {

    private HashMap<Integer, ArrayList<Commands>> singleAction;
    private HashMap<Integer, ArrayList<Commands>> moveCommand;
    private HashSet<Integer> pressedKey;

    public GameInput() {
        moveCommand = new HashMap<>();
        singleAction = new HashMap<>();
        pressedKey = new HashSet<>();
    }

    @Override
    public boolean keyDown(int keycode) {
        pressedKey.add(keycode);

        ArrayList<Commands> commandArrayList = singleAction.get(keycode);
        if (commandArrayList != null) {
            for (Commands command : commandArrayList) {
                command.execute();
            }
        }

        return true;
    }

    @Override
    public boolean keyUp(int keycode) {
        pressedKey.remove(keycode);
        return true;
    }

    public void update() {
        for (Integer pressedKey : pressedKey) {
            ArrayList<Commands> commandArrayList = moveCommand.get(pressedKey);
            if (commandArrayList != null) {
                for (Commands command : commandArrayList) {
                    command.execute();
                }
            }
        }
    }

    public void registerMoveCommand(int keycode, Commands command) {
        if (moveCommand.containsKey(keycode)) {
            moveCommand.get(keycode).add(command);
        } else {
            ArrayList<Commands> commandArrayList = new ArrayList<>();
            commandArrayList.add(command);
            moveCommand.put(keycode, commandArrayList);
        }
    }

    public void registerSingleActionCommand(int keycode, Commands command) {
        if (singleAction.containsKey(keycode)) {
            singleAction.get(keycode).add(command);
        } else {
            ArrayList<Commands> commandArrayList = new ArrayList<>();
            commandArrayList.add(command);
            singleAction.put(keycode, commandArrayList);
        }
    }
}

package at.compus02.swd.ss2022.game.input;

import at.compus02.swd.ss2022.game.gameobjects.Player;

public class Attack implements Commands{
    Player player;

    public Attack(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.attack();
    }
}

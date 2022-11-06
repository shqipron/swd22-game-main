package at.compus02.swd.ss2022.game.movementstrategy;

public interface MoveStrategy {
    MoveVector getMoveVector(float x,float y);
    MoveVector getMoveVector();
}

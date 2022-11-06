package at.compus02.swd.ss2022.game.observer;

public class ConsoleLoggerObserver implements PlayerMovement{
    @Override
    public void Moved(float fromX, float fromY, float byX, float byY) {
        System.out.println( "Player moved from (" + fromX + "/" + fromY + " ) " +
                "to (" + (fromX + byX) + "/" + (fromY + byY) + " )." );
    }

    @Override
    public void Attacked(float x, float y) {
        System.out.println( "Player attacked at (" + x + "/" + y + " )." );
    }
}

package Fabric;

public class AppleReward implements IGameItem{
    @Override
    public void open() {
        System.out.println("Открыли сундук с яблоками");
    }
}
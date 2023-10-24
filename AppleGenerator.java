package Fabric;

public class AppleGenerator extends ItemFabric{
    @Override
    public IGameItem createItem() {
        System.out.println("Cоздали сундук(яблок)");
        return new AppleReward();
    }
}

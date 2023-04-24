public class FactoryBMW320 implements Factory{
    @Override
    public BMW createFactory() {
        return new BMW320();
    }
}

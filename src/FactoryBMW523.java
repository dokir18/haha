public class FactoryBMW523 implements Factory{
    @Override
    public BMW createFactory() {
        return new BMW523();
    }
}

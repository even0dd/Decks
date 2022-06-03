public class WhiteDeck extends AbstractDeck{
    @Override
    public void write(){
        System.out.println("Write with markers");
    }
    @Override
    public String toString() {
        return
                "height=" + height +
                ", width=" + width +
                ", color='" + color + '\'';

    }

}

public class BlackDeck extends AbstractDeck {
    @Override
    public void write(){
        System.out.println("Write with chalk");
    }
    @Override
    public String toString() {
        return
                "height=" + height +
                ", width=" + width +
                ", color='" + color + '\'' ;

    }

}

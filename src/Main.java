public class Main {
    public static void main(String[] args) {
        AbstractDeck black = new BlackDeck();
        black.setColor("Black");
        black.setHeight(10);
        black.setWidth(10.5);
        AbstractDeck white = new WhiteDeck();
        white.setHeight(15.5);
        white.setWidth(12.7);
        white.setColor("White");
        System.out.println("BlackDeck: "+black+"\n"+"WhiteDeck: "+white);
    }
}

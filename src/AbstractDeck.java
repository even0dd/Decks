abstract public  class AbstractDeck {
    protected double height;
    protected double width;
    protected String  color;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void write(){
        System.out.println("Write");
    }

    @Override
    public String toString() {
        return "AbstractDeck{" +
                "height=" + height +
                ", width=" + width +
                ", color='" + color + '\'' +
                '}';
    }
}

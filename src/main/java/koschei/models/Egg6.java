package koschei.models;

public class Egg6 {

    private Needle7 neddle;

    public Egg6(Needle7 neddle) {
        this.neddle = neddle;
    }


    @Override
    public String toString() {
        return ", в яйце иголка " + neddle.toString();
    }
}

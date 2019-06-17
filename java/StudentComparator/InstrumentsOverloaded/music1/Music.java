package music1;

//no interfaces, overloading

class Wind  {
    public void play(String n) {
        System.out.println("Wind.play() " + n);
    }
}

class Percussion {
    public void play(String n) {
        System.out.println("Percussion.play() " + n);
    }
}

class Stringed {
    public void play(String n) {
        System.out.println("Stringed.play() " + n);
    }
}

public class Music {
    public static void tune(Wind i) {
        i.play("Middle C");
    }
    public static void tune(Stringed i) {
        i.play("Middle C");
    }
    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        tune(flute); // No upcasting necessary
        tune(violin);
    }
}
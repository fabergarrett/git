package music;

//with the Instrument interface and polymorphism

interface Instrument {
    void play(String n); // Automatically public
}

class Wind implements Instrument {
    public void play(String n) {
        System.out.println("Wind.play() " + n);
    }
}

class Percussion implements Instrument {
    public void play(String n) {
        System.out.println("Percussion.play() " + n);
    }
}

class Stringed implements Instrument {
    public void play(String n) {
        System.out.println("Stringed.play() " + n);
    }
}


public class Music {
    public static void tune(Instrument i) {
        i.play("Middle C");
    }
    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Percussion snaredrum = new Percussion();
        tune(flute);  //upcasting to Instrument
        tune(violin); //upcasting to Instrument
        tune(snaredrum);
    }
}

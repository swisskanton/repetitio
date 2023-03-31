/*
StringedInstrument has 3 descendants, namely:-
    Electric Guitar (6 strings, "Twang")
    Bass Guitar (4 strings, "Duum-duum-duum")
    Violin (4 strings, "Screech")
 */
package music;

public class Violin extends StringedInstrument{
    public Violin() {
        this.name = "Violin";
        this.numberOfStrings = 4;
        this.sound = "Screech";
    }

    public Violin(int number) {
        this.name = "Violin";
        this.numberOfStrings = number;
        this.sound = "Screech";
    }

    @Override
    protected String sound() {
        return this.sound;
    }

    @Override
    public void play() {
        System.out.printf("%s, a %d-stringed instrument that goes %s\n", this.name, this.numberOfStrings, this.sound());
    }
}

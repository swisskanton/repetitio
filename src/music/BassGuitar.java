/*
StringedInstrument has 3 descendants, namely:-
    Electric Guitar (6 strings, "Twang")
    Bass Guitar (4 strings, "Duum-duum-duum")
    Violin (4 strings, "Screech")
 */
package music;

public class BassGuitar extends StringedInstrument{

    public BassGuitar() {
        this.name = "Bass Guitar";
        this.numberOfStrings = 4;
        this.sound = "Duum-duum-duum";
    }

    public BassGuitar(int number) {
        this.name = "Bass Guitar";
        this.numberOfStrings = number;
        this.sound = "Duum-duum-duum";
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

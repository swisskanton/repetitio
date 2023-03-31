/*
StringedInstrument has 3 descendants, namely:-
    Electric Guitar (6 strings, "Twang")
    Bass Guitar (4 strings, "Duum-duum-duum")
    Violin (4 strings, "Screech")
 */
package music;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar() {
        this.name = "Electric Guitar";
        this.numberOfStrings = 6;
        this.sound = "Twang";
    }
    public ElectricGuitar(int number) {
        this.name = "Electric Guitar";
        this.numberOfStrings = number;
        this.sound = "Twang";
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

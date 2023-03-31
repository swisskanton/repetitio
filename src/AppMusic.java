/*
Create a package called music. Create the corresponding classes in this package.
The AppMusic class (see below) will reference to these classes.

We start with a base, abstract class Instrument.
    it reserves (e.g. protected) the name of the instrument
    it should provide a play() method.
Next, we add another abstract class, StringedInstrument which extends Instrument. It
    introduces numberOfStrings and
    sound() method what's implementation is yet unknown
    but with the help of the sound() the play() method is fully implementable
StringedInstrument has 3 descendants, namely:-
    Electric Guitar (6 strings, "Twang")
    Bass Guitar (4 strings, "Duum-duum-duum")
    Violin (4 strings, "Screech")
The Workshop should be invoked by an AppMusic class which is placed outside the music package.

Expected output:
    Test 1, create Electric Guitar, Bass Guitar and Violin with default strings.
    Test 1 Play
    Electric Guitar, a 6-stringed instrument that goes Twang
    Bass Guitar, a 4-stringed instrument that goes Duum-duum-duum
    Violin, a 4-stringed instrument that goes Screech
    Test 2, create Electric, Bass Guitar with 7 and 5 strings.
    Test 2 Play
    Electric Guitar, a 7-stringed instrument that goes Twangg
    Bass Guitar, a 5-stringed instrument that goes Duum-duum-duum
 */
import music.*;

public class AppMusic {

    public static void main(String[] args) {

        System.out.println("Test 1, create Electric Guitar, Bass Guitar and Violin with default strings.");
        ElectricGuitar guitar = new ElectricGuitar();
        BassGuitar bassGuitar = new BassGuitar();
        Violin violin = new Violin();

        System.out.println("Test 1 Play");
        guitar.play();
        bassGuitar.play();
        violin.play();

        System.out.println("Test 2, create Electric Guitar, Bass Guitar with 7 and 5 strings .");
        ElectricGuitar guitar2 = new ElectricGuitar(7);
        BassGuitar bassGuitar2 = new BassGuitar(5);

        System.out.println("Test 2 Play");
        guitar2.play();
        bassGuitar2.play();
    }
}
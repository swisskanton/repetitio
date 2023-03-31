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
 */
package music;

public abstract class StringedInstrument extends Instrument{

    protected int numberOfStrings;

    protected abstract String sound();
}

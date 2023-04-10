/*
Each piece of Cloth has a type, a color and a number indicating its condition
 that can all be specified at creation.

It also has a daysWorn numeric property that is initially zero.
Has a needsToBeWashed() method that returns whether the cloth needs to be washed or not.
 Its implementation depends on the type of the cloth.
Has a needsToBeRepaired() method that returns whether the cloth needs to be repaired or not.
 Its implementation depends on the type of the cloth.
It has a wear() method that increments daysWorn by one. It throws an error if the cloth
 cannot be worn because it needs to be washed.
It has a wash() method that resets daysWorn to zero and decrements condition by one.
 Note:condition cannot be negative.
It has a repair() method that resets condition to its initial value.
It has a getInfo() method that returns information on the piece of cloth in the following format:
        {color} {type} worn for {daysWorn} days, has {condition} wash cycles left
    Example:
        blue skirt worn for 3 days, has 15 wash cycles left
There are two kinds of clothes: Underwear and Overwear.
 */
package wardrobe;

public interface Cloth {

    boolean needsToBeWashed();
    boolean needsToBeRepaired();
    void wear() throws Exception;
    void wash();
    void repair();
    String getInfo();
}
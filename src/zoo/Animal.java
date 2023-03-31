/*
So we need an abstract Animal class
    it has name, age field
    it has getName() and breed() methods
Have we got all fields and methods we should? What about gender? Any other? Write down at least
3 fields and/or methods that should be included in Animal.
 */
package zoo;

public abstract class Animal {

    protected String name;
    protected String gender;
    protected int numberOfLegs;
    protected String bread;


    public String getName() {
        return this.name;
    }

    public abstract String breed();

    public String getGender() {
        return this.gender;
    }

    public void setGenderToFemale() {
        this.gender = "female";
    }

    public void setGenderToMale() {
        this.gender = "male";
    }
}

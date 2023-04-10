/*
Has an addCloth() method for adding a piece of cloth to the wardrobe.
Has a printInfo() method that prints the return value of the getInfo() method of all clothes in the wardrobe.
Has a washAllClothes() method that calls the wash() method of all clothes that need to be washed.
Has a repairAllClothes() method that calls the repair() method of all clothes that need to be repaired.
Has a purge() method that removes all clothes from the wardrobe whose condition is zero.
 It returns a list of the clothes that have been removed.
 */
package wardrobe;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Wardrobe {
    List<Cloth> cabinet;

    public Wardrobe() {
        this.cabinet = new ArrayList<>();
    }

    public void addCloth(Cloth cloth) {
        this.cabinet.add(cloth);
    }

    public void printInfo() {
        for (Cloth cloth: this.cabinet) {
            System.out.println(cloth.getInfo());
        }
    }

    public void washAllClothes() {
        for (Cloth cloth: this.cabinet) {
            if (cloth.needsToBeWashed())
                cloth.wash();
        }
    }

    public void repairAllClothes() {
        for (Cloth cloth: this.cabinet) {
            if (cloth.needsToBeRepaired())
                cloth.repair();
        }
    }

    public List<Cloth> purge() {
        List<Cloth> scrap = new ArrayList<>();
        for (Cloth cloth: this.cabinet) {
            if (Objects.equals(cloth.getInfo().replaceAll("[^\\d ]", "").trim().split(" ")[3], "0")) {
                scrap.add(cloth);
            }
        }
        for (Cloth cloth: scrap) {
            this.cabinet.remove(cloth);
        }
        return scrap;
    }
}

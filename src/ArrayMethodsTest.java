import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMethodsTest {

    ArrayMethods am = new ArrayMethods();

    @org.junit.jupiter.api.Test
    @DisplayName("Add test: Array has a zero")
    void arrayHasOneZero() {
        assertArrayEquals(am.add(new int[] {1,2,0,4,5}, 3), new int[] {1, 2, 3, 4, 5});
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Add test: Array has two zeros")
    void arrayHasTwoZeros() {
        assertArrayEquals(am.add(new int[] {1,0,0,4,5}, 3), new int[] {1, 3, 0, 4, 5});
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Add test: Array is empty")
    void arrayIsEmpty() {
        assertArrayEquals(am.add(new int[] {}, 3), new int[] {3});
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Add test: The number is added to the end of the array")
    void TheNumberIsAddedToTheEndOfTheArray() {
        assertArrayEquals(am.add(new int[] {1,2,3,4,5}, 6), new int[] {1,2,3,4,5,6});
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Add by Index test: Insert into first position")
    void insertToIndexZero() {
        assertArrayEquals(am.addByIndex(new int[] {1,2,3,4,5}, 0, 6), new int[] {6,2,3,4,5});
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Add by Index test: Insert into middle position")
    void insertIntoMiddle() {
        assertArrayEquals(am.addByIndex(new int[] {1,2,3,4,5}, 2, 6), new int[] {1,2,6,4,5});
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Add by Index test: Insert into last position")
    void addToEndWnex() {
        assertArrayEquals(am.addByIndex(new int[] {1,2,3,4,5}, 6, 6), new int[] {1,2,3,4,5,6});
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Remove test: Doesn't has removable element")
    void doNotHasRemovableItem() {
        assertArrayEquals(am.remove(new int[] {1,2,3,2,1}, 5), new int[] {1, 2, 3, 2, 1});
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Remove test: Removes first appearance")
    void removesFirstAppearance() {
        assertArrayEquals(am.remove(new int[] {1,2,3,2,1}, 2), new int[] {1, 3, 2, 1});
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Remove test: Removes unique appearance")
    void removesUniqueAppearance() {
        assertArrayEquals(am.remove(new int[] {1,2,3,2,1}, 3), new int[] {1, 2, 2, 1});
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Remove by Index test: Out of index")
    void outOfIndex() {
        assertArrayEquals(am.removeByIndex(new int[] {1,2,3,4,5}, 5), new int[] {1, 2, 3, 4, 5});
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Remove by Index test: Remove first")
    void removeFirst() {
        assertArrayEquals(am.removeByIndex(new int[] {1,2,3,4,5,6,7,8}, 0), new int[] {2, 3, 4, 5, 6, 7, 8});
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Remove by Index test: Remove middle")
    void removeMiddle() {
        assertArrayEquals(am.removeByIndex(new int[] {1,2,3,4,5,6,7,8}, 3), new int[] {1, 2, 3, 5, 6, 7, 8});
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Remove by Index test: Remove last")
    void removeLast() {
        assertArrayEquals(am.removeByIndex(new int[] {1,2,3,4,5,6,7,8}, 7), new int[] {1, 2, 3, 4, 5, 6, 7});
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Remove by Index test: Removing from an empty array")
    void removingFromEmptyArray() {
        assertArrayEquals(am.removeByIndex(new int[] {}, 7), new int[] {});
    }
}
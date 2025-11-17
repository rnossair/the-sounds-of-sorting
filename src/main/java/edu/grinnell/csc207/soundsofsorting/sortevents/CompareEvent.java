package edu.grinnell.csc207.soundsofsorting.sortevents;

import java.util.Arrays;
import java.util.List;

/**
 * A <code>CompareEvent</code> logs a comparison a sort makes between two
 * indices in the array.
 */
public class CompareEvent<T> implements SortEvent<T> {

    private int i;
    private int j;

    public CompareEvent(int i, int j) {
        this.i = i;
        this.j = j;
    }

    /**
     * Applies this event to the array.
     * 
     * @param arr the array to modify
     */
    @Override
    public void apply(T[] arr) {
        return;
    }

    /**
     * @return a list of the indices affected by this event
     */
    @Override
    public List<Integer> getAffectedIndices() {
        return Arrays.asList(i, j);
    }

    /**
     * @return <code>true</code> iff this event is emphasized
     */
    @Override
    public boolean isEmphasized() {
        return false;
    }
}

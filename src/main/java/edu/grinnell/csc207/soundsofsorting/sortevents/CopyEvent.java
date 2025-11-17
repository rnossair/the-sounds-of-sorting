package edu.grinnell.csc207.soundsofsorting.sortevents;

import java.util.Arrays;
import java.util.List;

/**
 * A <code>CopyEvent</code> logs a copy of a value into an index of the array.
 */
public class CopyEvent<T> implements SortEvent<T>{

    private int i;
    private int j;
    private T value;

    public CopyEvent(int i, int j, T value) {
        this.i = i;
        this.j = j;
        this.value = value;
    }

    /**
     * Applies this event to the array.
     * 
     * @param arr the array to modify
     */
    @Override
    public void apply(T[] arr) {
        arr[j] = value;
        return;
    }

    /**
     * @return a list of the indices affected by this event
     */
    @Override
    public List<Integer> getAffectedIndices() {
        return Arrays.asList(j);
    }

    /**
     * @return <code>true</code> iff this event is emphasized
     */
    @Override
    public boolean isEmphasized() {
        return true;
    }
}

package patterns.architecture.Solid;

//Single Responsibility Principle

import java.util.ArrayList;
import java.util.List;

/**
 * A class should have a single responsibility and shouldn't do anything else
 * this class only has one responsibility which is to add entry and remove entry
 * for example if we wanted a method which saves entries as a file we would need a new class
 *
 *
 * this is incomplete, will be updated in later PRs
 */
public class SRP {

    private final List<String> entries = new ArrayList<>();
    private static int count = 0;

    public void addEntry(String text) {
        entries.add("" + (++count) + ": " + text);
    }

    @Override
    public String toString() {
        return "SRP{" +
                "entries=" + entries +
                '}';
    }
}

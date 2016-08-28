package org.company;

import org.company.abstracts.AbstractMyClass;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

/**
 * The {@link MyFunctionalClass} is a simple class.
 *
 * @since Current.Project.Version
 */
public class MyFunctionalClass extends AbstractMyClass {

    /**
     * This is a constant.
     */
    public static final String MY_TEXT_CONSTANT = "Foobar";

    /**
     * This is a field.
     */
    private final int anInt;

    private int anotherInt = 0;

    /**
     * The default constructor.
     * <p>
     * Doing nothing.
     */
    public MyFunctionalClass() {
        this(0);
    }

    /**
     * A constructor overriding the default {@link MyClass#anInt} value.
     *
     * @param anInt The new anInt value
     */
    public MyFunctionalClass(final int anInt) {
        this.anInt = anInt;
    }

    /**
     * This method does something.
     */
    @Override
    public void doSomething() {
        @NotNull final List<String> superList = generateList();
        final boolean allEmpty = superList
                .stream()
                .allMatch(String::isEmpty);
        if (!allEmpty) {
            int sum = Arrays
                    .stream(MY_TEXT_CONSTANT.split(""))
                    .map(s -> s.charAt(0))
                    .mapToInt(c -> (int) c)
                    .sum();
            this.anotherInt = sum;
        }
    }

    @NotNull
    private List<String> generateList() {
        return Arrays.asList(
                MY_TEXT_CONSTANT, "Cooool"
        );
    }
}
// Empty line at the end for git!

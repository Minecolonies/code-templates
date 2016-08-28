package org.company;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;
import org.company.abstracts.AbstractMyClass;

/**
 * The {@link MyClass} is a simple class.
 *
 * @since Current.Project.Version
 */
public class MyClass extends AbstractMyClass {

    /**
     * This is a constant.
     */
    public static final String MY_TEXT_CONSTANT = "Foobar";

    /**
     * This is a field.
     */
    private final int anInt;

    /**
     * The default constructor.
     * <p>
     * Doing nothing.
     */
    public MyClass() {
        this(0);
    }

    /**
     * A constructor overriding the default {@link MyClass#anInt} value.
     *
     * @param anInt The new anInt value
     */
    public MyClass(final int anInt) {
        this.anInt = anInt;
    }

    public static void main(String... args) {
        MyClass myClass = new MyClass();

        myClass.equals(new Object());
    }

    /**
     * A method doing exactly nothing.
     */
    public void doNothing() {
        // Nothing
    }

    /**
     * This methods froms from {@link org.company.interfaces.IMyInterface}
     */
    @NotNull
    public String makeItWork(@Nullable String foo, @NotNull String bar) {
        // Check for null on @Nullable
        if (foo == null) {
            //Early return on null checks and important requirements
            return "";
        }

        //@NotNull requires the caller to check for null
        if (bar.isEmpty()) {
            return foo + bar;
        }
        return foo;
    }

    /**
     * This methods froms from {@link org.company.interfaces.IMyInterface}
     */
    @Override
    public void doSomething() {
        if (checkCondition()) {
            // Do something
        } else {
            // Do something else
        }
    }

    /**
     * Checks the {@link MyClass#anInt} value is greater 0.
     *
     * @return True if {@link MyClass#anInt} is greater 0
     */
    private boolean checkCondition() {
        return this.anInt > 0;
    }
}
// Empty line at the end for git!

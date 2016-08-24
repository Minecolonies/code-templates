package org.company;

import org.company.abstracts.AbstractMyClass;

/**
 * The {@link MyClass} is a simple class.
 *
 * @author MyName
 * @since Current.Project.Version
 */
public class MyClass extends AbstractMyClass
{
    /**
     * This is a constant.
     */
    public  static  final   String  MY_TEXT_CONSTANT    = "Foobar";

    /**
     * This is a field.
     */
    private final   int     anInt;

    /**
     * The default constructor.
     *
     * Doing nothing.
     */
    public MyClass( )
    {
        this(0);
    }

    /**
     * A constructor overriding the default {@link MyClass#anInt} value.
     *
     * @param anInt The new anInt value
     */
    public MyClass(final int anInt)
    {
        this.anInt = anInt;
    }

    /**
     * A method doing exactly nothing.
     */
    public void doNothing( )
    {
        // Nothing
    }

    /**
     * This methods froms from {@link org.company.interfaces.IMyInterface}
     */
    @Override
    public void doSomething( )
    {
        if ( checkCondition( ) )
        {
            // Do something
        }
        else
        {
            // Do something else
        }
    }

    /**
     * Checks the {@link MyClass#anInt} value is greater 0.
     *
     * @return True if {@link MyClass#anInt} is greater 0
     */
    private boolean checkCondition( )
    {
        return ( (this.anInt > 0) ? true : false);
    }

    public static void main(String...args)
    {
        MyClass myClass = new MyClass( );

        myClass.equals(new Object( ));
    }

}
// Empty line at the end!
package org.company;

/**
 * @since Current.Project.Version
 */
public class LargeClass {

    public static final String           staticVarOne   = "var one content";
    public static final String           staticVarFour  = "var four content";
    public static final MySuperLongClass staticVarFive  = new MySuperLongClass();
    public static       Object           staticVarTwo   = new Object();
    public static       Integer          staticVarThree = 3;
    public static       String           staticVarSix   = "var six content";
    public static       String           staticVarSeven = "var seven content";

    private final String fieldOne   = "field one value";
    private final Object fieldThree = new Object();
    private final String fieldFour  = "field four value";
    private final String fieldSix   = "field six value";
    private       String fieldTwo   = "field two value";
    private       int    fieldFive  = 5;
    private       String fieldSeven = "field seven value";
}

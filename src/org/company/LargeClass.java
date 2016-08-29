package org.company;

import org.jetbrains.annotations.NotNull;

/**
 * @since Current.Project.Version
 */
public class LargeClass
{
    public static final String           staticVarOne  = "var one content";
    public static final String           staticVarFour = "var four content";
    public static final MySuperLongClass staticVarFive = new MySuperLongClass();

    @NotNull
    public static Object  staticVarTwo   = new Object();
    @NotNull
    public static Integer staticVarThree = 3;
    @NotNull
    public static String  staticVarSix   = "var six content";
    @NotNull
    public static String  staticVarSeven = "var seven content";

    private final String fieldOne   = "field one value";
    private final Object fieldThree = new Object();
    private final String fieldFour  = "field four value";
    private final String fieldSix   = "field six value";

    @NotNull
    private String fieldTwo   = "field two value";
    private int    fieldFive  = 5;
    @NotNull
    private String fieldSeven = "field seven value";
}

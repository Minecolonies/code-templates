package org.company;

/**
 * @since Current.Project.Version
 */
public enum MyEnum {
    ENUM_ONE,
    ENUM_TWO("two"),
    ENUM_THREE,
    ENUM_FOUR;

    private String someVar;

    MyEnum() {

    }

    MyEnum(String someVar) {

        this.someVar = someVar;
    }
}

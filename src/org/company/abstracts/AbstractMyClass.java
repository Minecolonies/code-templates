package org.company.abstracts;

import org.company.interfaces.IMyInterface;

/**
 * @since Current.Project.Version
 */
public abstract class AbstractMyClass implements IMyInterface {

    private int localInt;

    public AbstractMyClass() {

    }

    public AbstractMyClass(final int localInt) {
        this.localInt = localInt;
    }
}

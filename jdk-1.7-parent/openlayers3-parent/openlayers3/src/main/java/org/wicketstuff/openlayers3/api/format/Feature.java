package org.wicketstuff.openlayers3.api.format;

import org.wicketstuff.openlayers3.api.JavascriptObject;

import java.io.Serializable;

/**
 * Provides an object that models a format for specifying feature data.
 */
public abstract class Feature extends JavascriptObject implements Serializable {

    /**
     * Creates a new instance.
     */
    public Feature() {
        super();
    }

    @Override
    public String getJsType() {
        return "ol.format.Feature";
    }
}

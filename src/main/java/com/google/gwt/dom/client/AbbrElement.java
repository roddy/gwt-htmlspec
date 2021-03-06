package com.google.gwt.dom.client;

import com.google.gwt.core.client.JavaScriptObject;

@TagName(AbbrElement.TAG)
public class AbbrElement extends Element {
    public static final String TAG = "abbr";

    /**
     * Assert that the given {@link Element} is compatible with this class and automatically typecast it.
     */
    public static AbbrElement as(Element element) {
        assert is(element);
        return (AbbrElement) element;
    }

    /**
     * Determines whether the given {@link com.google.gwt.core.client.JavaScriptObject} can be cast to this class. A <code>null</code> object will
     * cause this method to return <code>false</code>.
     * @param o the object to test
     * @return true if the given object can be cast to this class, false if otherwise or null
     */
    public static boolean is(JavaScriptObject o) {
        if(Element.is(o)) {
            return is((Element)o);
        }
        return false;
    }

    /**
     * Determines whether the given {@link Node} can be cast to this class. A <code>null</code> object will cause this
     * method to return <code>null</code>.
     * @param node the Node object to test
     * @return true if the given Node can be cast to this class, false if otherwise or null
     */
    public static boolean is(Node node) {
        if(Element.is(node)) {
            return is((Element)node);
        }
        return false;
    }

    /**
     * Determines whether the given {@link Element} can be cast to this class. A <code>null</code> object will cause
     * this method to return <code>null</code>.
     * @param elem the Element object to test
     * @return true if the given Element can be cast to this class, false if otherwise or null
     */
    public static boolean is(Element elem) {
        return elem != null && elem.hasTagName(TAG);
    }

    protected AbbrElement() {

    }
}

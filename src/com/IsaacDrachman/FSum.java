package com.IsaacDrachman;

/**
 * Function-type class for the sum of two functions.
 */
public class FSum extends Func {

    private Func u;
    private Func v;

    /**
     * Creates a function which is the sum of two function.
     *
     * @param initU function
     * @param initV function
     */
    public FSum(Func initU, Func initV) {
        u = initU;
        v = initV;
    }

    // Abstract Func implementation.
    public Double apply(Double x) {
        return u.apply(x)+v.apply(x);
    }

    public FSum diff() {
        return new FSum(u.diff(),v.diff());
    }

    public String toString() {
        return "(" + u.toString() + ") + (" + v.toString() + ")";
    }
}

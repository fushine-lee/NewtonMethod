package com.IsaacDrachman;

/**
 * Function-type class for a product of two functions.
 */
public class FProduct extends Func {

    private Func u;
    private Func v;

    /**
     * Creates a function which is the product of two functions.
     *
     * @param initU function
     * @param initV function
     */
    public FProduct(Func initU, Func initV) {
        u = initU;
        v = initV;
    }

    // Abstract Func implementation.
    public Double apply(Double x) {
        return u.apply(x)*v.apply(x);
    }

    public FSum diff() {
        FProduct u_vprime = new FProduct(u,v.diff());
        FProduct v_uprime = new FProduct(u.diff(),v);
        return new FSum(u_vprime,v_uprime);
    }

    public String toString() {
        return "(" + u.toString() + ") * (" + v.toString() + ")";
    }
}

package com.IsaacDrachman;

/**
 * Abstract class for inheritance by all function-type classes.
 */
public abstract class Func {

    /**
     * Evaluates the function at a given point.
     *
     * @param x point
     * @return function value at x
     */
    abstract public Double apply(Double x);

    /**
     * Returns the derivative of the function as another function object.
     *
     * @return derivative of function
     */
    abstract public Func diff();

    /**
     * Returns the formula of this function for printing.
     *
     * @return formula of function
     */
    abstract public String toString();
}

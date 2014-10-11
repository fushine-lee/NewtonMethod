package com.IsaacDrachman;

/**
 * Static class to perform Newton's Method.
 */
public class NewtonMethod {

    /**
     * Performs iterative Newton's method to find a zero of a function
     * nearest starting point x0.
     *
     * @param x0 point to start iteration
     * @param f function to find zero
     * @param maxSteps length of iteration
     * @return approximate zero
     */
    public static double newton(double x0, Func f, int maxSteps) {
        double x = x0;
        for (int step = 0; step < maxSteps; ++step) {
            x = newton_step(x,f);
        }
        return x;
    }

    /**
     * Performs one step of Newton's method.
     *
     * @param x point
     * @param f function
     * @return x adjusted one step towards a zero
     */
    private static double newton_step(double x, Func f) {
        return x - f.apply(x)/f.diff().apply(x);
    }
}

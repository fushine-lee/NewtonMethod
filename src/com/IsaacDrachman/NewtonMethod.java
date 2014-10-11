package com.IsaacDrachman;

/**
 * Class with static functions to perform Newton's Method.
 */
public class NewtonMethod {

    /**
     * Iteratively approximates nearest root of a given function
     *
     * @param x0 point to start iteration
     * @param f function to find zero
     * @param maxSteps length of iteration (in steps)
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
     * @return point moved one step towards a zero
     */
    private static double newton_step(double x, Func f) {
        return x - f.apply(x)/f.diff().apply(x);
    }
}

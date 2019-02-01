package Algorithms;

import org.jzy3d.plot3d.builder.Mapper;

import java.io.Serializable;

public class Function implements Serializable {

    /**
     * Calculate the result of (x^4)-2(x^3).
     * Domain is (-infinity, infinity).
     * Minimum is -1.6875 at x = 1.5.
     * @param x     the x component
     * @return      the y component
     */
    public static double RosenBrock(double x, double y) {
        double a=1;
        double b=100;
        double z1;
        double z2;
        z1 = Math.pow(a-x, 2);
        z2 = Math.pow(y-Math.pow(x,2),2);
        return z1 + b*z2;
    }

    /**
     * Perform Ackley's function.
     * Domain is [5, 5]
     * Minimum is 0 at x = 0 & y = 0.
     * @param x     the x component
     * @param y     the y component
     * @return      the z component
     */
    public static double ackleysFunction(double x, double y) {
        double p1 = -20*Math.exp(-0.2*Math.sqrt(0.5*((x*x)+(y*y))));
        double p2 = Math.exp(0.5*(Math.cos(2*Math.PI*x)+Math.cos(2*Math.PI*y)));
        return p1 - p2 + Math.E + 20;
    }

    /**
     * Perform Booth's function.
     * Domain is [-10, 10]
     * Minimum is 0 at x = 1 & y = 3.
     * @param x     the x component
     * @param y     the y component
     * @return      the z component
     */
    public static double boothsFunction(double x, double y) {
        double p1 = Math.pow(x + 2*y - 7, 2);
        double p2 = Math.pow(2*x + y - 5, 2);
        return p1 + p2;
    }

    /**
     * Perform the Three-Hump Camel function.
     * @param x     the x component
     * @param y     the y component
     * @return      the z component
     */
    public static double XsqerYsqer(double x, double y) {
        return Math.pow(x,2) + Math.pow(y,2);
    }

    public static Mapper getackleysFunction() {
        return new Mapper() {
            public double f(double x, double y) {
                return Function.ackleysFunction(x,y);
            }
        };
    }

    public static Mapper getboothsFunction() {
        return new Mapper() {
            public double f(double x, double y) {
                return Function.boothsFunction(x,y);
            }
        };
    }

    public static Mapper getRosenBrock() {
        return new Mapper() {
            public double f(double x, double y) {
                return Function.RosenBrock(x,y);
            }
        };
    }


    public static Mapper getXsqerYsqer() {
        return new Mapper() {
            public double f(double x, double y) {
                return Function.XsqerYsqer(x,y);
            }
        };
    }
}
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFl
package org.apache.commons.math3.analysis.function;

import org.apache.commons.math3.analysis.DifferentiableUnivariateFunction;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.util.FastMath;

public class Tan implements DifferentiableUnivariateFunction {
    public Tan() {
    }

    public double value(double x) {
        return FastMath.tan(x);
    }

    public UnivariateFunction derivative() {
        return new UnivariateFunction() {
            public double value(double x) {
                double tanX = FastMath.tan(x);
                return 1.0D + tanX * tanX;
            }
        };
    }
}

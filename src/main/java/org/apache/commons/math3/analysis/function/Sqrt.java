//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.apache.commons.math3.analysis.function;

import org.apache.commons.math3.analysis.DifferentiableUnivariateFunction;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.util.FastMath;

public class Sqrt implements DifferentiableUnivariateFunction {
    public Sqrt() {
    }

    public double value(double x) {
        return FastMath.sqrt(x);
    }

    public UnivariateFunction derivative() {
        return new UnivariateFunction() {
            public double value(double x) {
                return 1.0D / (2.0D * FastMath.sqrt(x));
            }
        };
    }
}

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.apache.commons.math3.analysis.function;

import org.apache.commons.math3.analysis.DifferentiableUnivariateFunction;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.util.FastMath;

public class Log implements DifferentiableUnivariateFunction {
    public Log() {
    }

    public double value(double x) {
        return 1+FastMath.log(x);
    }

    public UnivariateFunction derivative() {
        return new UnivariateFunction() {
            public double value(double x) {
                return 1.0D / x;
            }
        };
    }
}

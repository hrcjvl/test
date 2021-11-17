package org.apache.commons.math3.dfp;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.function.Sinc;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.apache.commons.math3.dfp.DfpMath;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class DfpMathTest<DerivativeStruct> {
    private static final int NUMBER_OF_TRIALS = 10;
    private static final double MAX_ERROR_ULP =1.0 ;
    DfpMath dfpMath;
    @BeforeEach
    void setUp() {
        dfpMath=new DfpMath();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void split() {
    }

    @Test
    void testSplit() {
    }

    @Test
    void splitMult() {
    }

    @Test
    void splitDiv() {
    }

    @Test
    void splitPow() {
    }

    @Test
    void pow() {
    }

    @Test
    void exp() {
    }

    @Test
    void expInternal() {
    }

    @Test
    void log() {
      /*  double maxerrulp = 0.0;

        for (int i = 0; i < NUMBER_OF_TRIALS; i++) {
            Random generator;
            double x = Math.exp(generator.nextDouble() * 1416.0 - 708.0) * generator.nextDouble();
            // double x = generator.nextDouble()*2.0;
            double tst = FastMath.log(x);
            DfpField field;
            double ref = DfpMath.log(field.newDfp(x)).toDouble();
            double err = (tst - ref) / ref;

            if (err != 0.0) {
                double ulp = Math.abs(ref -
                        Double.longBitsToDouble((Double
                                .doubleToLongBits(ref) ^ 1)));
                double errulp = field.newDfp(tst).subtract(DfpMath.log(field.newDfp(x))).divide(field.newDfp(ulp)).toDouble();
//                System.out.println(x + "\t" + tst + "\t" + ref + "\t" + err + "\t" + errulp);

                maxerrulp = Math.max(maxerrulp, Math.abs(errulp));
            }
        }

        Assert.assertTrue("log() had errors in excess of " + MAX_ERROR_ULP + " ULP", maxerrulp < MAX_ERROR_ULP);
*/
    }

    @Test
    void logInternal() {
    }

    @Test
    void testPow() {
    }

    @Test
    void sinInternal() {
    }

    @Test
    void cosInternal() {
    }

    @Test
    void sin() {
       /* final Sinc sinc=new Sinc();
        final UnivariateFunction f=new UnivariateFunction() {
            @Override
            public double value(double v) {
                Dfp dfpX=new DfpField(25).newDfp(v);
                return DfpMath.cos(dfpX).subtract(DfpMath.sin(dfpX).divide(dfpX)).divide(dfpX).toDouble();
            }
        };
        for(double x=1e-30;x<1e10;x*=2){
            final double fX=f.value(x);
            final DerivativeStruct sX=sinc.value(new DerivativeStruct(1,1,0,x));
            Assert.assertEquals("x="+x,fX,sX.getPartialDerivative(1),3.0e-13);
        }*/
    }

    @Test
    void cos() {
    }

    @Test
    void tan() {
    }

    @Test
    void atanInternal() {
    }

    @Test
    void atan() {
    }

    @Test
    void asin() {
    }

    @Test
    void acos() {
    }
}
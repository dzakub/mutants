package org.dzakub.mutants;

public class AbsolutelySimple {

    public boolean isProductPositive(int a, int b) {
        if (a > 0) {
            return b > 0;
        } else {
            return b < 0;
        }
    }
}

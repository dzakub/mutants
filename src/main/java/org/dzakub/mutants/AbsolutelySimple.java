package org.dzakub.mutants;

public class AbsolutelySimple {

    public boolean isProductPositive(int a, int b) {
        if (a > 0) {
            if (b > 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

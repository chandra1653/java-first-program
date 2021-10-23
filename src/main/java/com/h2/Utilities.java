package com.h2;

public class Utilities {


    public static long getLongValues(String in) {
        Long out = Long.MIN_VALUE;
        try {
            out = Long.parseLong(in);
        } catch (Exception e) {
            throw new IllegalArgumentException(in + " cannot be converted into a 'long' value. Exiting program.");
        }
        return out;
    }

    public static int getIntValues(String in) {
        int out = Integer.MIN_VALUE;

        try {
            out = Integer.parseInt(in);

        } catch (Exception e) {
            throw new IllegalArgumentException(in + " cannot be converted into a 'int' value. Exiting program.");
        }
        return out;
    }

    public static float getFloatValues(String in) {
        float out = Float.MIN_VALUE;

        try {
            out = Float.parseFloat(in);

        } catch (Exception e) {
            throw new IllegalArgumentException(in + " cannot be converted into a 'float' value. Exiting program.");
        }
        return out;
    }
}

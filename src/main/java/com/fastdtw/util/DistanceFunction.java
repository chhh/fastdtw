/*
 * Arrays.java   Jul 14, 2004
 *
 * Copyright (c) 2004 Stan Salvador
 * stansalvador@hotmail.com
 */

package com.fastdtw.util;

public interface DistanceFunction {
    double calcDistance(double[] vector1, double[] vector2);
}
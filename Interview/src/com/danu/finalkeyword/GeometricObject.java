package com.danu.finalkeyword;

/**
 * final parameter
 * @author danua
 * @since 2021-01-02
 */
public class GeometricObject {

	int cube(final int n) {
		// n = n+1 we can't change value of n like this
		return n*n*n;
	}
	
	public static void main(String[] args) {
		GeometricObject geometricObject = new GeometricObject();
		System.out.println(geometricObject.cube(5));
	}
}

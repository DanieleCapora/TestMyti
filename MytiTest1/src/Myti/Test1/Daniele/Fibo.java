package Myti.Test1.Daniele;

import java.math.BigInteger;
import java.util.LinkedList;

public class Fibo {

	public BigInteger getFibonacciNumberWith(int n) {
		
		BigInteger n1 = BigInteger.ZERO;
		BigInteger n2 = BigInteger.ONE;
		BigInteger n3 = BigInteger.ZERO;
        
        while(!(n3.toString().length() >= n)) {
        	n3 = n1.add(n2);
            n1 = n2;
            n2 = n3;
        }
        
       return n3;

    }
	
}

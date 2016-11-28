package series;

import java.math.BigDecimal;
import java.math.MathContext;

public class NthSeries {
	
	public static String seriesSum(int n) {
		// Happy Coding ^_^	
		double sum = 1d;
		double divisor = 4d; 
		for(int i = 0; i<n-1;i++){
			sum += new BigDecimal(1/divisor).round(new MathContext(4)).doubleValue();
			divisor += 3;
		}
		
		return String.format("%.2f",sum);
	}
}


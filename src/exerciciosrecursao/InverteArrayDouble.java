package exerciciosrecursao;

import java.util.Arrays;

public class InverteArrayDouble {
private double[] array;

public InverteArrayDouble(double[] x){
	if(x == null || x.length <2) throw new IllegalArgumentException("array nulo ou vazio ou tem menos de 2 elementos");
	
	 inverte(x, 0, x.length -1);
	   this.array=x;
	}

	private void inverte(double[] x, int i, int j){
	    if(i<j){
	       double tmp = x[i];
	       x[i] = x[j];
	       x[j] = tmp;
	       inverte(x, ++i, --j);
	    }   
	}

	public double[] getArray() {
		return array;
	}

	@Override
	public String toString() {
		return "InverteArray [array=" + Arrays.toString(array) + "]";
	}
	
	
}
package exerciciosrecursao;
import java.util.Arrays;

public class InverteArray 
{
	private int[] array;

	public InverteArray(int[] x)
	{
		if(x == null || x.length <2) {
			throw new IllegalArgumentException("array nulo ou vazio ou tem menos de 2 elementos");
		}
		inverte(x, 0, x.length -1);
		this.array=x;
	}

	private void inverte(int[] x, int i, int j)
	{
	    if(i < j) {
	       int tmp = x[i];
	       x[i] = x[j];
	       x[j] = tmp;
	       inverte(x, ++i, --j);
	    }   
	}

	public int[] getArray() 
	{
		return array;
	}

	@Override
	public String toString() 
	{
		return "InverteArray [array=" + Arrays.toString(array) + "]";
	}
	
	
}

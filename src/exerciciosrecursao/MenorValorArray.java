package exerciciosrecursao;

public class MenorValorArray {
private int result;

	public MenorValorArray (int[] array) {
		if(array == null || array.length == 0) throw new IllegalArgumentException("array nulo ou vazio");
		this.result = min (array,0);
		
	}

	private int min(int[] elementos, int indice) {

		  if (indice == elementos.length - 1) {
		    return elementos[indice];
		  }

		  int val = min(elementos, indice + 1);

		  if (elementos[indice] < val)
		    return elementos[indice];
		  else
		    return val;
		}

public int getResult() {
	return result;
}

}
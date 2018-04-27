package exerciciosrecursao;

public class SomaArray {
	
	private int result;
	
	public SomaArray(int[] array) {
		if(array == null || array.length == 0) throw new IllegalArgumentException("array nulo ou vazio");
		this.result = sa(array,0);
	}
	
	private int sa(int[]v,int i) {
		if(i== v.length-1) return v[i];
		return v[i]+sa(v,i+1);
	}

	public int getResult() {
		return result;
	}

}

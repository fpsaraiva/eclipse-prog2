package exerciciosrecursao;

public class Progressiva 
{
	private String str = "";

	public Progressiva(int n)
	{
		prog(n);
	}

	private void prog(int n) 
	{
		if(n == 0) {
			this.str = this.str + n + "-";
			// System.out.println(n);
		} else {
			int y = n - 1;
			prog(y);
			this.str = this.str + n + "-";
			// System.out.println(n);
		}
	}

	public String getStr() 
	{
		return str;
	}

}
package exerciciosrecursao;
import java.text.Normalizer;

public class UtilString 
{
	public String removeAcentos(String str) 
	{
		String strSemAcentos = Normalizer.normalize(str, Normalizer.Form.NFD);
		strSemAcentos = strSemAcentos.replaceAll("[^!.;:,�`'\\p{ASCII}]", "");
		strSemAcentos = strSemAcentos.replaceAll("['\\\\.,()|/]","");
		return strSemAcentos;
	}
	
	public String removeAcentosEspacos(String str) 
	{
		String strSemAcentos = Normalizer.normalize(str, Normalizer.Form.NFD);
		strSemAcentos = strSemAcentos.replaceAll("[^!.;:,�`'\\p{ASCII}]", "");
		strSemAcentos = strSemAcentos.replaceAll("['\\\\.,()|/]","");
		strSemAcentos = strSemAcentos.replaceAll(" ","");
		strSemAcentos = strSemAcentos.toUpperCase();
		return strSemAcentos;
	}
	
	public String retiraCaracteresEspeciais(String stringFonte)
	{
	       String filtro = stringFonte;
	       filtro = filtro.replaceAll("[�����]", "A");
	       filtro = filtro.replaceAll("[�����]", "a");
	       filtro = filtro.replaceAll("[����]", "E");
	       filtro = filtro.replaceAll("[����]", "e");
	       filtro = filtro.replaceAll("����", "I");
	       filtro = filtro.replaceAll("����", "i");
	       filtro = filtro.replaceAll("[�����]", "O");
	       filtro = filtro.replaceAll("[�����]", "o");
	       filtro = filtro.replaceAll("[����]", "U");
	       filtro = filtro.replaceAll("[����]", "u");
	       filtro = filtro.replaceAll("�", "C");
	       filtro = filtro.replaceAll("�", "c");
	       filtro = filtro.replaceAll("[��]", "y");
	       filtro = filtro.replaceAll("�", "Y");
	       filtro = filtro.replaceAll("�", "n");
	       filtro = filtro.replaceAll("�", "N");
	       filtro = filtro.replaceAll("[-+=*&amp;%$#@!_]", "");
	       filtro = filtro.replaceAll("['\"]", "");
	       filtro = filtro.replaceAll("[<>()\\{\\}]", "");
	       filtro = filtro.replaceAll("['\\\\.,()|/]", "");
	       filtro = filtro.replaceAll("[^!-�]{1}[^ -�]{0,}[^!-�]{1}|[^!-�]{1}", " ");
	       return filtro;
	}
	
}
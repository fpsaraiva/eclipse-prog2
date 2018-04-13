package planilhaexcel;

public class Teste {
 
    public static void main(String[] args) {
         
        Planilha p = new Planilha(10,10);
         
        p.setCel(2.3, 1, 4);
        p.setCel(10.0, 4, 2);
        p.setCel(9.0, 3, 0);
        p.setCel("Contabilidade", 1, 1);
         
        p.setCel(new Formula('+', 1, 4, 4, 2), 2, 2);
         
        p.mostraPlan(1, 1, 4, 4);
        
        //p.limpaCels(1, 1, 3, 2);

        //System.out.print("\n\n" + "Limpando celulas"  + "\n");
        
        //p.mostraPlan(1, 1, 4, 4);
         
    }
 
}
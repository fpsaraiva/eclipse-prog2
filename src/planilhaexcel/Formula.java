package planilhaexcel;
 
public class Formula{
     
    static char operacao;
    int l1, l2, c1, c2;
         
    public Formula(char operacao, int l1, int c1, int l2, int c2){
        this.operacao = operacao;
        this.l1 = l1;
        this.c1 = c1;
        this.l2 = l2;
        this.c2 = c2;
    }
     
    public char getOperacao(){
        return operacao;
    }
     
}
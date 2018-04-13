package planilhaexcel;
 
public class Celula {
     
    double Valor;
    String s;
    Formula f;
    int Linha;
    int Coluna;
      
    Celula(double Valor, int Linha, int Coluna){
        this.Valor = Valor;
        this.Linha = Linha;
        this.Coluna = Coluna;
    }
     
    Celula(String s, int Linha, int Coluna){
        this.s = s;
        this.Linha = Linha;
        this.Coluna = Coluna;
    }
     
    Celula(Formula f, int Linha, int Coluna){
        this.f = f;
        this.Linha = Linha;
        this.Coluna = Coluna;
    }
     
    public double getValor(){
        return Valor;
    }
     
    public void setValor(double v){
        this.Valor = v;
    }
      
    public String getString(){
        return s;
    }
     
    public void setString(String s){
        this.s = s;
    }
     
    public Formula getFormula(){
        return f;
    }
     
    public void setFormula(Formula f){
        this.f = f;
    }
     
    public int getLinha(){
        return Linha;
    }
     
    public void setLinha(int l){
        this.Linha = l;
    }
      
    public int getColuna(){
        return Coluna;
    }
     
    public void setColuna(int c){
        this.Coluna = c;
    }
      
}
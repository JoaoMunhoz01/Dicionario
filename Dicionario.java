
public class Dicionario {
	
  private Termo[] termos;
  private int quantidadeTermos;


  public Dicionario() {
    this.termos = new Termo[1];
    this.quantidadeTermos = 0;
  }
  
  public boolean adicionaTermo(String palavra, String significado, String idioma) {
	  
	  if(quantidadeTermos >= termos.length){
	    
	    termos = aumentaVet(termos);
	    
	  }
	  if(quantidadeTermos < termos.length) {
	    	Termo palavraTermo = new Termo(palavra, significado, idioma);
	    	this.termos[quantidadeTermos] = palavraTermo;
	    	quantidadeTermos++;
	    	return true;
	    }
	    return false;
  
  }
  
  public void ordenar(){
	    merge(termos, 0, termos.length-1);
	  }
	  
	  public void merge(Termo a[], int inicio, int fim){
		  
		  
		    if(inicio < fim && a != null){
		      int meio = (inicio+fim)/2;
		      merge(a, inicio, meio);
		      merge(a, meio + 1, fim);
		      combina(a, inicio, meio, fim);
		    }
	  }
	  

  public void combina(Termo[] termos, int i, int m, int f) {
      int e = i; 
      int d = m+1;
      
      Termo aux[] = new Termo[termos.length];
      
      for (int i_ = 0; i_ < termos.length; i_ ++) {
          aux[i_] = termos[i_];
      }
      int k = i;
      while (e <= m && d <= f) {
          if (aux[e].compareTo(aux[d]) <= 0) {
        	  termos[k]  = aux[e];
              k++; e++;
          } else {
        	  termos[k] = aux[d];
              k++; d++;
          }
      }
      
      while (e<=m) {
    	  termos[k]  = aux[e];
              k++; e++;
      }
      
      while (d <= f) {
    	  termos[k] = aux[d];
              k++; d++;
      }
      
      
  }
  
  boolean flag = false;
  
  public String buscaSignificado(String palavra) {
    int inicio = 0;
    int fim = quantidadeTermos-1;
    int meio =(inicio + fim)/2 ;
    
    while(inicio <= fim){
      meio = (inicio+fim)/2;
      if(termos[meio]!=null){ 
        if(termos[meio].getPalavra().equalsIgnoreCase(palavra)){
          flag = true;
          return termos[meio].getSignificado();
        }
        
        else{
          
          if(palavra.compareToIgnoreCase(termos[meio].getPalavra())>0){
            
            //SE PALAVRA FOR > 0 ESTARÁ A DIREITA;
            inicio = meio+1;
          }
          else{
            
            //SE PALAVRA FOR < 0 ESTARÁ A DIREITA;
            fim = meio-1;
          }
        }
      }
    }
    return "Termo não encontrado";
  }
  
	public String toString(){
		  String stringDaClass = "";
		    for (int i = 0; i < this.quantidadeTermos; i ++) {
		      stringDaClass += termos[i] + "\n";
		    }
		    return stringDaClass;
	}
	
	public Termo [] aumentaVet(Termo [] v){
    
    Termo [] newVet = new Termo [v.length+1];
    for(int i = 0; i < v.length; i++){
      newVet[i] = v[i];
    }
    return newVet;
    
  }
  
  
}

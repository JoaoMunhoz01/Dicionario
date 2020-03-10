 
public class Termo {
  private String palavra;
  private String significado;
  private String idioma;
      
      
  //CONSTRUTOR;
  public Termo(String idioma, String palavra, String significado){
    this.idioma = idioma;
    this.palavra = palavra;
    this.significado = significado;
  }
    		
    	  
  //GETTER PALAVRA;  	  
  public String getPalavra() {
		return palavra;
	}
  
  //SETTER PALAVRA;
	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}

  ////GETTER SIGNIFICADO;
	public String getSignificado() {
		return significado;
	}
  
  //SETTER SIGNIFICADO;
	public void setSignificado(String significado) {
		this.significado = significado;
	}
  //GETTER IDIOMA;
	public String getIdioma() {
		return idioma;
	}
  //SETTER IDIOMA;
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
 
  //METODO TO STRING;
  public String toString(){
    return this.idioma+ ", "+ this.palavra;
  }
  //METODO COMPARETO;
  public int compareTo(Termo t){
    	 
    if(!this.idioma.equals(t.getIdioma())){
      if(this.idioma.compareTo(t.getIdioma())>0){
    	  return 1;
    	}
    	else if(this.idioma.compareTo(t.getIdioma())<0){
    	  return -1; 		       
    	}   		    
    }
    		  
    else{
    	if(this.idioma.equals(t.getIdioma())){
    	  		  
    	  if(this.palavra.compareTo(t.getPalavra())>0){
    	  	return 1;
    	  }
    	  	    
	    	else if(this.palavra.compareTo(t.getPalavra())<0){
	    	  return -1;   	  	       
	    	}
    	}
    	  	  
	    else{
	    	return 0;
	    }
    }
  return 0;
  }
}
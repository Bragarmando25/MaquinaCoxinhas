
package maquinadecoxinhas;


public class Coxinhas{
    
    private Integer coxinhas; 
    
    
    public Coxinhas(){
        coxinhas = 0; 
    }
    
    
    public void adicionar(){
        coxinhas++;
    }
    
    
    public void retirar(){
        if (coxinhas > 0){
            coxinhas--;
        }        
    }
    
    public void zerar(){
        if (coxinhas > 0){
            coxinhas = 0;
        }
    }
    
    public void setCoxinhas(Integer coxinhas){
        this.coxinhas = coxinhas; 
    }
    
    public Integer getCoxinhas(){
        return coxinhas; 
    }
    
}
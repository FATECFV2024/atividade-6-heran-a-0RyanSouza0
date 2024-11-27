public class Mensalista extends Empregado {

    private String cargo;

    // CONSTRUTOR
    public Mensalista(String nome,String endereco,String cargo){
        super(nome, endereco);
        this.cargo=cargo;
    }
    

    public String getCargo(){
        return this.cargo;
    }

    public void setCargo(String cargo){
        this.cargo=cargo;
    }

    public void calcularSalario(){
            if(cargo.equals("Junior")){
                salario=2500;
      
            }else if(cargo.equals("Pleno")){
                salario=3500;
                
            }
            else if(cargo.equals("Senior")){
                salario=5500;
               
            }
            else{
                System.out.println("Cargo não existe");
            }
            
    }

    // METODO IMPRIMI 
    @Override
    public String toString(){
        return "MENSALISTA[Nome: "+getNome()+" Endereço: "+getEndereco()+" Salario: "+getSalario()+" ]";
        
    }



    
}

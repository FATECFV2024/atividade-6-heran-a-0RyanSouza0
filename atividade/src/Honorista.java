public class Honorista extends Empregado {
    
    private double horas;

    public Honorista(String nome, String endereco, double horas){
        super(nome, endereco);
        this.horas=horas;
    }

    public double getHoras(){
        return this.horas;
    }

    public void setHoras(double horas){
        this.horas=horas;
    }
    
    // METODO CALCULA SALARIO

    public void calculaSalario(){
        salario=horas*50;
       
    }

    // METODO IMPRIMI 
    @Override
    public String toString(){
        return "HONORISTA[Nome: "+getNome()+" Endereço Nome: "+getEndereco()+" Salario: "+getSalario()+" ]";
        
    }



}

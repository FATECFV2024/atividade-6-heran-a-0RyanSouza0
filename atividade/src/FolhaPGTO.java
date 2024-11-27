public class FolhaPGTO {
    public static void main(String[] args) throws Exception {
    
        Mensalista cara,cara2;
        cara=new Mensalista("Ryan", "Rua Antonio ", "Senior");
        cara.calcularSalario();
        cara.calcularInss();
        System.out.println(cara);

        cara2=new Mensalista("Joao", "Rua Augusta ", "Junior");
        cara2.calcularSalario();
        cara2.calcularInss();
        System.out.println(cara2);

        Honorista hora, hora2;
        hora=new Honorista("Julia", "Rua Jose", 500);
        hora.calculaSalario();
        System.out.println(hora);
        
        hora2=new Honorista("Rodrigo", "Rua Pedro", 300);
        hora2.calculaSalario();
        System.out.println(hora2);
        
    }
}

package Team2;

public class Runner {
    public static void main(String[] args) {

        Employee Simten=new Employee("simten", 15000,50,2010);

        System.out.println(Simten);

        System.out.println("Simten.name = " + Simten.name);
        System.out.println("Simten.vergiHesapla() = " + Simten.vergiHesapla());
        System.out.println("Simten.ekmesai() = " + Simten.ekmesai());
        System.out.println("Simten.maasArtışı() = " + Simten.maasArtışı());
        System.out.println("Simten.toplamMaas() = " + Simten.toplamMaas());


    }



}

package Team2;

public class Employee {

String name;
int salary;
int workHours;
int year;

    public Employee(String name, int salary, int workHours, int year) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.year = year;
    }
public double vergiHesapla(){
     double vergi=0;
        if (salary<10000){
            vergi=0;

        }else
            vergi=salary*0.03;
    return vergi;
}
public int ekmesai(){
     int ekMesaiMiktarı=0;
     int saatlikMesai=50;
        if(workHours>40){
            ekMesaiMiktarı=(workHours-40)*saatlikMesai;

        }
return ekMesaiMiktarı;
    }
public double maasArtışı(){
        int günümüz=2022;
        int calışmaSüresi=(günümüz-year);
        double artış=0;
        if(calışmaSüresi<5){

            artış=(salary+vergiHesapla())*0.05;

        }else if (calışmaSüresi<15){
            artış=(salary+vergiHesapla())*0.10;

        }else{
            artış= (salary+vergiHesapla())*0.20;
        }
        return artış;

    }

    public double toplamMaas(){
        double toplamMaas=(maasArtışı()+ekmesai()+salary);
        return toplamMaas;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", year=" + year +
                ",maaş"+toplamMaas()+
                '}';


    }
}


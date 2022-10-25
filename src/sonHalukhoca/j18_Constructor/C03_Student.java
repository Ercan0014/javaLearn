package sonHalukhoca.j18_Constructor;

public class C03_Student {

    //main olmayan sadece student obje  create etmek için pojo plan old java object
    String ad;
    String soyad;
    int sınıf;
    double ortalama;
    int okulNo;
    boolean takdir;

    public void mezuniyet(){ //method
        if(ortalama>=50){
            System.out.println("diplomanız hayırlı olsun :-)");
        }else System.out.println("kısmetse seneye mezun olursunuz :-(");
    }

    @Override
    public String toString() {
        return "C03_Student{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", sınıf=" + sınıf +
                ", ortalama=" + ortalama +
                ", okulNo=" + okulNo +
                ", takdir=" + takdir +
                '}';
    }
}

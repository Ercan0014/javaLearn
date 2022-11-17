package ATeam2;

    public class Ogrenci extends Kisi {

        private String sinif;
        private int ogrenciNo;

        @Override
        public String toString() {
            return "Ogrenci{" +
                    "sinif='" + sinif + '\'' +
                    ", ogrenciNo=" + ogrenciNo +
                    '}';
        }

        public Ogrenci(String adSoyad, String kimlikNo, int yas, String sinif, int ogrenciNo) {
            super(adSoyad, kimlikNo, yas);
            this.sinif = sinif;
            this.ogrenciNo = ogrenciNo;
        }

        public String getSinif() {
            return sinif;
        }

        public void setSinif(String sinif) {
            this.sinif = sinif;
        }

        public int getOgrenciNo() {
            return ogrenciNo;
        }

        public void setOgrenciNo(int ogrenciNo) {
            this.ogrenciNo = ogrenciNo;
        }
    }
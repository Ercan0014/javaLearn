package sonHalukhoca.j36_Map;


    public class task02Kartvizit {//pojo->obj uretecek

        String isim;
        String email;
        String adres;
        String telefon;
        int id=100;

        public task02Kartvizit(String isim, String email, String adres, String telefon) {
            this.isim = isim;
            this.email = email;
            this.adres = adres;
            this.telefon = telefon;
            this.id++;
        }

        @Override
        public String toString() {
            return
                    "isim='" + isim + '\'' +
                            ", email='" + email + '\'' +
                            ", adres='" + adres + '\'' +
                            ", telefon='" + telefon + '\'' ;
        }
    }





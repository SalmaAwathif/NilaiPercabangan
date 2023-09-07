public class KategoriNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print1n("Masukkan Nama: ");
        String nama = input.nextLine () ;
        System.out.print1n("Masukkan Nilai"+nama);
        int nilai = input.nextInt();

        String predikat = null;
        String kategori = null;
        if(nilai > 96 && nilai <= 100){
            predikat = "A";
            kategori = "sangat baik";
        }
        else if(nilai >91 && nilai <=95){
            predikat ="A-";
            kategori = "sangat baik";
    }
        else if(nilai >86 && nilai <=90){
            predikat ="B+";
            kategori = "baik";
    }
        else if(nilai >81 && nilai <=85){
            predikat ="B-";
            kategori = "baik";
    }
        else if(nilai >75 && nilai <=80){
            predikat ="B-";
            kategori = "baik";
    }
        else if(nilai >70 && nilai <=74){
            predikat ="C+";
            kategori = "cukup";
    }
        else if(nilai >65 && nilai <=69){
            predikat ="C";
            kategori = "cukup";
    }
        else if(nilai >60 && nilai <=64){
            predikat ="C-";
            kategori = "cukup";
    }
        else if(nilai >55 && nilai <=59){
            predikat ="D+";
            kategori = "kurang";
    }
        else if(nilai >0 && nilai <=54){
            predikat ="D";
            kategori = "kurang";
    }

    System.out.print1n("Nama: "+nama);
    System.out.print1n("Nilai:"+nilai);
    System.out.print1n(predikat + kategori);

}
}
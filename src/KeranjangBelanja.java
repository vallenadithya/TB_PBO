/*
Anggota Kelompok :
Sekar Rayhannisa          2011521022
Harriko Nur Harzeki       2011521024
Vallen Aditya Rekhsana    2011522017
*/

public class KeranjangBelanja extends Barang {

    private Barang[] barangs;
    private int[] jumlahBarangs;
    private int indeksBarang;

    public KeranjangBelanja(){
        barangs=new Barang[100];
        jumlahBarangs=new int[100];
        indeksBarang=0;
    }

    
    public void tambahBarang(Barang barangDibeli, int jumlahDibeli){
        barangs[indeksBarang]=barangDibeli;
        jumlahBarangs[indeksBarang]=jumlahDibeli;
        indeksBarang++;
    }

    public void hapusBarang(Barang barangDibeli){
        for(int i=0;i<indeksBarang;i++){
            if(barangs[i]==barangDibeli){
                barangs[i]=null;
                jumlahBarangs[i]=0;
            }
        }
    }

    public void hapusBarang(int indeks){
        barangs[indeks]=null;
        jumlahBarangs[indeks]=0;
    }

    public int hitungTotalBelanja(){
        int total=0;
        for(int i=0;i<indeksBarang;i++){
            if(barangs[i]!=null){
                total+=(barangs[i].getHarga()*jumlahBarangs[i]);
            }
        }
        return total;
    }

}

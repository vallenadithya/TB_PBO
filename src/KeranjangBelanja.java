import java.util.Scanner;

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

    Scanner a=new Scanner(System.in);

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

    public void showMenu(){
        System.out.println("---------- MENU ----------");
        System.out.println("1. Tambah Barang");
        System.out.println("2. Cari Barang");
        System.out.println("3. Transaksi Pembelian");
        System.out.println("4. Transaksi Penjualan");
        System.out.println("5. Memeber");
        System.out.println("6. Laporan");
        System.out.println("--------------------------\n");
        System.out.println("Masukkan Pilihan Anda : "); 
        int input =a.nextInt();
        if(input==1){tambahBarang(null, input);} else
        if(input==2){cariBarang();}else 
        if(input==3){transaksiPembelian();} else 
        if(input==4){transaksiPenjualan();} else 
        if(input==5){member();}else 
        if(input==6){laporan();}else System.err.println("Input salah!");
    }

}

/*
Anggota Kelompok :
Sekar Rayhannisa          2011521022
Harriko Nur Harzeki       2011521024
Vallen Aditya Rekhsana    2011522017
*/

public class Barang implements TokoABC{
    private String nama, kode;
    private int modal, harga;
    public int stok;

    public Barang(String nama,String kode,int modal, int harga, int stok){
        this.nama=nama; this.kode=kode; this.modal=modal; this.harga=harga; this.stok=stok;
    }

    public Barang(){
        nama="-";
        kode="-";
    }

    public Barang(String nama, String kode){
        this.nama=nama;
        this.kode=kode;
    }

    public String getNama(){
        return nama;
    }

    public String getKode(){
        return kode;
    }

    public void setNama(String namaBaru){
        nama=namaBaru;
    }

    public void setKode(String kodeBaru){
        kode=kodeBaru;
    }

    public int getHarga(){
        return harga;
    }

    public void setHarga(int hargaBaru){
        if(modal<harga){
            harga=hargaBaru;
        }
    }

    public int getModal(){
        return modal;
    }

    public void setModal(int modalBaru){
        modal=modalBaru;
    }

    public void restok(int tambahan){
        stok=stok+tambahan;
    }

    public void showDetail(){
        System.out.println("Nama Barang : " + nama);
        System.out.println("Kode Barang : " + kode);
        System.out.println("Harga Beli  : " + modal);
        System.out.println("Harga Jual  : " + harga);
        System.out.println("Stok        : " + stok);
    }

    
    @Override
    public void cariBarang() {
        
        
    }

    @Override
    public void transaksiPembelian() {
        

    }

    @Override
    public void transaksiPenjualan() {
        

    }

    @Override
    public void member() {
        
        
    }

    @Override
    public void laporan() {
        
        
    }

}

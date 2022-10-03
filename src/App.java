public class App {
    public static void main(String[] args) throws Exception {
        Barang barang01=new Barang(
            "indomie",
            "b001",
            2500,
            3000,
            5
        );

        Barang barang02=new Barang(
            "Pensil",
            "b002",
            2000,
            3000,
            10
        );

        KeranjangBelanja kb=new KeranjangBelanja();

        kb.tambahBarang(barang01,5);
        kb.tambahBarang(barang02,3);

        int total=kb.hitungTotalBelanja();
        System.out.println(total);

    }
}

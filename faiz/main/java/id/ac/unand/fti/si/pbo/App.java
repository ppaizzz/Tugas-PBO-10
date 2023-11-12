package id.ac.unand.fti.si.pbo;

public class App {

    public static void main(String[] args) {
        // Membuat objek MemberGold dengan nama Faiz
        Member memberFaiz = new MemberGold();
        ((MemberGold) memberFaiz).saldo = 500000;  // Memberi nilai saldo untuk member Gold

        // Simulasikan pembelian oleh Faiz
        int totalBelanjaFaiz = 800000;
        int hargaSouvenirFaiz = 50000;
        double jarakTujuanFaiz = 9.5;

        // Output untuk pembelian oleh member Gold dengan nama Faiz
        System.out.println("member dengan nama Faiz:");

        // Menampilkan tipe member dan poin awal
        System.out.println("Member Type: " + memberFaiz.getClass().getSimpleName());
        System.out.println("Initial Poin: " + memberFaiz.getPoin());

        // Menampilkan saldo awal untuk member Gold
        System.out.println("Saldo Awal: " + ((MemberGold) memberFaiz).saldo);

        // Menghitung total pembayaran setelah diskon untuk member Gold
        int totalBayarFaiz = memberFaiz.hitungTotalBayar(totalBelanjaFaiz);
        System.out.println("Total Pembayaran setelah Diskon untuk " + memberFaiz.getClass().getSimpleName() + ": " + totalBayarFaiz);

        // Menukarkan poin untuk Faiz
        memberFaiz.redeemPoin(hargaSouvenirFaiz);
        System.out.println("Poin " + memberFaiz.getClass().getSimpleName() + " setelah ditukarkan: " + memberFaiz.getPoin());

        // Memeriksa apakah member dapat meminta pengiriman
        if (memberFaiz instanceof CanRequestDelivery) {
            double ongkirFaiz = ((CanRequestDelivery) memberFaiz).hitungOngkir(jarakTujuanFaiz);
            System.out.println("Biaya Pengiriman untuk " + memberFaiz.getClass().getSimpleName() + ": " + ongkirFaiz);
        }
    }
}

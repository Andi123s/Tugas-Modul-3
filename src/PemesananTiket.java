import java.util.Scanner;
import java.text.DecimalFormat;
//editing git
/**
 * Class PemesananTiket digunakan untuk mengelola pemesanan tiket film, termasuk menghitung total biaya
 * dan mencetak struk pemesanan.
 */
public class PemesananTiket {

    /**
     * Nama film yang dipesan.
     */
    private String namaFilm;

    /**
     * Jumlah tiket yang dipesan.
     */
    private int jumlahTiket;

    /**
     * Harga per tiket.
     */
    private double hargaTiket;


    /**
     * Total biaya yang harus dibayar, hasil dari jumlah tiket dikalikan harga per tiket.
     */
    private double totalBayar;

    /**
     * Constructor untuk inisialisasi objek PemesananTiket.
     *
     * @param namaFilm   nama film yang dipesan
     * @param jumlahTiket jumlah tiket yang dipesan
     * @param hargaTiket harga per tiket
     */
    public PemesananTiket(String namaFilm, int jumlahTiket, double hargaTiket) {
        this.namaFilm = namaFilm;
        this.jumlahTiket = jumlahTiket;
        this.hargaTiket = hargaTiket;
        this.totalBayar = hitungTotalBayar();  // menghitung total bayar saat inisialisasi
    }

    /**
     * Format uang untuk menampilkan harga tiket dan total bayar dalam format Rupiah yang rapi.
     */
    private static final DecimalFormat formatUang = new DecimalFormat("Rp #,###.00");

    /**
     * Menghitung total biaya pemesanan tiket berdasarkan jumlah tiket dan harga tiket.
     *
     * @return total biaya yang harus dibayar
     */
    private double hitungTotalBayar() {
        return jumlahTiket * hargaTiket;
    }

    /**
     * Menghasilkan struk pemesanan dalam bentuk String yang mencakup nama film, jumlah tiket,
     * harga per tiket, dan total bayar.
     *
     * @return String yang berisi detail struk pemesanan
     */
    public String getStruk() {
        return "Film: " + namaFilm +
                "\nJumlah Tiket: " + jumlahTiket +
                "\nHarga per Tiket: " + formatUang.format(hargaTiket) +
                "\nTotal Bayar: " + formatUang.format(totalBayar);
    }

    /**
     * Mencetak struk pemesanan ke konsol.
     *
     * @param pemesanan objek PemesananTiket yang akan dicetak struknya
     */
    public static void cetakStruk(PemesananTiket pemesanan) {
        System.out.println(pemesanan.getStruk());
    }

    /**
     * Metode utama untuk menjalankan program. Meminta pengguna memasukkan informasi pemesanan,
     * membuat objek PemesananTiket, dan mencetak struk pemesanan.
     *
     * @param args argumen baris perintah (tidak digunakan dalam program ini)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input pengguna untuk pemesanan tiket
        System.out.println("Masukkan nama film:");
        String film = scanner.nextLine();

        System.out.println("Masukkan jumlah tiket:");
        int jumlah = scanner.nextInt();

        System.out.println("Masukkan harga tiket:");
        double harga = scanner.nextDouble();

        // Membuat objek PemesananTiket dengan data yang dimasukkan pengguna
        PemesananTiket pemesanan = new PemesananTiket(film, jumlah, harga);

        // Mencetak struk pemesanan
        cetakStruk(pemesanan);
    }
}

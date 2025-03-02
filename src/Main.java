import java.util.*;

public class Main {
    static Scanner scan = new Scanner(System.in);

    /**
     * tambahResepAwal
     * Berfungsi untuk menambahkan tambah resep di awal
     * @param listResep
     */
    public static void tambahResepAwal(SinglyLinkedList<Resep> listResep) {
        System.out.println("Memasukan Resep ke dalam Awal Daftar : ");

        // Meminta data yang dibutuhkan ke user (nama resep, bahan utama, waktu memasak)
        System.out.print("Nama Resep : ");
        String nama = scan.nextLine();
        System.out.print("Bahan Utama : ");
        String bahanUtama = scan.nextLine();
        System.out.print("Waktu Memasak (dalam Menit) : ");
        int waktuMemasak = scan.nextInt();

        // Insert resep kedalam daftar paling awal dari hasil data yang diminta
        Resep newResep = new Resep(nama, bahanUtama, waktuMemasak);
        listResep.insertAtFront(newResep);

        // Cetak bahwa resep berhasil didaftar
        System.out.println("Resep berhasil ditambah di awal");
        System.out.println(newResep);
    }

    /**
     * tambahResepAkhir
     * Berfungsi untuk menambahkan tambah resep di akhir
     * @param listResep
     */
    public static void tambahResepAkhir(SinglyLinkedList<Resep> listResep) {
        System.out.println("Memasukan Resep ke dalam Akhir : ");

        // Meminta data yang dibutuhkan ke user (nama resep, bahan utama, waktu memasak)
        System.out.print("Nama Resep : ");
        String nama = scan.nextLine();
        System.out.print("Bahan Utama : ");
        String bahanUtama = scan.nextLine();
        System.out.print("Waktu Memasak (dalam Menit) : ");
        int waktuMemasak = scan.nextInt();

        // Insert resep kedalam daftar paling awal dari hasil data yang diminta
        Resep newResep = new Resep(nama, bahanUtama, waktuMemasak);
        listResep.insertAtBack(newResep);

        // Cetak bahwa resep berhasil didaftar
        System.out.println("Resep berhasil ditambah di akhir");
        System.out.println(newResep);
    }

    /**
     * hapusResepAwal
     * Berfungsi untuk menghapus resep di awal
     * @param listResep
     */
    public static void hapusResepAwal(SinglyLinkedList<Resep> listResep) {
        // Hapus resep di awal
        listResep.removeFromStart();

        // Cetak bahwa resep berhasil dihapus
        System.out.println("Resep berhasil dihapus di awal");
    }

    /**
     * hapusResepAkhir
     * Berfungsi untuk menghapus resep di akhir
     * @param listResep
     */
    public static void hapusResepAkhir(SinglyLinkedList<Resep> listResep) {
        // Hapus resep di akhir
        listResep.removeFromBack();

        // Cetak bahwa resep berhasil dihapus
        System.out.println("Resep berhasil dihapus di akhir");
    }

    /**
     * cetakResep
     * Berfungsi untuk mencetak keseluruhan resep yang terdaftar
     * @param listResep
     */
    public static void cetakResep(SinglyLinkedList<Resep> listResep) {
        // Cetak semua resep yang terdaftar
        listResep.print();
    }

    /**
     * cariResep
     * Berfungsi untuk melakukan pencarian resep yang terdaftar berdasarkan nama resep
     * @param listResep
     */
    public static void cariResep(SinglyLinkedList<Resep> listResep) {
        System.out.println("Pencarian Resep (Berdasarkan nama resep) : ");

        // Meminta data yang dibutuhkan ke user (nama resep)
        System.out.print("Nama Resep : ");
        String namaResep = scan.nextLine();

        // Eksekusi perintah pencarian resep dalam listResep
        Resep getResep = listResep.pencarianResep(namaResep);

        // Pengecekan jika resep ditemukan atau tidak
        if (getResep != null) {
            System.out.println("Resep ditemukan");
            System.out.println(getResep);
        } else {
            System.out.println("Resep tidak ditemukan");
        }
    }

    /**
     * menu
     * Berfungsi untuk menampilkan dan handler menu yang akan mengloop jika pilihan akhirnya ditentukan
     * @param listResep
     */
    public static void menu(SinglyLinkedList<Resep> listResep) {
        System.out.println("Menu Resep : ");
        System.out.println("1. Tambah Resep Awal \n" +
                "2. Tambah Resep Akhir \n" +
                "3. Hapus Resep Awal \n" +
                "4. Hapus Resep Akhir \n" +
                "5. Cetak Resep \n" +
                "6. Cari Resep \n" +
                "7. Keluar \n");

        // Ambil pilihan user
        System.out.print("Pilihan : ");
        int pilihan = scan.nextInt();
        scan.nextLine();

        // Cek pilihan user
        switch (pilihan) {
            case 1:
                // Eksekusi perintah tambahResepAwal
                tambahResepAwal(listResep);
                break;
            case 2:
                // Eksekusi perintah tambahResepAkhir
                tambahResepAkhir(listResep);
                break;
            case 3:
                // Eksekusi perintah hapsuResepAwal
                hapusResepAwal(listResep);
                break;
            case 4:
                // Eksekusi perintah hapusResepAkhir
                hapusResepAkhir(listResep);
                break;
            case 5:
                // Eksekusi perintah cetakResep
                cetakResep(listResep);
                break;
            case 6:
                // Eksekusi perintah cariResep
                cariResep(listResep);
                break;
            case 7:
                System.exit(0); // Keluar dari aplikasi jika user memilih 5
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }

        // Mengulang menu ketika user sudah melakukan pilihan terakhir
        System.out.println();
        menu(listResep);
    }

    public static void main(String[] args) {
        SinglyLinkedList<Resep> listResep = new SinglyLinkedList<>();

        // Jalankan menu
        menu(listResep);
    }
}
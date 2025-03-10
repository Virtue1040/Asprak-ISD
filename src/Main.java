import java.util.*;

public class Main {
    private static LinkedList<Buku> listBuku = new LinkedList<>();

    /**
     * Berfungsi untuk menambahkan ke LinkedList awal
     * @param isbn
     * @param judul
     * @param kategori
     * @param hargaPinjam
     * @param status
     */
    private static void addFirstBuku(int isbn, String judul, String kategori, int hargaPinjam, String status) {
        Buku buku = new Buku(isbn, judul, kategori, hargaPinjam, status);
        listBuku.addFirst(buku);
    }

    /**
     * Berfungsi untuk menambahkan ke LinkedList terakhir
     * @param isbn
     * @param judul
     * @param kategori
     * @param hargaPinjam
     * @param status
     */
    private static void addLastBuku(int isbn, String judul, String kategori, int hargaPinjam, String status) {
        Buku buku = new Buku(isbn, judul, kategori, hargaPinjam, status);
        listBuku.addLast(buku);
    }

    /**
     * Berfungsi untuk menghapus buku berdasarkan isbn
     * @param isbn
     */
    private static void hapusBuku(int isbn) {
        if (listBuku.isEmpty()) {
            return;
        }

        ListIterator<Buku> iterator = listBuku.listIterator();
        while (iterator.hasNext()) {
            Buku buku = iterator.next();
            if (buku.getIsbn() == isbn) {
                iterator.remove();
                break;
            }
        }
    }

    /**
     * Berfungsi untuk mencetak isi listBuku dari depan dan belakang
     */
    private static void print() {
        System.out.println("print buku dari depan : ");
        if (listBuku.isEmpty()) {
            return;
        }

        ListIterator<Buku> iterator = listBuku.listIterator();
        while (iterator.hasNext()) {
            Buku buku = iterator.next();
            System.out.println(buku);
        }

        System.out.println("print buku dari belakang : ");
        while (iterator.hasPrevious()) {
            Buku buku = iterator.previous();
            System.out.println(buku);
        }
        System.out.println();
    }

    /**
     * Berfungsi untuk mengedit buku berdasarkan isbn, dan akan mengubah informasi umum seperti
     * judul, kategori, hargaPinjam, dan status
     * @param isbn
     * @param judul
     * @param kategori
     * @param hargaPinjam
     * @param status
     */
    private static void editBuku(int isbn, String judul, String kategori, int hargaPinjam, String status) {
        if (listBuku.isEmpty()) {
            return;
        }

        ListIterator<Buku> iterator = listBuku.listIterator();
        while (iterator.hasNext()) {
            Buku buku = iterator.next();
            if (buku.getIsbn() == isbn) {
                buku.setJudul(judul);
                buku.setKategori(kategori);
                buku.setHargaPinjam(hargaPinjam);
                buku.setStatus(status);
            }
        }
    }

    public static void main(String[] args) {
        // Nambah 5 data buku awal //

        // 2 Add First
        addFirstBuku(10, "Indonesia", "Sejarah", 10000, "Tersedia");
        addFirstBuku(12, "German", "Sejarah", 10000, "Tersedia");

        addLastBuku(15, "Russia", "Sejarah", 10000, "Tersedia");
        addLastBuku(18, "Inggris", "Sejarah", 10000, "Tersedia");
        addLastBuku(20, "Irsale", "Sejarah", 10000, "Tersedia");

        // Delete berdasarkan ISBN
        hapusBuku(12);

        // Print dapat menampilkan list dari depan dan belakang
        print();

        // Edit 2 data terakhir dari list
        editBuku(20, "Irsale", "Sejarah", 10000, "Terpinjam");
        editBuku(18, "Eropa", "Sejarah", 10000, "Terpinjam");

        print();
    }
}
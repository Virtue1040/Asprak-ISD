import java.util.*;

public class Main {
    private static LinkedList<Buku> listBuku = new LinkedList<>();

    private static void addFirstBuku(int isbn, String judul, String kategori, int hargaPinjam, String status) {
        Buku buku = new Buku(isbn, judul, kategori, hargaPinjam, status);
        listBuku.addFirst(buku);
    }

    private static void addLastBuku(int isbn, String judul, String kategori, int hargaPinjam, String status) {
        Buku buku = new Buku(isbn, judul, kategori, hargaPinjam, status);
        listBuku.addLast(buku);
    }

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
        addFirstBuku(10, "Indonesia", "Sejarah", 10000, "Tersedia");
        addFirstBuku(12, "German", "Sejarah", 10000, "Tersedia");
        addLastBuku(15, "Russia", "Sejarah", 10000, "Tersedia");
        addLastBuku(18, "Inggris", "Sejarah", 10000, "Tersedia");
        addLastBuku(20, "Irsale", "Sejarah", 10000, "Tersedia");

        hapusBuku(12);

        print();

        editBuku(20, "Irsale", "Sejarah", 10000, "Terpinjam");
        editBuku(18, "Eropa", "Sejarah", 10000, "Terpinjam");

        print();
    }
}
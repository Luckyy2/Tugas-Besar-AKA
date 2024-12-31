import java.util.Scanner;

public class IterativeMaxStock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Daftar jenis buku
        String[] jenisBuku = {"Fiksi", "Non-Fiksi", "Komik", "Ensiklopedia", "Biografi"};

        // Input stok buku
        int[] stokBuku = new int[jenisBuku.length];
        System.out.println("Masukkan stok untuk masing-masing jenis buku:");
        for (int i = 0; i < stokBuku.length; i++) {
            System.out.print(jenisBuku[i] + ": ");
            stokBuku[i] = scanner.nextInt();
        }

        // Mulai menghitung waktu eksekusi
        long startTime = System.nanoTime();

        // Mencari stok terbanyak
        int maxIndex = 0; // Indeks untuk stok maksimum
        for (int i = 1; i < stokBuku.length; i++) {
            if (stokBuku[i] > stokBuku[maxIndex]) {
                maxIndex = i;
            }
        }

        // Menghentikan penghitungan waktu eksekusi
        long endTime = System.nanoTime();

        // Menampilkan hasil
        System.out.println("Jenis buku dengan stok terbanyak: " + jenisBuku[maxIndex]);
        System.out.println("Jumlah stok: " + stokBuku[maxIndex]);

        // Menghitung dan menampilkan waktu eksekusi
        long executionTime = endTime - startTime;
        System.out.println("Waktu eksekusi (dalam nanodetik): " + executionTime + " ns");
        System.out.println("Waktu eksekusi (dalam milidetik): " + (executionTime / 1_000_000.0) + " ms");

        scanner.close();
    }
}
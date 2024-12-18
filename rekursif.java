import java.util.Scanner;

public class RecursiveMaxStock {
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

        // Mencari stok terbanyak dengan rekursi
        int maxIndex = findMaxIndex(stokBuku, 0, 0);

        // Menampilkan hasil
        System.out.println("Jenis buku dengan stok terbanyak: " + jenisBuku[maxIndex]);
        System.out.println("Jumlah stok: " + stokBuku[maxIndex]);

        scanner.close();
    }

    // Fungsi rekursif untuk menemukan indeks stok maksimum
    public static int findMaxIndex(int[] stokBuku, int currentIndex, int maxIndex) {
        if (currentIndex == stokBuku.length) {
            return maxIndex;
        }
        if (stokBuku[currentIndex] > stokBuku[maxIndex]) {
            maxIndex = currentIndex;
        }
        return findMaxIndex(stokBuku, currentIndex + 1, maxIndex);
    }
}

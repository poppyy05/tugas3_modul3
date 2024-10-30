import java.util.Scanner;

/**
 * Program GradeConverterAfterRefactoring ini mengonversi nilai numerik
 * menjadi nilai huruf berdasarkan skala tertentu.
 * Skala konversi:
 * 90-100 = A
 * 80-89  = B
 * 70-79  = C
 * 60-69  = D
 * < 60   = F
 */
public class GradeConverterAfterRefactoring {

    /**
     * Memeriksa apakah nilai yang dimasukkan valid (0 - 100).
     *
     * @param grade nilai yang dimasukkan untuk divalidasi
     * @return true jika nilai berada dalam rentang 0 hingga 100, false jika sebaliknya
     */
    public static boolean isValidGrade(int grade) {
        return grade >= 0 && grade <= 100;
    }

    /**
     * Mengonversi nilai numerik menjadi nilai huruf.
     *
     * @param grade nilai numerik yang akan dikonversi
     * @return nilai huruf (A, B, C, D, atau F) berdasarkan skala nilai
     */
    public static String convertToLetterGrade(int grade) {
        switch (grade / 10) {
            case 10:
            case 9: return "A";
            case 8: return "B";
            case 7: return "C";
            case 6: return "D";
            default: return "F";
        }
    }

    /**
     * Metode utama untuk menerima input pengguna, memvalidasi, dan
     * mengonversi nilai ke nilai huruf, serta mencetak hasilnya.
     *
     * @param args argumen baris perintah (tidak digunakan dalam program ini)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai (0 - 100): ");
        int nilai = scanner.nextInt();

        // Validasi nilai dan konversi jika valid
        if (isValidGrade(nilai)) {
            String nilaiHuruf = convertToLetterGrade(nilai);
            System.out.println("Nilai huruf: " + nilaiHuruf);
        } else {
            System.out.println("Nilai tidak valid.");
        }

        scanner.close();
    }
}

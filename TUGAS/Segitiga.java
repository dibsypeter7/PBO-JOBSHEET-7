package TUGAS;

public class Segitiga {

    private int sudut;

    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        return sudut;
    }

    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        return Math.sqrt(sisiA * sisiA + sisiB * sisiB);
    }

    public static void main(String[] args) {

        Segitiga s = new Segitiga();

        System.out.println("Sisa sudut (60) : " + s.totalSudut(60));

        System.out.println("Sudut ketiga (60, 50) : "
                + s.totalSudut(60, 50));

        System.out.println("Keliling (3,4,5) : "
                + s.keliling(3, 4, 5));

        System.out.println("Sisi miring (3,4) : "
                + s.keliling(3, 4));
    }
}
package TUGAS;

public class Demo {

    public static void main(String[] args) {

        Manusia manusia = new Manusia();
        Manusia dosen = new Dosen();
        Manusia mahasiswa = new Mahasiswa();

        manusia.bernafas();
        manusia.makan();

        dosen.bernafas();
        dosen.makan();

        mahasiswa.bernafas();
        mahasiswa.makan();

        ((Dosen) dosen).lembur();
        ((Mahasiswa) mahasiswa).tidur();
    }
}
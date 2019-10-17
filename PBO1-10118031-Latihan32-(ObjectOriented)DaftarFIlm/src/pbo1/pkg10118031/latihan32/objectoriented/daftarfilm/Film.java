package pbo1.pkg10118031.latihan32.objectoriented.daftarfilm;

/**
 *
 * @author Vendetta 
 * NAMA : RIZKI ARIA PUTRA 
 * KELAS : PBO1 
 * NIM : 10118031
 * Deskripsi Program : Program ini berisi program untuk menampilkan Daftar Film
 */
public class Film {

    public String filmName;
    public String filmGenre;
    public double filmRating;
    public int filmDuration;

    public void nowPlaying(String parJudul, String parGenre, double parRating, int parDuration) {
        System.out.println("Judul Film  : " + parJudul);
        System.out.println("Genre Film  : " + parGenre);
        System.out.println("Rating Film : " + parRating);
        System.out.println("Duration Film : " + parDuration + " menit\n");
    }
}

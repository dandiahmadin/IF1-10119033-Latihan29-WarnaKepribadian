/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119033.latihan29.warnakepribadian;
import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi menentukan kepribadian dengan memilih warna
 */
public class IF110119033Latihan29WarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static String
            resetWarna = "\033[0m",
            // warna huruf
            hurufMerah = "\033[0;31m",
            hurufHijau = "\033[0;32m",
            hurufKuning = "\033[0;33m",
            hurufBiru = "\033[0;34m",
            hurufUngu = "\033[0;35m",
            hurufCyan = "\033[0;36m",
            hurufPutih = "\033[1;37m",
            // warna background
            bgMerah = "\033[0;41m",
            bgHijau = "\033[0;42m",
            bgKuning = "\033[0;43m",
            bgBiru = "\033[0;44m",
            bgUngu = "\033[0;45m",
            
            pilihWarna,
            nama,
            
            // kepribadian
            kepribadianMerah =
            "1. Periang,\n"
                .concat("2. Pemberani,\n")
                .concat("3. Berani mengambil risiko dalam setiap langkah,\n")
                .concat("4. Menyukai tantangan,\n")
                .concat("5. Kurang sabar,\n")
                .concat("6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol,\n")
                .concat("7. Memiliki energi kehangatan dan cinta."),
            
            kepribadianHijau = 
            "1. Romantis,\n"
                .concat("2. Menyukai hal yang berbau alami dan keindahan,\n")
                .concat("3. Teguh pada prinsip,\n")
                .concat("4. Menginginkan kesempurnaan,\n")
                .concat("5. Mudah cemburu,\n")
                .concat("6. Mudah merasa iri,\n")
                .concat("7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan."),
            
            kepribadianKuning = 
            "1. Optimis,\n"
                .concat("2. Suka bergaul,\n")
                .concat("3. Periang,\n")
                .concat("4. Senang menolong,\n")
                .concat("5. Lincah dan aktif,\n")
                .concat("6. Tidak suka meremehkan kekurangan orang lain,\n")
                .concat("7. Loyal,\n")
                .concat("8. Hangat,\n")
                .concat("9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil,\n")
                .concat("10. Cenderung penakut."),
           
            kepribadianBiru = 
            "1. Menyenangkan,\n"
                .concat("2. Bijaksana,\n")
                .concat("3. Pembawaan diri tenang saat menghadapi masalah,\n")
                .concat("4. Dinasmis,\n")
                .concat("5. Senang berbagi,\n")
                .concat("6. Bersahabat,\n")
                .concat("7. Tidak terlalu suka menjadi sorotan banyak orang,\n")
                .concat("8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai."),
            
            kepribadianUngu = 
            "1. Optimis,\n"
                .concat("2. Tidak pernah ragu,\n")
                .concat("3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,\n")
                .concat("4. Memiliki ambisi yang benar,\n")
                .concat("5. Memiliki empati yang besar,\n")
                .concat("6. Memiliki sisi misterius sebab seringkali menutupi perasaannya,\n")
                .concat("7. Terkadang bersikap keras kepala dan angkuh.");
    
    static Scanner scanner = new Scanner (System.in);
            
    
    
    static void  masukkanWarna() {
        
        System.out.println(
                hurufMerah.concat("YUK ")
                .concat(hurufHijau).concat("CEK ")
                .concat(hurufKuning).concat("KEPRIBADIANMU ")
                .concat(hurufCyan).concat("DARI ")
                .concat(hurufUngu).concat("WARNA ")
                .concat(hurufBiru).concat("FAVORITMU \n")
        );
       
        System.out.println(
                bgMerah.concat(hurufPutih).concat("\tMERAH\t\t\n")
                .concat(bgHijau).concat(hurufPutih).concat("\tHIJAU\t\t\n")
                .concat(bgKuning).concat(hurufPutih).concat("\tKUNING\t\t\n")
                .concat(bgBiru).concat(hurufPutih).concat("\tBIRU\t\t\n")
                .concat(bgUngu).concat(hurufPutih).concat("\tUNGU\t\t\n")
        );
        System.out.print(resetWarna.concat("PILIH WARNA FAVORITMU : "));
        pilihWarna = scanner.next();
        System.out.print("NAMA KAMU : ");
        nama = scanner.next();
    }
    
    static String menentukanKepribadian(String paramWarna) {
        String favorit = "Warna Favoritmu adalah ";
        switch (paramWarna.toUpperCase()) {
            case "MERAH" : 
                favorit += hurufMerah.concat(paramWarna.toUpperCase() + "\n")
                        .concat(kepribadianMerah);
                break;
            case "HIJAU" : 
                favorit += hurufHijau.concat(paramWarna.toUpperCase() + "\n")
                        .concat(kepribadianHijau);
                break;
            case "KUNING" : 
                favorit += hurufKuning.concat(paramWarna.toUpperCase() + "\n")
                        .concat(kepribadianKuning);
                break;
            case "BIRU" : 
                favorit += hurufBiru.concat(paramWarna.toUpperCase() + "\n")
                        .concat(kepribadianBiru);
                break;
            case "UNGU" : 
                favorit += hurufUngu.concat(paramWarna.toUpperCase() + "\n")
                        .concat(kepribadianUngu);
                break;
            default: 
                favorit = "Oops.. Belum teridentifikasi";
                break;
        }
        
        return favorit;
    }
    
    static void tampilKepribadian() {
        System.out.println("\n===HASIL TEST KEPRIBADIAN ".concat(nama).concat("==="));
        System.out.println(menentukanKepribadian(pilihWarna));
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        masukkanWarna();
        tampilKepribadian();
    }
    
}

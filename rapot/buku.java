package rapot;

import java.util.Scanner;

public class buku extends kertas {

    @Override
    public void oke() {

        double bin[] = new double[5];
        double mat[] = new double[5];
        double ipa[] = new double[5];
        double bing[] = new double[5];
        double rpl[] = new double[5];
        double rata[] = new double[5];
        String Predikatbahasa = null;
        String Predikatmat = null;
        String Predikatbing = null;
        String Predikatipa = null;
        String Predikatrpl = null;
        String hasil;
        String nama[] = new String[5];
        int pilihan;
        boolean ulang = true;

        Scanner itulah = new Scanner(System.in);

        System.out.println("");

        while (ulang) {
            System.out.println("====================================");
            System.out.println("=              M E N U             =");
            System.out.println("------------------------------------");
            System.out.println("= 1.       INPUT NAMA SISWA        =");
            System.out.println("= 2.       INPUT NILAI SISWA       =");
            System.out.println("= 3.          HASIL AKHIR          =");
            System.out.println("= 4.            KELUAR             =");
            System.out.println("====================================");
            System.out.print("Pilihan: ");
            pilihan = itulah.nextInt();

            switch (pilihan) {
                case 1:
                        System.out.println("///////////////////////////////////////////////");
                        System.out.println("|              INPUT NAMA SISWA               |");
                        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
                        for (int a = 1; a < 5; a++) {
                        System.out.print("* Masukkan Nama Siswa: ");
                        nama[a] = itulah.next();
                        System.out.println("");
                    }
                    break;
                case 2:
                    for (int a = 1; a < 5; a++) {
                        System.out.println("***********************************************");
                        System.out.println("*              INPUT NILAI SISWA              *");
                        System.out.println("***********************************************");
                        System.out.print("* Masukkan Nilai Bahasa Indonesia: ");
                        bin[a] = itulah.nextDouble();
                        System.out.print("* Masukkan Nilai Matematika: ");
                        mat[a] = itulah.nextDouble();
                        System.out.print("* Masukkan Nilai Bahasa Inggris: ");
                        bing[a] = itulah.nextDouble();
                        System.out.print("* Masukkan Nilai IPA: ");
                        ipa[a] = itulah.nextDouble();
                        System.out.print("* Masukkan Nilai RPL: ");
                        rpl[a] = itulah.nextDouble();
                        System.out.println("************************************************");
                        //Bahasa Indonesia
                        if (bin[a] >= 92 && bin[a] <= 100) {
                            Predikatbahasa = "A";
                        } else if (bin[a] >= 84 && bin[a] <= 91) {
                            Predikatbahasa = "B";
                        } else if (bin[a] >= 75 && bin[a] <= 83) {
                            Predikatbahasa = "C";
                        } else if (bin[a] < 75 && bin[a] >= 0) {
                            Predikatbahasa = "D";
                        } else {
                            System.out.println("Nilai Yang Anda Masukkan Salah");
                        }
                        //Matematika
                        if (mat[a] >= 92 && mat[a] <= 100) {
                            Predikatmat = "A";
                        } else if (mat[a] >= 84 && mat[a] <= 91) {
                            Predikatmat = "B";
                        } else if (mat[a] >= 75 && mat[a] <= 83) {
                            Predikatmat = "C";
                        } else if (mat[a] < 75 && mat[a] >= 0) {
                            Predikatmat = "D";
                        } else {
                            System.out.println("Nilai Yang Anda Masukkan Salah");
                        }
                        //Bahasa Inggris
                        if (bing[a] >= 92 && bing[a] <= 100) {
                            Predikatbing = "A";
                        } else if (bing[a] >= 84 && bing[a] <= 91) {
                            Predikatbing = "B";
                        } else if (bing[a] >= 75 && bing[a] <= 83) {
                            Predikatbing = "C";
                        } else if (bing[a] < 75 && bing[a] >= 0) {
                            Predikatbing = "D";
                        } else {
                            System.out.println("Nilai Yang Anda Masukkan Salah");
                        }
                        //IPA
                        if (ipa[a] >= 92 && ipa[a] <= 100) {
                            Predikatipa = "A";
                        } else if (ipa[a] >= 84 && ipa[a] <= 91) {
                            Predikatipa = "B";
                        } else if (ipa[a] >= 75 && ipa[a] <= 83) {
                            Predikatipa = "C";
                        } else if (ipa[a] < 75 && ipa[a] >= 0) {
                            Predikatipa = "D";
                        } else {
                            System.out.println("Nilai Yang Anda Masukkan Salah");
                        }
                        //RPL
                        if (rpl[a] >= 92 && rpl[a] <= 100) {
                            Predikatrpl = "A";
                        } else if (rpl[a] >= 84 && rpl[a] <= 91) {
                            Predikatrpl = "B";
                        } else if (rpl[a] >= 75 && rpl[a] <= 83) {
                            Predikatrpl = "C";
                        } else if (rpl[a] < 75 && rpl[a] >= 0) {
                            Predikatrpl = "D";
                        } else {
                            System.out.println("Nilai Yang Anda Masukkan Salah");
                        }
                        //Rata-Rata
                        rata[a] = (bin[a] + mat[a] + bing[a] + ipa[a] + rpl[a]) / 5;
                        if (rata[a] >= 75) {
                            hasil = "LULUS dan NAIK KELAS";
                        } else {
                            hasil = "TIDAK LULUS dan TINGGAL KELAS";
                        }
                        System.out.println("========================================");
                    }
                    break;
                case 3:
                    for (int a = 1; a < 5; a++) {
                        System.out.println("");
                        System.out.println("                     N I L A I  R A P O R T  K E L A S  10                                                 ");
                        System.out.println("");
                        System.out.println("Nama :"+nama[a]);
                        System.out.println("");
                        System.out.println(" ^---------------------------------^");
                        System.out.println(" |   B. Indonesia   |   Predikat   |   ");
                        System.out.println(" *---------------------------------*");
                        System.out.println(" |        " + bin[a] + "       |     " + Predikatbahasa + "     |  ");
                        System.out.println(" *---------------------------------*");
                        System.out.println(" |    Matematika    |   Predikat   |   ");
                        System.out.println(" *---------------------------------*");
                        System.out.println(" |        " + mat[a] + "       |     " + Predikatmat + "     |  ");
                        System.out.println(" *---------------------------------*");
                        System.out.println(" |    B. Inggris    |   Predikat   |   ");
                        System.out.println(" *---------------------------------*");
                        System.out.println(" |        " + bing[a] + "       |     " + Predikatbing + "     |  ");
                        System.out.println(" *---------------------------------*");
                        System.out.println(" |        IPA       |   Predikat   |   ");
                        System.out.println(" *---------------------------------*");
                        System.out.println(" |        " + ipa[a] + "       |     " + Predikatipa + "     |  ");
                        System.out.println(" *---------------------------------*");
                        System.out.println(" |        RPL       |   Predikat   |   "); 
                        System.out.println(" *---------------------------------*");
                        System.out.println(" |        " + rpl[a] + "       |     " + Predikatrpl + "     |  ");
                        System.out.println(" *---------------------------------*");
                        System.out.println(" |                                 |");
                        System.out.println(" *---------------------------------*");
                        System.out.println("               RATA-RATA                ");
                        System.out.println(" *---------------------------------*");
                        System.out.println(" |                " + rata[a] +"              |  " );
                        System.out.println(" ");
                        System.out.println(" ^---------------------------------^");
                        
                    }
                    break;
                case 4:
                    ulang = false;
                    break;
                default:
                    System.out.println("Maaf, Pilihan Anda Salah");
            }
            System.out.println("Kembali Halaman Utama");
        }

    }
}
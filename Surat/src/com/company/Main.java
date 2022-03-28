// Aplikasi Pengajuan Surat Bebas Perpustakaan

package com.company;
import java.util.Date;

// Anggota
class Anggota {

    // Data
    String nama;
    int npm;
    String programStudi;
    int semester;
    Surat letter;

    // Method
    void buatSurat(Surat letter) {
        this.letter = letter;
    }

    // Constructor
    Anggota(String nama, int npm, String programStudi, int semester) {
        this.nama = nama;
        this.npm = npm;
        this.programStudi = programStudi;
        this.semester = semester;

    }

    void detailAnggota() {
        System.out.println("Nama Anggota : " + nama);
        System.out.println("NPM : " + npm);
        System.out.println("Program Studi : " + programStudi);
        System.out.println("Semester : " + semester);
        letter.detailSurat();

    }
}



// Surat
class Surat{
    String keterangan;
    Date tanggalSurat;


    // Constructor
    Surat(String keterangan, Date tanggalSurat){
        this.keterangan = keterangan;
        this.tanggalSurat = tanggalSurat;

    }

    // Method
    void detailSurat(){
        System.out.println("Keterangan : " + keterangan);
        System.out.println("Tanggal Pembuatan Surat : " + tanggalSurat);

    }
}

public class Main {

    public static void main(String[] args) {
        Anggota yuana = new Anggota("Yuana", 1815061005, "Teknik Informatika", 8);

        Date tanggalSurat = new Date();

        Surat bebas = new Surat("Mahasiswa tersebut tidak memiliki pinjaman pustaka milik Perpustakaan Universitas Lampung. Sehingga mahasiswa tersebut dapat mengikuti wisuda dan melakukan pengambilan ijazah.", tanggalSurat);

        yuana.buatSurat(bebas);

        yuana.detailAnggota();

    }
}

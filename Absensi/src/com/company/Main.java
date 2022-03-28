// Aplikasi Absensi Perpustakaan

package com.company;
import java.util.Date;

// Anggota
class Anggota {

    // Data
    String nama;
    int npm;
    String programStudi;
    String daftarAbsensi;
    Absensi list;

    // Method
    void attendanceList(Absensi list) {
        this.list = list;

    }

    // Constructor
    Anggota(String nama, int npm, String programStudi) {
        this.nama = nama;
        this.npm = npm;
        this.programStudi = programStudi;
    }


    void detailAnggota() {
        System.out.println("Nama Anggota : " + nama);
        System.out.println("NPM : " + npm);
        System.out.println("Program Studi : " + programStudi);
        list.detailList();

    }
}


// Aplikasi
class Absensi{
    String keterangan;
    Date tanggalHadir;

    // Constructor
    Absensi(String keterangan, Date tanggalHadir){
        this.keterangan = keterangan;
        this.tanggalHadir = tanggalHadir;
    }

    // Method
    void detailList(){
        System.out.println("Keterangan :" + keterangan);
        System.out.println("Tanggal Kehadiran :" + tanggalHadir);
    }
}

public class Main {

    public static void main(String[] args) {
        Anggota yuana = new Anggota("Yuana", 2015061005, "Teknik Informatika");

        Date tanggalHadir = new Date();

        Absensi hadir = new Absensi("Hadir", tanggalHadir);

        yuana.attendanceList(hadir);

        yuana.detailAnggota();
    }
}

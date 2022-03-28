// Aplikasi Pencarian Katalog Buku Perpustakaan

package com.company;
import java.util.Date;

// Anggota
class Anggota {

    // Data
    String nama;
    int npm;
    String programStudi;
    Buku book;
    Rak rack;

    // Method
    void cariBuku(Buku book) {
        this.book = book;
    }

    void cariRak(Rak rack) {
        this.rack = rack;
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
        book.detailBuku();

    }
}



// Buku
class Buku{
    String namaBuku;
    Date tanggalPencarian;
    int kodeBuku;
    String jenisBuku;
    String pengarangBuku;
    String penerbitBuku;
    int jumlahBuku;

    // Constructor
    Buku(String namaBuku, Date tanggalPencarian, int kodeBuku, String jenisBuku, String pengarangBuku, String penerbitBuku, int jumlahBuku){
        this.namaBuku = namaBuku;
        this.tanggalPencarian = tanggalPencarian;
        this.kodeBuku = kodeBuku;
        this.jenisBuku = jenisBuku;
        this.pengarangBuku = pengarangBuku;
        this.penerbitBuku = penerbitBuku;
        this.jumlahBuku = jumlahBuku;

    }

    // Method
    void detailBuku(){
        System.out.println("Nama Buku : " + namaBuku);
        System.out.println("Tanggal Pencarian : " + tanggalPencarian);
        System.out.println("Kode Buku : " + kodeBuku);
        System.out.println("Jenis Buku : " + jenisBuku);
        System.out.println("Pengarang Buku : " + pengarangBuku);
        System.out.println("Penerbit Buku : " + penerbitBuku);
        System.out.println("Jumlah Buku Tersedia : " + jumlahBuku);

    }
}



// Rak Buku
class Rak{
    String lokasiRak;
    int nomorRak;

    // Constructor
    Rak(String lokasiRak, int nomorRak){
        this.lokasiRak = lokasiRak;
        this.nomorRak = nomorRak;

    }

    // Method
    void detailRak(){
        System.out.println("Lokasi Rak Buku : " + lokasiRak);
        System.out.println("Nomor Rak : " + nomorRak);

    }
}


public class Main {

    public static void main(String[] args) {
        Anggota yuana = new Anggota("Yuana", 2015061005, "Teknik Informatika");

        Date tanggalPencarian = new Date();

        Buku cari = new Buku("Pemrograman Berorientasi Objek", tanggalPencarian, 2007015, "Buku Ajar", "Dwi Hastuti", "Erlangga", 10);

        Rak buku = new Rak("Lantai 2", 00125);

        yuana.cariBuku(cari);

        yuana.cariRak(buku);

        yuana.detailAnggota();

    }
}

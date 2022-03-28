// Aplikasi Peminjaman Buku Perpustakaan

package com.company;
import java.util.Date;

// Anggota
class Anggota {

    // Data
    String nama;
    int npm;
    String programStudi;
    int pinjam;
    Buku book;

    // Method
    void pinjamBuku(Buku book) {
        this.book = book;

    }

    // Constructor
    Anggota(String nama, int npm, String programStudi, int pinjam) {
        this.nama = nama;
        this.npm = npm;
        this.programStudi = programStudi;
        this.pinjam = pinjam;

    }

    void detailPeminjaman() {
        System.out.println("Nama Anggota : " + nama);
        System.out.println("NPM : " + npm);
        System.out.println("Program Studi : " + programStudi);
        System.out.println("Jumlah Peminjaman Buku : " + pinjam);
        book.detailBuku();

    }
}



// Buku
class Buku{
    String namaBuku;
    Date tanggalPinjam;
    String jenisBuku;
    String pengarangBuku;
    String penerbitBuku;

    // Constructor
    Buku(String namaBuku, Date tanggalPinjam, String jenisBuku, String pengarangBuku, String penerbitBuku){
        this.namaBuku = namaBuku;
        this.tanggalPinjam = tanggalPinjam;
        this.jenisBuku = jenisBuku;
        this.pengarangBuku = pengarangBuku;
        this.penerbitBuku = penerbitBuku;

    }

    // Method
    void detailBuku(){
        System.out.println("Nama Buku : " + namaBuku);
        System.out.println("Tanggal Peminjaman : " + tanggalPinjam);
        System.out.println("Jenis Buku : " + jenisBuku);
        System.out.println("Pengarang Buku : " + pengarangBuku);
        System.out.println("Penerbit Buku : " + penerbitBuku);

    }
}


public class Main {

    public static void main(String[] args) {
        Anggota yuana = new Anggota("Yuana", 2015061005, "Teknik Informatika", 1);

        Date tanggalPinjam = new Date();

        Buku pinjam = new Buku("Pemrograman Berorientasi Objek", tanggalPinjam, "Buku Ajar", "Dwi Hastuti", "Erlangga");

        yuana.pinjamBuku(pinjam);

        yuana.detailPeminjaman();
    }
}

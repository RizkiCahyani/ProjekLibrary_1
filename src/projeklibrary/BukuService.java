/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeklibrary;

import java.util.List;

/**
 *
 * @author LUI
 */
public interface BukuService {
    void tambahData(Buku mod);
    void ubahData(Buku mod);
    void hapusData(String id);
    
    Buku getById(String id);
    Buku getByIsbn(String isbn);
    List<Buku> getByID(String id);
    List<Buku> getByISBN(String isbn);
    List<Buku> getByJudul(String judul);
    List<Buku> getByKategori(String kategori);
    List<Buku> getByPengarang(String pengarang);
    List<Buku> ambilData();
    int jumlahBuku();
    int jmlDipinjam(String id);
    String nomer();
    
}

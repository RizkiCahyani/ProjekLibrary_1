/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeklibrary;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author LUI
 */
@Entity
@Table(name = "buku")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Buku_1.findAll", query = "SELECT b FROM Buku_1 b")
    , @NamedQuery(name = "Buku_1.findByIdBuku", query = "SELECT b FROM Buku_1 b WHERE b.idBuku = :idBuku")
    , @NamedQuery(name = "Buku_1.findByJudul", query = "SELECT b FROM Buku_1 b WHERE b.judul = :judul")
    , @NamedQuery(name = "Buku_1.findBySubjudul", query = "SELECT b FROM Buku_1 b WHERE b.subjudul = :subjudul")
    , @NamedQuery(name = "Buku_1.findByIsbn", query = "SELECT b FROM Buku_1 b WHERE b.isbn = :isbn")
    , @NamedQuery(name = "Buku_1.findByBahasa", query = "SELECT b FROM Buku_1 b WHERE b.bahasa = :bahasa")
    , @NamedQuery(name = "Buku_1.findByPenerbit", query = "SELECT b FROM Buku_1 b WHERE b.penerbit = :penerbit")
    , @NamedQuery(name = "Buku_1.findByTahunTerbit", query = "SELECT b FROM Buku_1 b WHERE b.tahunTerbit = :tahunTerbit")
    , @NamedQuery(name = "Buku_1.findByJumlahHalaman", query = "SELECT b FROM Buku_1 b WHERE b.jumlahHalaman = :jumlahHalaman")
    , @NamedQuery(name = "Buku_1.findByJumlahBuku", query = "SELECT b FROM Buku_1 b WHERE b.jumlahBuku = :jumlahBuku")})
public class Buku_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_buku")
    private String idBuku;
    @Column(name = "judul")
    private String judul;
    @Column(name = "subjudul")
    private String subjudul;
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "bahasa")
    private String bahasa;
    @Column(name = "penerbit")
    private String penerbit;
    @Column(name = "tahun_terbit")
    private String tahunTerbit;
    @Column(name = "jumlah_halaman")
    private Integer jumlahHalaman;
    @Column(name = "jumlah_buku")
    private Integer jumlahBuku;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "buku")
    private Collection<DetailBuku> detailBukuCollection;
    
    @Transient
    private List<String> pengarang;    
    @Transient
    private List<String> kategori;

    public Buku_1() {
    }

    public Buku_1(String idBuku) {
        this.idBuku = idBuku;
    }

    public String getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(String idBuku) {
        this.idBuku = idBuku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getSubjudul() {
        return subjudul;
    }

    public void setSubjudul(String subjudul) {
        this.subjudul = subjudul;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBahasa() {
        return bahasa;
    }

    public void setBahasa(String bahasa) {
        this.bahasa = bahasa;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public Integer getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(Integer jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public Integer getJumlahBuku() {
        return jumlahBuku;
    }

    public void setJumlahBuku(Integer jumlahBuku) {
        this.jumlahBuku = jumlahBuku;
    }

    @XmlTransient
    public Collection<DetailBuku> getDetailBukuCollection() {
        return detailBukuCollection;
    }

    public void setDetailBukuCollection(Collection<DetailBuku> detailBukuCollection) {
        this.detailBukuCollection = detailBukuCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBuku != null ? idBuku.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Buku_1)) {
            return false;
        }
        Buku_1 other = (Buku_1) object;
        if ((this.idBuku == null && other.idBuku != null) || (this.idBuku != null && !this.idBuku.equals(other.idBuku))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projeklibrary.Buku_1[ idBuku=" + idBuku + " ]";
    }

    /**
     * @return the pengarang
     */
    public List<String> getPengarang() {
        return pengarang;
    }

    /**
     * @param pengarang the pengarang to set
     */
    public void setPengarang(List<String> pengarang) {
        this.pengarang = pengarang;
    }

    /**
     * @return the kategori
     */
    public List<String> getKategori() {
        return kategori;
    }

    /**
     * @param kategori the kategori to set
     */
    public void setKategori(List<String> kategori) {
        this.kategori = kategori;
    }
    
}

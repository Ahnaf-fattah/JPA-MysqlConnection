package io.learn.jpa.JPA.access.the.DB.model;
              /*
     Created by IntelliJ IDEA
    Develop By -> Ahnaf Fattah
              */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class siswa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nama;
    private String alamat;

    protected siswa() {

    }

    public siswa(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    @Override
    public String toString() {
        return String.format(
                "Siswa [id ='%d', name ='%s', address = '%s']",
                id,nama,alamat
        );
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}

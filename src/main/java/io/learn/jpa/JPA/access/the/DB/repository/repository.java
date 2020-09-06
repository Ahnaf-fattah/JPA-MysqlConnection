package io.learn.jpa.JPA.access.the.DB.repository;
           /*
     Created by IntelliJ IDEA
    Develop By -> Ahnaf Fattah
              */

import io.learn.jpa.JPA.access.the.DB.model.siswa;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface repository extends CrudRepository <siswa, Long> {
    List<siswa> findByAlamat(String Alamat);
    siswa findById(long id);

}

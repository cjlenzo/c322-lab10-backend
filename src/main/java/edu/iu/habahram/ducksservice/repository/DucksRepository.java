package edu.iu.habahram.ducksservice.repository;

import edu.iu.habahram.ducksservice.model.Duck;
import edu.iu.habahram.ducksservice.model.DuckData;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Repository
public interface DucksRepository extends CrudRepository<Duck, String> {
    DuckData findById(int id);
    int save(DuckData duckData);
    List findAll();
//    boolean updateImage(int id, MultipartFile file);
//    boolean updateAudio(int id, MultipartFile file);
//    byte[] getImage(@Param("id") int id);
//    byte[] getAudio(int id);


}

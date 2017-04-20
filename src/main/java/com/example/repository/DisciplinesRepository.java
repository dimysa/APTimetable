package com.example.repository;

import com.example.models.Disciplines;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by supercat on 19.4.17.
 */
public interface DisciplinesRepository extends JpaRepository<Disciplines, Long> {
    List<Disciplines> findById(long id);

    @Query(value = "SELECT * FROM getdisciplines(?1, ?2)", nativeQuery = true)
    List<Disciplines> callFindByIdOfFacAndSem(int idOfFaculty, int semester);
}


package com.example.service.impl;

import com.example.repository.FacultiesRepository;
import com.example.models.Faculties;
import com.example.service.FacultiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by supercat on 13.4.17.
 */
@Service
public class FacultiesServiceImpl implements FacultiesService {

    @Autowired
    FacultiesRepository facultiesRepository;

    @Override
    public List<Faculties> findAllFaculties() {
        Iterable<Faculties> temp = facultiesRepository.findAll();
        ArrayList<Faculties> list = new ArrayList<Faculties>();
        if(temp != null) {
            for(Faculties e: temp) {
                list.add(e);
            }
        }
        return list;
    }

    @Override
    public Faculties findByShortName(String shortName) {
        return facultiesRepository.findByShortNameOfFaculty(shortName);
    }
}
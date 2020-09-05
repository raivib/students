package com.example.mob;

import com.example.mob.repository;
import com.example.mob.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class Controller {

    @Autowired
    repository studentsRepository;

    @RequestMapping(value="/stud/",method = RequestMethod.GET)
    public List<Students> getStudents(){
        return (List<Students>) studentsRepository.findAll();
    }

    @RequestMapping(value = "/stud/",method = RequestMethod.POST)
    public Students createStudent(Students students){
        return studentsRepository.save(students);
    }

    @RequestMapping(value = "/stud/",method = RequestMethod.PUT)
    public Students updateStudent(Students students){
        return studentsRepository.save(students);
    }

    @RequestMapping(value = "/stud/{id}",method = RequestMethod.DELETE)
    public void deleteStudent(@PathVariable("id") int id){
        studentsRepository.deleteById(id);
    }
}

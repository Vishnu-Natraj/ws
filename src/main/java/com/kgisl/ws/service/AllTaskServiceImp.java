package com.kgisl.ws.service;

import java.util.List;

import com.kgisl.ws.entity.AllTask;
import com.kgisl.ws.repository.Alltaskrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AllTaskServiceImp implements AllTaskService{

    @Autowired
    public Alltaskrepository alltaskrepository;

    @Override
    public List<AllTask> getAllTasks() {
        return alltaskrepository.findAll();
    }

    

    
}
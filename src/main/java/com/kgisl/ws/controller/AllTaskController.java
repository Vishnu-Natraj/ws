package com.kgisl.ws.controller;

import java.util.List;

import com.kgisl.ws.entity.AllTask;
import com.kgisl.ws.service.AllTaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@EnableAspectJAutoProxy(proxyTargetClass = true)
@RestController
@RequestMapping("/api/alltasks")
public class AllTaskController {
    @Autowired
    public AllTaskService allTaskService;

    @GetMapping("/")
    public @ResponseBody ResponseEntity<List<AllTask>> getAll() {
        return new ResponseEntity<>(allTaskService.getAllTasks(), HttpStatus.OK);
    }
}

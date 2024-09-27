package com.study.deploy_back.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${client.address}") // yml에꺼 가져옴
    private String ClientAddress;

    @CrossOrigin(originPatterns = "*")
    @GetMapping("/test")
    public ResponseEntity<?> test() {
        return ResponseEntity.ok(ClientAddress + " Hello, World!");
    }
}

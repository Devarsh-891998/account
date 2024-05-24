package com.cafe.account.rest;

import com.cafe.account.POJO.User;
import com.cafe.account.wrapper.UserWrapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@RequestMapping(path="/user")
public interface UserRest {

    @PostMapping(path="/signup")
    public ResponseEntity<String> signup(@RequestBody(required = true) Map<String,String> requestMap);

    @PostMapping(path = "/login")
    ResponseEntity<String> login(@RequestBody Map<String,String> reqyestMap);

    @GetMapping(path="/get")
    ResponseEntity<List<UserWrapper>> getAllUser();

    @PostMapping(path="/updateStatus")
    ResponseEntity<String> updateStatus(@RequestBody(required = true) Map<String,String> requestMap);
}

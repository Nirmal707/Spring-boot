package com.kgfsl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import java.util.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/events")
public class DetailController {
    @Autowired
    public DetailService detailService;

    @GetMapping("/get")
    public @ResponseBody ResponseEntity<List<Demo>> all() {
        return new ResponseEntity<>(detailService.getAll(), HttpStatus.OK);
    }

    @PutMapping("/put/{id}")
    public ResponseEntity<?> put(@PathVariable int id, @RequestBody Demo dt) {
        detailService.save(dt);
        return new ResponseEntity<>(dt, HttpStatus.OK);

    }

    @GetMapping("/get/{id}")
    public @ResponseBody ResponseEntity<?> getById(@PathVariable Long id) {

        Demo event = detailService.find(id);
        return new ResponseEntity<>(event, HttpStatus.OK);

    }

    @PostMapping("/post")
    public ResponseEntity<?> post(@RequestBody Demo event, UriComponentsBuilder ucBuilder) {
        System.out.println("//////////Controller////////////" + event);
        detailService.save(event);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/get/{id}").buildAndExpand(event.getId()).toUri());
        // return new ResponseEntity<>(event,headers, HttpStatus.CREATED);
        return new ResponseEntity<>(event, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        detailService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
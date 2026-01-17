package com.example.studentmanagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
      return List.of(
              new SoftwareEngineer(
                      123456,
                      "Alice Johnson",
                      "tech stack: Java, Spring Boot, React"
              )
      );
    }
}

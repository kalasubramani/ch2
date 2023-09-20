package com.springbootlearning.learningspringboot3.ch2;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
  record TestRecord(String name) {
  }

  List<TestRecord> testRecords = List.of(
      new TestRecord("blah blah blah"),
      new TestRecord("blah blah blah"),
      new TestRecord("blah blah blah"));

  public TestController() {

  }

  @GetMapping("/test")
  public String test(Model model) {
    model.addAttribute("records", testRecords);
    return "test";
  }
}

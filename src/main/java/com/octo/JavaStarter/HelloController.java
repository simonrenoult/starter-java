package com.octo.JavaStarter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  private final SayHelloService sayHelloService;

  public HelloController(SayHelloService sayHelloService) {
    this.sayHelloService = sayHelloService;
  }

  @GetMapping("/hello/{someone}")
  public String sayHelloTo(@PathVariable String someone) {
    return this.sayHelloService.sayHelloTo(someone);
  }
}

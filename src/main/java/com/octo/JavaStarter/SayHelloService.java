package com.octo.JavaStarter;

import org.springframework.stereotype.Service;

@Service
public class SayHelloService {
  public String sayHelloTo(String someone) {
    return "Hello " + someone;
  }
}

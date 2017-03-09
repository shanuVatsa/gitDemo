package com.cybage.controller;

/**
 * Created by Administrator on 3/9/2017.
 */
@RestController
public class HomeController {
    @RequestMapping("/")
    public String home(){
          return "Life is wonderful!";
      }
}

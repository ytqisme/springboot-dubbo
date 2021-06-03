package com.springboot.dubbo.demo.api;

/**
 * DemoService
 */
public interface DemoService {
  String hello(String msg) throws InterruptedException;
  String test1(String msg);
}

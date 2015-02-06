package org.rapidpm.demo.soap.matom.version03;


import org.rapidpm.demo.soap.matom.version03.remote.ServiceRemoteProxy;

/**
 * starte Endpoint zuerst !!
 *
 * Created by Sven Ruppert on 22.09.2014.
 */
public class Main {
  public static void main(String[] args) {
    Service proxy = new ServiceRemoteProxy();
    System.out.println("proxy.work() = " + proxy.work("Hello"));
  }
}

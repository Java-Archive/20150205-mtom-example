package org.rapidpm.demo.soap.matom.version03;

import javax.jws.WebService;

/**
 * Created by Sven Ruppert on 22.09.2014.
 */
@WebService(endpointInterface = "org.rapidpm.demo.soap.matom.version03.Service")
public class ServiceImpl implements Service {
  @Override
  public String work(String txt) {
    System.out.println("remote txt = " + txt);
    return "ServiceImpl - " + txt;
  }
}

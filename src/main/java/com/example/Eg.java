package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Eg
{
  private final Logger log = LoggerFactory.getLogger(this.getClass());

  public String goNowhere()
  {
    log.trace("goNowhere()");
    return null;
  }

  public String goSomewhere()
  {
    log.trace("goSomewhere()");
    return "/index";
  }
}

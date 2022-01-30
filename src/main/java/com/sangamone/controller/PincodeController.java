package com.sangamone.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sangamone.model.Pincode;

@Controller
public class PincodeController {
  @RequestMapping(value = "/getDetail", method = RequestMethod.GET)
  public String getPincode(Model model) throws Exception{
    List<Pincode> pincode = getListOfPincode();
    
    model.addAttribute("data", pincode);
    return "pincode.jsp";
  }
    
  // Dummy method for adding List of Pincode
  private List<Pincode> getListOfPincode() {
    List<Pincode> data= new ArrayList<Pincode>();
    data.add(new Pincode("827013", "Bokaro"));
    data.add(new Pincode("827104", "Danbad"));
    data.add(new Pincode("843001", "Ranchi"));
    return data;
  }    
}
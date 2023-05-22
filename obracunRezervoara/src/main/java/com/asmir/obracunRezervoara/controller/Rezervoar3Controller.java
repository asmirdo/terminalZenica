package com.asmir.obracunRezervoara.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.asmir.obracunRezervoara.entity.Mjera;
import com.asmir.obracunRezervoara.entity.Rezervoar2;
import com.asmir.obracunRezervoara.entity.Rezervoar3;
import com.asmir.obracunRezervoara.service.RezervoarServiceImpl;

@Controller
@RequestMapping("terminal")
public class Rezervoar3Controller {

  RezervoarServiceImpl rezervoarServiceImpl;

  @Autowired
  public Rezervoar3Controller(RezervoarServiceImpl rezervoarServiceImpl) {
    this.rezervoarServiceImpl = rezervoarServiceImpl;
  }

  @GetMapping("/terminal")
  public String homePage() {

    return "terminal";
  }

  @GetMapping("/rezervoar3/tablica")
  public String rezervoar(Model theModel) {
    theModel.addAttribute("rezervoar3", rezervoarServiceImpl.pronadjiTabelu());
    return "rezervoar-3";
  }

  @GetMapping("/rezervoar2/tablica")
  public String rezervoar2(Model theModel) {
    theModel.addAttribute("rezervoar2", rezervoarServiceImpl.pronadjiTabelu2());
    return "rezervoar-2";
  }

  @GetMapping("/rezervoar4/tablica")
  public String rezervoar4(Model theModel) {
    theModel.addAttribute("rezervoar4", rezervoarServiceImpl.pronadjiTabelu4());
    return "rezervoar-4";
  }

  @GetMapping("/unosR2")
  public String unesiMjeru2(Model theModel) {
    Mjera r2 = new Mjera();

    theModel.addAttribute("r2", r2);

    return "Mjera-2";
  }

  @GetMapping("/unosR3")
  public String unesiMjeru3(Model theModel) {
    Mjera r2 = new Mjera();

    theModel.addAttribute("r2", r2);

    return "Mjera-3";
  }

  @GetMapping("/unosR4")
  public String unesiMjeru4(Model theModel) {
    Mjera r2 = new Mjera();

    theModel.addAttribute("r2", r2);

    return "Mjera-4";
  }

  @GetMapping("/obracun2")
  public String unesiMjeru22(@ModelAttribute("r2") Mjera mjeraR2, Model theModel) {

    theModel.addAttribute("mjera2", mjeraR2);
    theModel.addAttribute("r2", rezervoarServiceImpl.pronadjiRed2(mjeraR2.brojReda()));
    return "r2-obracun";
  }

  @GetMapping("/obracun3")
  public String unesiMjeru33(@ModelAttribute("r2") Mjera mjeraR2, Model theModel) {

    theModel.addAttribute("mjera2", mjeraR2);
    theModel.addAttribute("r2", rezervoarServiceImpl.pronadjiRed(mjeraR2.brojReda()));
    return "r3-obracun";
  }

  @GetMapping("/obracun4")
  public String unesiMjeru44(@ModelAttribute("r2") Mjera mjeraR2, Model theModel) {

    theModel.addAttribute("mjera2", mjeraR2);
    theModel.addAttribute("r2", rezervoarServiceImpl.pronadjiRed4(mjeraR2.brojReda()));
    return "r4-obracun";
  }
}

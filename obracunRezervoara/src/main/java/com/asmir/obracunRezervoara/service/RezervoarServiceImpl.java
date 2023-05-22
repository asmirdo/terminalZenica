package com.asmir.obracunRezervoara.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asmir.obracunRezervoara.entity.Rezervoar2;
import com.asmir.obracunRezervoara.entity.Rezervoar3;
import com.asmir.obracunRezervoara.entity.Rezervoar4;
import com.asmir.obracunRezervoara.repository.Rezervoar2Repository;
import com.asmir.obracunRezervoara.repository.Rezervoar3Repository;
import com.asmir.obracunRezervoara.repository.Rezervoar4Repository;

@Service
public class RezervoarServiceImpl implements RezervoarService {

  Rezervoar3Repository rezervoar3Repository;
  Rezervoar2Repository rezervoar2Repository;
  Rezervoar4Repository rezervoar4Repository;

  @Autowired
  public RezervoarServiceImpl(Rezervoar3Repository repository, Rezervoar2Repository rezervoar2Repository,
      Rezervoar4Repository rezervoar4Repository) {
    this.rezervoar3Repository = repository;
    this.rezervoar2Repository = rezervoar2Repository;
    this.rezervoar4Repository = rezervoar4Repository;

  }

  public void snimiRed(Rezervoar3 rezervoar3) {
    rezervoar3Repository.save(rezervoar3);
  }

  public void snimiRed2(Rezervoar2 rezervoar2) {
    rezervoar2Repository.save(rezervoar2);
  }

  public void snimiRed4(Rezervoar4 rezervoar4) {
    rezervoar4Repository.save(rezervoar4);
  }

  public void obrisiRed(int red) {
    rezervoar3Repository.deleteById(red);
  }

  public void obrisiRed2(int red) {
    rezervoar2Repository.deleteById(red);
  }

  public void obrisiRed4(int red) {
    rezervoar4Repository.deleteById(red);
  }

  public Rezervoar4 pronadjiRed4(int id) {
    Optional<Rezervoar4> rez = rezervoar4Repository.findById(id);
    Rezervoar4 rez4 = rez.get();
    return rez4;
  }

  public Rezervoar3 pronadjiRed(int id) {
    Optional<Rezervoar3> rez = rezervoar3Repository.findById(id);

    Rezervoar3 rezervoar = rez.get();
    return rezervoar;
  }

  public Rezervoar2 pronadjiRed2(int id) {
    Optional<Rezervoar2> rez = rezervoar2Repository.findById(id);

    Rezervoar2 rezervoar = rez.get();
    return rezervoar;
  }

  public List<Rezervoar3> pronadjiTabelu() {
    return rezervoar3Repository.findAll();
  }

  public List<Rezervoar2> pronadjiTabelu2() {
    return rezervoar2Repository.findAll();
  }

  public List<Rezervoar4> pronadjiTabelu4() {
    return rezervoar4Repository.findAll();
  }
}

package com.asmir.obracunRezervoara.entity;

public class Mjera {
  private int korisnik;
  private int id;

  private int cm;
  private int mm;

  public Mjera() {
  }

  public Mjera(int broj) {
    this.korisnik = broj;
  }

  /**
   * @return int return the korisnik
   */
  public int getKorisnik() {
    return korisnik;
  }

  /**
   * @param korisnik the korisnik to set
   */
  public void setKorisnik(int korisnik) {
    this.korisnik = korisnik;
  }

  /**
   * @return int return the id
   */
  public int getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * @return int return the cm
   */
  public int getCm() {
    return cm;
  }

  /**
   * @param cm the cm to set
   */
  public void setCm(int cm) {
    this.cm = cm;
  }

  /**
   * @return int return the mm
   */
  public int getMm() {
    return mm;
  }

  /**
   * @param mm the mm to set
   */
  public void setMm(int mm) {
    this.mm = mm;
  }

  public int izracunajMilimetar() {
    return korisnik % 10;
  }

  public int izracunajCentimetar() {
    int broj = korisnik % 100;
    return broj / 10;
  }

  public int brojReda() {
    int broj = korisnik / 100;

    return broj;
  }

}

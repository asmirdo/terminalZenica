package com.asmir.obracunRezervoara.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "r-4")
public class Rezervoar4 {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int id;

  @Column(name = "0")
  private int nula;

  @Column(name = "1")
  private int jedan;

  @Column(name = "2")
  private int dva;

  @Column(name = "3")
  private int tri;

  @Column(name = "4")
  private int cetiri;

  @Column(name = "5")
  private int pet;

  @Column(name = "6")
  private int sest;

  @Column(name = "7")
  private int sedam;

  @Column(name = "8")
  private int osam;

  @Column(name = "9")
  private int devet;

  public Rezervoar4() {
  }

  public Rezervoar4(int nula, int jedan, int dva, int tri, int cetiri, int pet, int sest, int sedam, int osam,
      int devet) {
    this.nula = nula;
    this.jedan = jedan;
    this.dva = dva;
    this.tri = tri;
    this.cetiri = cetiri;
    this.pet = pet;
    this.sest = sest;
    this.sedam = sedam;
    this.osam = osam;
    this.devet = devet;
  }

  /**
   * @return int return the id
   */
  public int getId() {
    int id = this.id * 10;
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * @return int return the nula
   */
  public int getNula() {
    return nula;
  }

  /**
   * @param nula the nula to set
   */
  public void setNula(int nula) {
    this.nula = nula;
  }

  /**
   * @return int return the jedan
   */
  public int getJedan() {
    return jedan;
  }

  /**
   * @param jedan the jedan to set
   */
  public void setJedan(int jedan) {
    this.jedan = jedan;
  }

  /**
   * @return int return the dva
   */
  public int getDva() {
    return dva;
  }

  /**
   * @param dva the dva to set
   */
  public void setDva(int dva) {
    this.dva = dva;
  }

  /**
   * @return int return the tri
   */
  public int getTri() {
    return tri;
  }

  /**
   * @param tri the tri to set
   */
  public void setTri(int tri) {
    this.tri = tri;
  }

  /**
   * @return int return the cetiri
   */
  public int getCetiri() {
    return cetiri;
  }

  /**
   * @param cetiri the cetiri to set
   */
  public void setCetiri(int cetiri) {
    this.cetiri = cetiri;
  }

  /**
   * @return int return the pet
   */
  public int getPet() {
    return pet;
  }

  /**
   * @param pet the pet to set
   */
  public void setPet(int pet) {
    this.pet = pet;
  }

  /**
   * @return int return the sest
   */
  public int getSest() {
    return sest;
  }

  /**
   * @param sest the sest to set
   */
  public void setSest(int sest) {
    this.sest = sest;
  }

  /**
   * @return int return the sedam
   */
  public int getSedam() {
    return sedam;
  }

  /**
   * @param sedam the sedam to set
   */
  public void setSedam(int sedam) {
    this.sedam = sedam;
  }

  /**
   * @return int return the osam
   */
  public int getOsam() {
    return osam;
  }

  /**
   * @param osam the osam to set
   */
  public void setOsam(int osam) {
    this.osam = osam;
  }

  /**
   * @return int return the devet
   */
  public int getDevet() {
    return devet;
  }

  /**
   * @param devet the devet to set
   */
  public void setDevet(int devet) {
    this.devet = devet;
  }

  public double manjeLitara(int broj) {
    int rez = 0;
    if (broj == 0) {
      rez = this.nula;
    } else if (broj == 1) {
      rez = this.jedan;
    } else if (broj == 2) {
      rez = this.dva;
    } else if (broj == 3) {
      rez = this.tri;
    } else if (broj == 4) {
      rez = this.cetiri;
    } else if (broj == 5) {
      rez = this.pet;
    } else if (broj == 6) {
      rez = this.sest;
    } else if (broj == 7) {
      rez = this.sedam;
    } else if (broj == 8) {
      rez = this.osam;
    } else if (broj == 9) {
      rez = this.devet;
    }

    return rez;

  }

  public double viseLitara(int broj) {
    int rez = 0;
    if (broj == 0) {
      rez = this.jedan;
    } else if (broj == 1) {
      rez = this.dva;
    } else if (broj == 2) {
      rez = this.tri;
    } else if (broj == 3) {
      rez = this.cetiri;
    } else if (broj == 4) {
      rez = this.pet;
    } else if (broj == 5) {
      rez = this.sest;
    } else if (broj == 6) {
      rez = this.sedam;
    } else if (broj == 7) {
      rez = this.osam;
    } else if (broj == 8) {
      rez = this.devet;
    } else if (broj == 9) {
      rez = this.devet + (this.devet - this.osam);
    }

    return rez;

  }

  public double mjera(int cm, int mm) {
    double razlika = viseLitara(cm) - manjeLitara(cm);
    double litaraMilimetar = razlika / 10;
    double litar = (litaraMilimetar * mm) + manjeLitara(cm);
    return Math.round(litar);
  }
}

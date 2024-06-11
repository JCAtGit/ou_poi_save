package controller;

import java.util.Collection;

import observerPatroon.Observer;

/**
 * Markeer interface
 */
public interface Model {

  /**
   * geeft een lijst met plaatsnamen van vestigingen
   * @return lijst met plaatsnamen
   */
  public Collection<String> getVestigingPlaatsen();

  /**
   * Geeft de klanten voor de opgegeven vestiging
   * @param plaats
   * @return lijst met klant id's
   */
  public Collection<String> getVestigingKlanten(String plaats);

  /**
   * Sluit de applicatie af
   */
  public void sluitAf();

}
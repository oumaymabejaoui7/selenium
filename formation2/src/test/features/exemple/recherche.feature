
@tag
Feature: recherche google
  je veux rechercher via google

  @tag1
  Scenario: rechechere des pays
    Given ouvrir nnavigateur
    And ouvrir url de google "https://www.google.com/"
    When saisir le nom de pays "Tunisie"
    And cliquer sur entrer
    
    Then verifier le resultat que la phrase contient " résultats"
    

 

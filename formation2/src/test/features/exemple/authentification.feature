
@tag
Feature: authentification
  en tant que admin je veux m'authentifier: facultatif cette descreption

  @tag1
  Scenario: Authentification valide
    Given ouvrir navigateur
    And ouvrir url
    When saisir username
    And saisir mot de passe
    And cliquer sur le boutton login
    Then verifier le nom du profile
    And check more outcomes

  
# Aventurier Game

## Description

Ce projet permet de simuler les déplacements d'un aventurier sur une carte. La classe `Main` initialise les composants nécessaires et lance le jeu en lisant les fichiers de carte et de déplacements spécifiés en arguments.

## Structure du projet

- `Main`: Classe principale qui lance l'application.
- `AventurierInitializer`: Initialise les données de l'aventurier.
- `FileReaderUtility`: Utilitaire pour lire les fichiers.
- `ListConverter`: Convertit les listes de données.
- `AventurierService`: Service pour gérer la logique du jeu.
- `Aventurier`: Représente l'aventurier dans le jeu.

## Prérequis

- Java 17 ou supérieur.

## Installation

1. Assurez-vous d'avoir les fichiers de carte et de déplacements dans `src/main/resources/` avec les extensions `.txt`.

## Compilation

Compilez le projet avec Maven :
```sh
mvn clean install
```

## Exécution

Exécutez le projet avec la commande suivante :
```
java -cp .\target\SujetAventurier-1.0-SNAPSHOT.jar exercice.aventurier.Main <nomDuFichierCarte> <nomDuFichierDeplacement>
```

## Note importante

Pour le deuxième test, la position initiale de l'aventurier se trouve sur une case contenant #. Une condition a été ajoutée pour lever une exception avec un message indiquant que l'aventurier est mal positionné si cette situation se produit.
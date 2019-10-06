# ProjetPartition

## Description génerale du projet

Dans le présent projet, le but principal est de répondre les problématiques suivants:

### 1 - Écrivez une fonction « partition » qui prend un paramètre « liste » et un paramètre « taille » et retourne une liste de sous liste, où chaque sous liste a au maximum « taille » éléments.
Exemples d'entrées et sorties :
partition([1,2,3,4,5], 2) retourne: [ [1,2], [3,4], [5] ] 
partition([1,2,3,4,5], 3) retourne: [ [1,2,3], [4,5] ] 
partition([1,2,3,4,5], 1) retourne: [ [1], [2], [3], [4], [5] ] 

### 2 - Écrivez des tests unitaires avec Junit4 pour vérifier votre implémentation.

Important : Partez du principe que votre implémentation fera partie d'une librairie utilisé par plein d'autres applications (en production)


## Résultat:

### Réponse au Premier Problèm :

J'ai créé un projet appélé ProjetPartition sous Eclipse codé en Java.
Celui-ci contient 2 classes JAVA et deux librairie:

Classes: 
-- Complexite.java
-- TestPartition.java

Librairies:
-- JRE JavaSE-1.8
-- JUnit 4

### Détailles

#### Complexite.java
La classe Complexite.java contient une méthode appelé "partition" qui permet de prendre un paramètre « liste » et un paramètre « taille » et retourne une liste de sous liste, où chaque sous liste a au maximum « taille » élément.

#### TestPartition.java

C'est une classe de test avec Junit4, qui permet de tester la méthode "partition()".


## Fin!




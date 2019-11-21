# Carrefour Test
Carrefour Test est une application qui permet d'étudier la perfermance chez carrefour en se basant sur deux critères:

- Top 100 vente par magasin chaque jour.
- Top 100 chiffre d'affaire par produit pendant une semaine.


# Structure des données

Un fichier transaction est généré chaque jour contenant toutes les transactions et s'écrit sous la forme suivante:  

 - Transactions : transactions_YYYYMMDD.data

Chaque magasin possède ses fichiers referentiels qui s'écrivent sous la forme suivante:
 
 - Referentiels des produits : reference_prod-ID_MAGASIN_YYYYMMDD.data, ID_MAGASIN is the UUID store ID.
 
Chaque transaction est présentée sous la forme suivante: txId|datetime|magasin|produit|qte

Alors que les referentiels produits sont présentés sous cette forme : produit|prix.

 - txId : Transaction ID (integer)
 - datetime : date et heure avec format ISO 8601
 - magasin : UUID ID magasin
 - produit : ID produit  (integer)
 - qte : quantité (integer)
 - prix : prix du produit
 
# Methodologie

Ce projet est composé de deux parties:

## Generations des fichiers input

Les fichiers inputs (produits et transactions) sont générés par la classe gestionInput. GenererInput.scala
et les données sont stockés respèctivement dans: ./data/input/magasins et ./data/input/transactions.

Pour générer les données, il faut spécifier les variables associés déclarés dans la classe
 gestionInput.GenererInput.scala qui sont initialisés à:

 - nbrTransactions: Int = 50000
 - nbrMagasins: Int = 100
 - nbrProduit : Int = 3000
 - qteMax : Int = 20
 - prixMax = 50


## Traitement des données
Le traitement des inputs est fait à l'aide des packages présentés comme suit:
  
### gestionInput  
  
 Il contient deux classes : GenererInput et LectureTransaction qui sont responsables respectivement à la génération des inputs et la lecture des transactions.  
 
###  traitement
Il contient deux classes TopCAParMagasin et TopVenteParMagasin qui permettent de calculer les top cent chiffre d'affaire par produit pendant sept jours et les top cent vente par Magasin.
  
### genereroutput
Il contient deux classes GenererTopCaParMagasin et GenererTopVenteParMagain qui permettent de generer les fichiers output associés à top cent Ca par produit et top cent vente par produit. 
 

 # Environnement de developpement
   
   - scala 2.12.0
   - maven 3.3.9
   - intellij IDEA 2018 3.2
   - java 1.8.0_152 
   
   
# Execution de code 
 
- Générer le fichier.jar Com.Carrefour.Test-1.0-SNAPSHOT-jar-with-dependencies.jar en utilisant l'option maven clean install
- Exécuter la commande: java -Xmx512m -jar path_to_fichier.jar path_to_projectdirectory  firstDay
- Remarque: firstDay est la date où le code va générer les top_100 vente par magasin ainsi les top_100 CA par magasin pendant une semaine
    à partir de cette date.
- Expl: java -Xmx512m -jar /home/lansrod/Bureau/BIGDATA/Carrefour/target/Com.Carrefour.Test-1.0-SNAPSHOT-jar-with-dependencies.jar
/home/lansrod/Bureau/BIGDATA/Carrefour/ "20190708"


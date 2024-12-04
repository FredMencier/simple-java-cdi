# simple-java-cdi

L'idée du CDI (Context and Dependency Injection) est de supprimer les dépendences fortes
entre les classes. On parle aussi d'IoC (Inversion of Control)

Le projet suivant montre une progression d'un code fortement couplé vers l'utilisation de CDI

## Branche main (no-cdi-strong)
- Code avec une dépendence forte (couplage fort) entre ClientManager et Base64Encoder
  - L'encodage des informations ne peut se faire qu'avec la classe Base64Encoder car elle est déclarée au sein de la classe ClientManager

## Branche simple-java-cdi-no-cdi-less
- Code avec une dépendence faible (couplage faible) entre ClientManager et Encoder
  - Ici on réalise une inversion de control (IoC) car le control de l'encoder est donnée à une classe cliente de ClientManager
  - Ainsi le ClientManagerTest peut faire le choix :
    - d'encoder avec Base64EncoderImpl
    - d'encoder avec CustomEncoderImpl
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
      => Reste encore un problème : la création de l'instance d'un Encoder doit se faire manuellement :
    - new Base64EncodeurImpl
      Utiliser un injecteur pour résoudre ce problème -> CDI

## Branche simple-java-cdi-basic-cdi
- Code springboot démontrant l'injection CDI du bean Base64Encoder : **single implementation**
  - Utilisation de springboot pour apporter une context CDI
  - Injection d'un du bean Base64Encoder par field injection dans la classe ClientManager
  - Passage en Injection par constructeur (IoC plus souple)
  - Tentative d'injection d'un bean non managé (NotBeanService)

## Branche simple-java-cdi-qualifier-cdi
- Code springboot démontrant l'injection CDI du bean Encoder : **multiple implementation**
  - Dans le cas d'implémentations multiple, CDI prévoit 3 facon de spécifier l'implémentation du bean à injecter :
    - Utilisation du @Default : non disponible dans springboot
    - l'utilisation du @Qualifier
    - l'utilisation d'une annotation custom permettant de d'identifier le bean
  - Utilisation du @Qualifier
    - Injection par field
    - Injection par constructeur
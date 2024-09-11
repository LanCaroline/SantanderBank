# Santander Bank

JAVA RESTful API criada para Santander Bank.

## Diagrama de Classes
```mermaid

classDiagram
    class Person {
        +String name
        +Account account
        +List<Feature> features
        +Card card
        +List<News> news
    }

    class Account {
        +String number
        +String agency
        +Number balance
        +Number limit
    }

    class Feature {
        +String icon
        +String description
    }

    class Card {
        +String number
        +Number limit
    }

    class News {
        +String icon
        +String description
    }

    Person "1" -- "1" Account : has
    Person "1" -- "0..*" Feature : includes
    Person "1" -- "1" Card : has
    Person "1" -- "0..*" News : receives





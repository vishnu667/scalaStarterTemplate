
Prerequisites

 * Maven
 * JDK

To Compile, Build and Test the Project Run  ```mvn install```

To Test the project run ```mvn test```

To run the JavaMain class  ```mvn exec:java -Dexec.mainClass="com.example.JavaMain"```

To run the ScalaMain class  ```mvn exec:java -Dexec.mainClass="com.example.ScalaMain"```

Project Folder Structure

```
|-- pom.xml
|-- README.MD
`-- src
    |-- main
    |   |-- java
    |   |   `-- com
    |   |       `-- example
    |   |           `-- JavaMain.java
    |   `-- scala
    |       `-- com
    |           `-- example
    |               `-- ScalaMain.scala
    `-- test
        |-- java
        |   `-- com
        |       `-- example
        |           `-- JavaTest.java
        `-- scala
            `-- com
                `-- example
                    `-- ScalaTest.scala
```


Scala Files goes to the ```src/main/scala/``` and ```src/test/scala``` folders respectively

Java Files goes to the ```src/main/java/``` and ```src/test/java``` folders respectively

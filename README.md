# Medplum Java SDK

Lightweight Java FHIR SDK based on Jakarta Client and Jakarta JSON.

## Maven Cheatsheet

| Task                          | Command                                                  |
| ----------------------------- | -------------------------------------------------------- |
| Clean                         | `mvn clean`                                              |
| Build                         | `mvn build`                                              |
| Replicate Jenkins build       | `mvn clean install site`                                 |
| Show all dependencies         | `mvn dependency:tree`                                    |
| Analyze unused dependencies   | `mvn dependency:analyze`                                 |
| Check for dependency updates  | `mvn versions:display-dependency-updates`                |
| Check for plugin updates      | `mvn versions:display-plugin-updates`                    |
| Sort pom.xml files            | `mvn com.github.ekryd.sortpom:sortpom-maven-plugin:sort` |

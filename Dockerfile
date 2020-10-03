From openjdk:8
copy ./target/bookstore-jdbc-0.0.1-SNAPSHOT.jar bookstore-jdbc-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","bookstore-jdbc-0.0.1-SNAPSHOT.jar"]
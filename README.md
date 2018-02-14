# GraphQL API trial project

- Design and implement schema 
- Build Java based server & react client 
- Test / Load test
- Looking for the best practice for GraphQL project

# Build

```
./gradlew build
cd buiild
java -jar libs/com-abc-api-xxxx.jar
```
Or
```$xslt
./gradlew bootRun
```

# Run

- [GraphQL Console](http://127.0.0.1:8080/graphiql) 
 
 Query
 
 ```
 query{
   boardings(flightNumber:"919") {
       id
       flight {
         flightNumber
       }
       firstName
       lastName
       checkedIn
       boardTime
       boardingInfo
   }
 }
 ```
 
 Mutation
 ```
 mutation {
   board {
     boardByName(firstName:"chuan",lastName:"chen", flightNumber:"919") {
       id
       flight {
         flightNumber
       }
       firstName
       lastName
       checkedIn
       boardTime
       boardingInfo
     }
   }
 }
 ``` 

- [GraphQL Endpoint](http://127.0.0.1:8080/graphql) 

    - Request by Get http://127.0.0.1:8080/graphql?query={...} 
    ```
    ```
    - Request by Post
    ```
    ```

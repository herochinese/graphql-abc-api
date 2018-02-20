# GraphQL API Trial Project

- Design and implement schema .
- Build Java based server & react client. 
- Contract, end to end, and load test.
- Looking for the best practice for GraphQL project.

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
 
 An example GraphQL Query might look like, and then you can adjust as per schema.
 
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
 
 An example GraphQL Mutation
  
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
     http://127.0.0.1:8080/graphql?query={flights(flightNumber:"*") {id flightNumber}}
    
    ```
    - Request by Post
    ```
     mutation {
       flight {
         open(agentSineCode:"30033C", flightNumber:"800",departureAirport:"AKL") {
           id
           status
           gate
           flightNumber
           airlineOperatingCode
           seatMap {
             rowList {
               seatList {
                 column
                 type
               }
             }
           }
         }
       }
     }
    
    ```
*All data and actions were based on mock method, it supports board / flight / boardings ... ... Prefer to send post request due to easily manage thing. Just try for fun!*


# TODO 

> 1. Switch input parameters to object with validattion
> 2. Added more comment to understand definition
> 3. Do we need airline operating code as input (such as: NZ, 3U, CA ...)? Default is NZ and only use flight number for now ("445", "101"...).
> 4. Doesn't require depature date for all relevant methods for now due to simple style, and default today. May not right?
> 5. Or for No.3/4, we can use id of flight which return from {flight.open}, and rest of call we can simply use this id instead of flight number
> 6. error handling
> 7. Logs
> 8. Monitoring

 
# Issues
|No.|Issue|Solution|
|---|:---:|:---:|

# Next
1. Push this thing into containter, and deploy to Kubenetes in AWS.
2. Setup OpenFaas on Kubernetes, and then write serverless code to invoke API.

# Appendix

- [GraphQL working draft - 2016](http://facebook.github.io/graphql/October2016/#)

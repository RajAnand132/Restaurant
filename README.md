
# Restaurant Management
This is a simple Restaurant Management System built using Java and Spring Boot. It provides basic functionality for managing restaurant information, including adding, retrieving, updating, and deleting restaurant records.

## Run Locally

Clone the project

```bash
  git clone https://github.com/yourusername/restaurant.git

```

Go to the project directory

```bash
  cd user-management-system
```

Install dependencies

```bash
  mvn clean install
```
Run the Spring Boot application

```bash
  mvn spring-boot:run
```

Start the server

```bash
  http://localhost:8080
```


## Tech Stack

**Languages & FrameWorks :** Java, SpringBoot

**Data Strucure :** ArrayList

**Tools Used :** IntelliJ, PostMan


## Documentation Dataflow

In your Restaurant Management project, the data flows between different components as follows:

1. **Client Request**:
    - Data flow begins when a client (e.g., a web browser or mobile app) sends an HTTP request to the Spring Boot application. These requests can be for various operations like adding, retrieving, updating, or deleting restaurant data.

2. **Controller Layer**:
    - The Spring Boot application's controller layer receives the incoming HTTP request. The RestaurantController class handles these requests. The controller extracts data from the request, which can be in the form of JSON or URL parameters.

3. **Data Access Layer**:
    - The data access layer typically interacts with a database to perform CRUD (Create, Read, Update, Delete) operations on restaurant data. In this project, an in-memory List<Restaurant> is used as a data store instead of a database.

4. **Response**:
   After processing the request, the controller returns an HTTP response to the client. This response can include data (e.g., restaurant information, success messages) and an HTTP status code (e.g., 200 for success, 404 for not found, 500 for server error).

Overall, data flows from the client through the controller to the data access layer (in-memory list in this case) for CRUD operations, and then back to the client as an HTTP response.

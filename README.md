
# Restaurant Management
This is a simple Restaurant Management System built using Java and Spring Boot. It provides basic functionality for managing restaurant information, including adding, retrieving, updating, and deleting restaurant records.

## Run Locally

Clone the project

```bash
  git clone https://github.com/yourusername/restaurant.git

```

Go to the project directory

```bash
  cd restaurant
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

## API Reference


#### Add multiple Restaurants

```http
  POST localhost:8080/api/restaurant/list
```

| Parameter | Request Type     | Description                                                |
| :-------- | :------- |:-----------------------------------------------------------|
| `Array of JSON objects` | `Request Body` | **Required**. Restaurants objects with restaurants details |

### Example
#### Request Body:
```
[
  {
    "restaurantId": 1,
    "restaurantName": "Delicious Delights",
    "restaurantAddress": "123 Main Street, Cityville",
    "restaurantPhoneNumber": "+911234567890",
    "restaurantSpecialty": "Italian Cuisine",
    "restaurantTotalStaff": 25,
    "restaurantAverageRating": 4.5,
    "restaurantMenuItems": ["Pizza", "Pasta", "Salad", "Tiramisu"],
    "restaurantChefName": "Chef Giovanni",
    "restaurantWebsiteUrl": "https://www.deliciousdelights.com",
    "restaurantEmail": "info@deliciousdelights.com"
  },
  {
    "restaurantId": 2,
    "restaurantName": "Sushi Sensation",
    "restaurantAddress": "456 Oak Avenue, Townsville",
    "restaurantPhoneNumber": "+919876543210",
    "restaurantSpecialty": "Japanese Cuisine",
    "restaurantTotalStaff": 12,
    "restaurantAverageRating": 4.0,
    "restaurantMenuItems": ["Sushi", "Sashimi", "Tempura", "Miso Soup"],
    "restaurantChefName": "Chef Hiroshi",
    "restaurantWebsiteUrl": "https://www.sushisensation.com",
    "restaurantEmail": "info@sushisensation.com"
  },
  {},
  {}
  ...................more attributes
]
```
#### Response:
10 Restaurant added successfully 😊😊😊

#### Get Restaurant

```http
  GET localhost:8080/api/restaurant/id/{id}

```

| Parameter | Request Type     | Description                                            |
| :-------- | :------- |:-------------------------------------------------------|
| `restaurantId`      | `Path parameter` | **Required**.  restaurantId of the restaurant to fetch |

### Example
#### Response
```
{
    "restaurantId": 1,
    "restaurantName": "Delicious Delights",
    "restaurantAddress": "123 Main Street, Cityville",
    "restaurantPhoneNumber": "+911234567890",
    "restaurantSpecialty": "Italian Cuisine",
    "restaurantTotalStaff": 25,
    "restaurantAverageRating": 4.5,
    "restaurantMenuItems": [
        "Pizza",
        "Pasta",
        "Salad",
        "Tiramisu"
    ],
    "restaurantChefName": "Chef Giovanni",
    "restaurantWebsiteUrl": "https://www.deliciousdelights.com",
    "restaurantEmail": "info@deliciousdelights.com"
}
```

#### Get All Restaurants

```http
  GET localhost:8080/api/restaurants

```

| Parameter | Request Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `N/A`      | `N/A` | **Required**. Nothing |

### Example
#### Response
```
[
    {
        "restaurantId": 1,
        "restaurantName": "Delicious Delights",
        "restaurantAddress": "123 Main Street, Cityville",
        "restaurantPhoneNumber": "+911234567890",
        "restaurantSpecialty": "Italian Cuisine",
        "restaurantTotalStaff": 25,
        "restaurantAverageRating": 4.5,
        "restaurantMenuItems": [
            "Pizza",
            "Pasta",
            "Salad",
            "Tiramisu"
        ],
        "restaurantChefName": "Chef Giovanni",
        "restaurantWebsiteUrl": "https://www.deliciousdelights.com",
        "restaurantEmail": "info@deliciousdelights.com"
    },
    {},
    {}
    ......................more attributes
]
```
#### Update Restaurant

```http
  PUT localhost:8080/api/restaurant/id/{id}
```

| Parameter | Request Type     | Description                                             |
| :-------- | :------- |:--------------------------------------------------------|
| `restaurantId`      | `Path parameter` | **Required**.  restaurantId of the restaurant to Update |
| `JSON`      | `Request Body` | **Required**.  Body of the restaurant to Update         |

### Example
#### Request
```
{
    "restaurantId": 11,
    "restaurantName": "Delicious Delights",
    "restaurantAddress": "123567 Main Street, Cityville",
    "restaurantPhoneNumber": "+911234567890",
    "restaurantSpecialty": "Indian Cuisine",
    "restaurantTotalStaff": 25,
    "restaurantAverageRating": 4.5,
    "restaurantMenuItems": ["Pizza", "Pasta", "Salad", "Tiramisu"],
    "restaurantChefName": "Chef Giovanni",
    "restaurantWebsiteUrl": "https://www.deliciousdelights.com",
    "restaurantEmail": "info@deliciousdelights.com"
  }
```
#### Response
Restaurant updated successfully 😊😊😊

#### Delete Restaurant

```http
  DELETE localhost:8080/restaurant/name/{name}

```
| Parameter        | Request Type     | Description                                                         |
|:-----------------| :------- |:--------------------------------------------------------------------|
| `restaurantName` | `Path parameter` | **Required**. restaurantName of the restaurant to delete restaurant |

### Example
#### Response:
Restaurant deleted successfully 😒😒😒

## Support

For support, email abc@gmail.com or join our Slack channel.


## Acknowledgements

- [Awesome Readme Templates](https://awesomeopensource.com/project/elangosundar/awesome-README-templates)
- [Awesome README](https://github.com/matiassingers/awesome-readme)
- [How to write a Good readme](https://bulldogjob.com/news/449-how-to-write-a-good-readme-for-your-github-project)




## Environment

The following environment variables need to be set in the `src/main/resources/.env` file:

-   `MONGO_DATABASE`: The name of the MongoDB database.
-   `MONGO_USER`: The username for the MongoDB database.
-   `MONGO_PASSWORD`: The password for the MongoDB database.
-   `MONGO_CLUSTER`: The name of the MongoDB cluster.

## Running the application

To run the application, open a command prompt or terminal in the project directory and run the following command:

Windows: mvnw.cmd spring-boot:run Linux or macOS: mvn spring-boot:run

The application will start and be available at `http://localhost:8080`.

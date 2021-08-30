# SpringBootWarfileDatabaseExamples

Spring Boot .WAR file based CRUD applications using different database providers that are deployed and tested on Azure.

Below is a list of accessible endpoints for CRUD operations.

MySQL
 - `/` - Root path
 - `/api/mysql/task/find` - `GET` request to retrieve all todos
 - `/api/mysql/task/find/{id}` - `GET` request to retrieve a todo by ID
 - `/api/mysql/task/delete/{id}` - `DELETE` request to remove a todo by ID
 - `/api/mysql/task/update/{id}` - `PUT` request to update a todo by ID
 - `/api/mysql/task/add` - `POST` request to add a new todo

Postgres
 - `/` - Root path
 - `/api/postgres/task/find` - `GET` request to retrieve all todos
 - `/api/postgres/task/find/{id}` - `GET` request to retrieve a todo by ID
 - `/api/postgres/task/delete/{id}` - `DELETE` request to remove a todo by ID
 - `/api/postgres/task/update/{id}` - `PUT` request to update a todo by ID
 - `/api/postgres/task/add` - `POST` request to add a new todo

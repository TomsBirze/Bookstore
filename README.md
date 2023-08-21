# Bookstore project

This is a project to simulate a bookstore. Front end is made [Vite](https://vitejs.dev/). 
This app is designed to send simple data (Book object with a title) to Java Spring Boot backend that is saved in Postgresql database.
Home route loads all books stored in database.

## Prerequisites

Before you can get started with this project, ensure you have the following programs and tools installed on your system:

- **Node.js**: This project's frontend is built with Node.js and uses npm for package management. You can download Node.js from [nodejs.org](https://nodejs.org/).

- **IntelliJ IDEA**: This Integrated Development Environment (IDE) is used for developing the backend Spring Boot application. You can download IntelliJ IDEA from [jetbrains.com/idea/](https://www.jetbrains.com/idea/).

- **Docker**: Docker is used to set up a PostgreSQL database container for the backend. Install Docker by visiting [docker.com/products/docker-desktop/](https://www.docker.com/products/docker-desktop/).



## Getting started by setting up front end.
https://github.com/TomsBirze/Bookstore-UI

## Continu by setting up the database for back end.
Download [Docker](https://www.docker.com/products/docker-desktop/) for your operating system

(to set up a container. cmd run)  docker run --name my-postgres-db -e POSTGRES_PASSWORD=docker -p 5432:5432 -d postgres  

## To run the back end.
1. Clone this repository

```git clone git@github.com:TomsBirze/Bookstore.git```

2. Navigate to the project directory

```cd Bookstore```

3. Open the folder with IntelliJ and run BookstoreApplication
   
```Back end application will be running on http://localhost:8080/```

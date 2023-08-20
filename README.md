# Bookstore project

This is a project to simulate a bookstore. Front end is made [Vite](https://vitejs.dev/). 
This app is designed to send simple data (Book object with a title) to Java Spring Boot backend that is saved in Postgresql database.
Home route loads all books stored in database.

## Getting started by setting up front end.
https://github.com/TomsBirze/Bookstore-UI

## Continu by setting up the database for back end.
Download [Docker](https://www.docker.com/products/docker-desktop/) for your operating system

(to set up a container. cmd run)  docker run --name my-postgres-db -e POSTGRES_PASSWORD=docker -p 5432:5432 -d postgres  

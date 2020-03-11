# spring_example_security
Simple Spring Boot/React Example with Modal forms and Security

This is a simple Spring Boot backend, React frontend example.

The root page "/" is handled by a standard Spring Web Controller, HomeController.java.

The React application running on that page uses a Spring REST Controller with a "/cars" mapping to access the
API for handling the Car objects in the application.
The React application makes use of the React-Bootstrap package for
components and styling, and uses Modal dialogs for editing of the car data.

There is a Spring REST Controller with a "/users" mapping to access the API for handling User objects in the
application, and this is only accessable to users with the ADMIN role

# Spring Packages Used:

* Spring Boot
* Spring Web
* Spring Security
* Spring Thymeleaf
* Spring Data JPA
* Spring Devtools
* MySQL Connector
* frontend-maven-plugin for React development

# JS Packages Used:

* Babel
* Webpack
* Axios
* React
* React-Bootstrap

# Frontend Build

There are 3 maven rules that are used to build the frontend:

     mvn frontend:install-node-and-npm

If this is executed from the command line (or your IDE maven interface)
it will install Node.js and npm in your project directory.  This only
needs to be rerun after the first time if you change the version of node
specified in your pom.xml file.

     mvn frontend:npm

If this is executed from the command line (or your IDE maven interface)
it will the javascript packages specified in your package.json file.  This
only needs to be rerun if that file is changed.

     mvn frontend:webpack

If this is executed from the command line (or your IDE maven interface)
it will compile and package your javascript files into a single javascript
file which will run on older as well as current browsers.  It should be rerun
each time your frontend application is changed, before rerunning the backend
server project.

# Tests

Tests and CI are yet to come for this example.





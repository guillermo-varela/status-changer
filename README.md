# status-changer
Demonstration of how to change the current status of a Web Application

- Deploy the project in a servlet container (Servlet 3 compliant, like Tomcat 7+), using JDK 7 or superior.
- Access the current status with a GET request using an URL like this one: http://localhost:8080/status-changer/health
- Change the current status with a PUT request using an URL like this one: http://localhost:8080/status-changer/health/toggleStatus
- Enjoy

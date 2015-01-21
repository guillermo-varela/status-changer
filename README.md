# status-changer
Demonstration of how to change the current status of a Web Application.

- Deploy the project in a servlet container (Servlet 3 compliant, like Tomcat 7+), using JDK 7 or superior.
- Add users for testing in the container security realm, just remember to add a user with a role named "admin". For example, if using Tomcat the default realm is in the file $CATALINA_BASE/conf/tomcat-users.xml
- Access the current status with a GET request using an URL like this one: http://localhost:8080/status-changer/health
- Change the current status with a PUT request using an URL like this one: http://localhost:8080/status-changer/health/toggleStatus
- Enjoy

A more detailed tutorial can be found (in spanish) at: [http://nombre-temp.blogspot.com/2015/01/cambiar-el-estado-de-una-aplicacion-web.html](http://nombre-temp.blogspot.com/2015/01/cambiar-el-estado-de-una-aplicacion-web.html)
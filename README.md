# Task List Docker

    docker run --name=mysql-server -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root -e MYSQL_USER=test -e MYSQL_PASSWORD=test -e MYSQL_DATABASE=testdb -d mysql
    docker run --name myphpadmin -d --link mysql-server:db -p 8081:80 phpmyadmin/phpmyadmin
    docker build -t spring-boot-mysql .
    docker run --name spring-boot-mysql -d --link mysql-server:db -p 8081:8081 spring-boot-mysql  

    docker network create spring-boot-mysql
    docker run --net=spring-boot-mysql --rm --name=mysql-server -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root -e MYSQL_USER=test -e MYSQL_PASSWORD=test -e  MYSQL_DATABASE=testdb mysql
    docker run --net=spring-boot-mysql --rm --name spring-boot-mysql -d -p 8081:8081 spring-boot-mysql

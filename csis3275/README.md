# hong_springboot


```shell script
# run mysql docker
docker run -p 3306:3306 --name hongle-mysql57 -e MYSQL_ROOT_PASSWORD=doconmeo MYSQL_DATABASE=csis3275 mysql:5.7

# connect to mysql docker
mysql -h localhost -P 3306 --protocol=tcp -uroot -p csis3275

# run spring boot in terminal
./mvnw spring-boot:run
```
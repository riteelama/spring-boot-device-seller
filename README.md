#Spring Boot Device Seller

## EndPoints

### Sign-Up
````
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 74

{
"name":"ritee",
"username":"ritee",
"password":"ritee"
}
````

###Change Role
```
PUT /api/user/change/ADMIN HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJyaXRlZSIsInJvbGVzIjoiUk9MRV9VU0VSIiwidXNlcklkIjozLCJleHAiOjE2NTM3NTg2MTl9.2A7Gp6SJJ-eaNP_2izKPYTbl4uFR33nN3_oICuL7vd0f0d1bMmRV9aw7piaYjwnpru_zvJrhIzffCfwdMgWlfQ
```

###Save Device
````
POST /api/device HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MiwiZXhwIjoxNjUzNzU3NTkwfQ.G3MhqKF2wc2owwiOj3GA8UlQs_68bX-2RdCC9S89W4ScNyzGEXUvOWbmZL6AFNTnNzVLOA2e5arNP3CRS8nsfA
Content-Type: application/json
Content-Length: 103

{
    "name": "device-2",
    "description":"desc-2",
    "price": 10,
    "deviceType":"TABLET"
}
````

### Get All Devices
```
GET /api/device HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MiwiZXhwIjoxNjUzNzU3NTkwfQ.G3MhqKF2wc2owwiOj3GA8UlQs_68bX-2RdCC9S89W4ScNyzGEXUvOWbmZL6AFNTnNzVLOA2e5arNP3CRS8nsfA
Content-Type: application/json
Content-Length: 101

{
    "name":"device-1",
    "description":"desc-1",
    "price":9,
    "deviceType": "LAPTOP"
}
```

### Delete Device
````
DELETE /api/device/1 HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MiwiZXhwIjoxNjUzNzU3NTkwfQ.G3MhqKF2wc2owwiOj3GA8UlQs_68bX-2RdCC9S89W4ScNyzGEXUvOWbmZL6AFNTnNzVLOA2e5arNP3CRS8nsfA
````

###Save Purchase
````
POST /api/purchase HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MiwiZXhwIjoxNjUzNzU3NTkwfQ.G3MhqKF2wc2owwiOj3GA8UlQs_68bX-2RdCC9S89W4ScNyzGEXUvOWbmZL6AFNTnNzVLOA2e5arNP3CRS8nsfA
Content-Type: application/json
Content-Length: 76

{
    "userId":2,
    "deviceId":2,
    "price":9,
    "color":"blue"
}
````


###Get All Purchase
````
GET /api/purchase HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MiwiZXhwIjoxNjUzNzU3NTkwfQ.G3MhqKF2wc2owwiOj3GA8UlQs_68bX-2RdCC9S89W4ScNyzGEXUvOWbmZL6AFNTnNzVLOA2e5arNP3CRS8nsfA
````
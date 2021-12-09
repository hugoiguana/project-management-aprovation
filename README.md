# project-management-creation

**Available end points:**

```javascript
Description: Login to the application.
docker 
curl --request POST \
  --url http://localhost:8080/login \
  --header 'Content-Type: application/json' \
  --data '{
	"email" : "admin@email.com",
    "password" : "1234"
}'
```


```javascript
Description: Create a User Project.

curl --request POST \
--url http://localhost:8080/users/project \
--header 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbkBlbWFpbC5jb20iLCJleHAiOjE2MzkwNTkzNjd9.LnSx3FYPmlNKgblrPjphxcb6C2ysQ3NaT7qV5hKuIc0gv5JWQSkMnwrEpLIyXaBLwdWn0_CD441Xu96fiANF9Q' \
--header 'Content-Type: application/json' \
--data '{
"email" : "admin@email.com",
"name" : "Gabriel",
"profile" : "1234"
}'
```



**Docker commands:**

> docker-compose up -d --build 


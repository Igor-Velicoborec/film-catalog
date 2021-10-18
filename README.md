### Application
This application is designed to add movies to the database with an indication of its director(CRUD, films managements)

### Technologies
- Java 11
- Spring  (Boot, MVC, Data)
- PostgreSQL

### REST API

CRUD API + */directors/{directorId}/films/*  endpoint:

| URI                                 | Method     | Description                            |
| ---------------------               | ----       | ------------------------               |
|*/directors/{directorId}/films/*     | **GET**    | Get  all films by director             | 
|*/directors/{directorId}/films/*     | **POST**   | Add new film                           | 
|*/directors/{directorId}/films/{id}* | **PUT**    | Modify film by id                      |
|*/directors/{directorId}/films/{id}* | **GET**    | Get film by id                         |
|*/directors/{directorId}/films/{id}* | **DELETE** | Delete film by id                      |
|*/directors/*                        | **POST**   | Add new director                       | 
|*/directors/{directorId}*            | **PUT**    | Modify director by id                  | 
|*/directors/{directorId}*            | **DELETE** | Delete directors by id                 | 
|*/directors*                         | **GET**    | Get all directors                      |
|                                     |            |                                        |  
 

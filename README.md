# patientDataCrudApplication
## Documentation
The back-end is developed with Spring Boot in Java. It uses an ORM to encapsulate the database. Currently the application is using and im memory database (H2). But this could be easily changed in the `application.properties`. I just had problems hosting the app on Heroku using an SQL database. If the client tries to add a duplicate or tries to change an existing patient to be a duplicate, the server will throw a [DuplicatedPatientException](src/main/java/com/thiess/cgm/patientDataCrudApplication) which is handled by [PatientControllerAdvice](src/main/java/com/thiess/cgm/patientDataCrudApplication/PatientControllerAdvice.java) to pass the exception message and the correct HTTP status code to the client .

#### all REST endpoints
* Get all patients: ` GET https://patient-data-crud.herokuapp.com/api/v1/patients`
* Add patient: ` POST https://patient-data-crud.herokuapp.com/api/v1/patients`
* Get one patient: ` POST https://patient-data-crud.herokuapp.com/api/v1/patients/<insert id>`
* Update patient: ` PUT https://patient-data-crud.herokuapp.com/api/v1/patients/<insert id>`
* Delete patient: ` DELETE https://patient-data-crud.herokuapp.com/api/v1/patients/<insert id>`

The back-end offers server sided searching for the patient's last name as an HTTP query parameter:
* Search patient: ` GET https://patient-data-crud.herokuapp.com/api/v1/patients?last-name=<insert last name>`

Example tests are added for [PatientController](src/test/java/com/thiess/cgm/patientDataCrudApplication/PatientControllerUnitTest.java ).
Results: ![alt text](https://i.imgur.com/64B9ERe.png)

The back-end is hosted on Heroku [here](https://patient-data-crud.herokuapp.com).

Currently, I am conducting my Masters Thesis at the [Department of Biomedical Informatics, University of Utah](https://medicine.utah.edu/dbmi/) and there is not enough time to add additional features or a more detailed documentation. I hope it is still sufficient.

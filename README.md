# Software Developer - Java - Technical Test
## Calculate Average Victim REST API
This application serves to count the number of victims killed by witches. I built it using the Spring Boot Java framework for the backend and AngularJS for the frontend.
**For the front-end files, you can visit this repository link:** [witchFE](https://github.com/Alhuzsyam/witchFE)

## Get Started 
1. First, clone this repository to your local computer.
2. **Note: To run this app, you must first install Java on your local computer.**
3. After cloning the repository, navigate to the project directory.
4. You can run this app with the following command: `mvn spring-boot:run`

**Live application demo:** [live Demo](http://128.199.177.206:5390/)

![feren](https://github.com/Alhuzsyam/witch/assets/64511435/705953a9-345f-44ce-aa90-acfc92ac5654)

## API Endpoint
### Calculate Victim Average Endpoint

**For live Demo Api Endpoint, you can use this URL:**

- **Method:** POST 
- **Path:** [http://128.199.177.206:8087/api/v1/victim/average](http://128.199.177.206:8087/api/v1/victim/average) (**Access the endpoint from anywhere**)

- **Method:** POST 
- **Path:** [http://localhost:8087/api/v1/victim/average](http://localhost:8087/api/v1/victim/average) (**local computer only**)

#### Request Body & Response Body
```json
{
  "ageAtDeathA": 10,
  "yearOfDeathA": 12,
  "ageAtDeathB": 13,
  "yearOfDeathB": 17
}
```

```json
{
	"status": "200 OK",
	"message": "success",
	"payload": {
		"average": 4.5,
		"personB_tahunKe": 4,
		"personA_jumlahKematian": 2,
		"personA_tahunKe": 2,
		"personB_jumlahKematian": 7
	}
}
```


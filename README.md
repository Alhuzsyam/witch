# Software Developer - Java - Technical Test
# Calculate Average Victim REST API

This application serves to count the number of victims killed by witches. I built this application using the Spring Boot Java framework.

## Get Started 
1. First, clone this repository to your local computer.
2. **Note: To run this app, you must first install Java on your local computer.**
3. After cloning the repository, navigate to the project directory.
4. You can run this app with the following command: `mvn spring-boot:run`


**Live aplication demo**
http://128.199.177.206:5390/

**For the front-end files, you can visit this repository link**
https://github.com/Alhuzsyam/witchFE

## API Endpoint
### Calculate Victim Average Endpoint
**For live Demo Api end Point you can use this url**
- **Method:** POST (**Access the endpoint from anywhere**)
- **Path:** http://128.199.177.206:8087/api/v1/victim/average


- **Method:** POST (**local computer only**)
- **Path:** http://localhost:8087/api/v1/victim/average

#### Request Body & Response Body
```json
{
  "ageAtDeathA": 10,
  "yearOfDeathA": 12,
  "ageAtDeathB": 13,
  "yearOfDeathB": 17
}

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

**Mars Photo Api **

Overview
For the backend, I used Spring boot to create and process the necessary API calls made to NASAs api. 

Instillation and Process to run
* Download Java and Maven and a IDE of your choice
* Clone the Repository
* Import your code into the IDE
* Go to --> https://api.nasa.gov/ and sign up for a api key
* In src --> main --> resources --> application.properties,  make sure value matches --> spring.profiles.active=prod
* In src --> main --> resources --> application-dev.properties,  enter generated api key there
* Run the code and to test hit localhost:8080/photos?sol=1000&camera=fhaz

Functionality
* Calls the Mars Rover API to fetch the images through a single endpoint
* Takes two query parameters, Sol and Camera
o Ex: https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=1000&camera=fhaz&api_key={api_key}

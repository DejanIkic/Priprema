function onSubmitButton(){

    console.log("Srbija")
    var resultDiv = document.getElementById("resultDiv");
    var name = document.getElementById("firstNameCheckbox") ;
    var lastName=document.getElementById("lastNameCheckbox") ;
    var email=document.getElementById("emailCheckbox") ;
    
   
    resultDiv.textContent = name.value + lastName.value + email.value;

    var endpoint = "/endpoint";
    var url = "http://localhost:8080/endpoint" ;
    fetch("http://localhost:8080/endpoint", {
    method: 'POST',
    headers: {
      'Content-Type': 'text/plain'
    },
    mode: 'no-cors',
    body: "neki tekst"
  })
  .then(function (response) {
    console.log(response)
    
  })
  .then(function (data) {
   // console.log('Response:', data);
    // Use the response data as needed
  })
  .catch(function(error) {

    console.log('Error:', error);
  });
}


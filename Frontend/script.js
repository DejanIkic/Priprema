function onSubmitButton(){

    console.log("Srbija")
    var resultDiv = document.getElementById("resultDiv");
    var name = document.getElementById("firstNameCheckbox") ;
    var lastName=document.getElementById("lastNameCheckbox") ;
    var email=document.getElementById("emailCheckbox") ;
    
   
    resultDiv.textContent = name.value + lastName.value + email.value;

    var endpoint = "/endpoint";
    var url = "http://localhost:8080" + endpoint;
    console.log(url)
    fetch(url, {
    method: 'POST',
    headers: {
      'Content-Type': 'text/plain'
    },
    body: resultDiv.textContent
  })
  .then(function(response) {
   
    console.log('Data sent successfully', response);
  })
  .catch(function(error) {

    console.log('Error:', error);
  });
}

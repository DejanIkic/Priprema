function onSubmitButton(){

    console.log("Srbija")
    var resultDiv = document.getElementById("resultDiv");
    var name = document.getElementById("firstNameCheckbox") ;
    var lastName=document.getElementById("lastNameCheckbox") ;
    var email=document.getElementById("emailCheckbox") ;
    
   
    resultDiv.textContent = name.value + lastName.value + email.value;

    fetch('https://example.com/endpoint', {
    method: 'POST',
    headers: {
      'Content-Type': 'text/plain'
    },
    body: resultDiv.textContent
  })
  .then(function(response) {
    // Handle response from the server
    console.log('Data sent successfully');
  })
  .catch(function(error) {
    // Handle error
    console.log('Error:', error);
  });
}

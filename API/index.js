
// How to create a API

const app = require('express')();

const PORT = 5040 ;

app.listen(
    PORT,
    () => console.log(`Server running on ${PORT}` )
);

app.get( '/fruits' ,(req ,res) =>{
    res.send("Mango  , Banana  , Watermelon")

    /* To show the whole data on web then we make like this:-

     res.send({
        apple : 2,
        banana : 12, 
        Mango :10
     })
    
     replace it with line no-14
    
    */

});

// how to check which port is free:- (netstat -ab)
// To run this api hit :-  (localhost:5040/fruits)
// To stop a port(8088) simple hit on that code console:-(ctrl + c)


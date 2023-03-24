

//Re-initiliaze :------------------------------------------------------------------------------------------------
// var can easily reinitiliaze 
// let is not 

// var a = 10;
// let b = 50 ;

// var a = 20 ;

// console.log(a + " " + b);


//In scope dissference:---------------------------------------------------------------------------------------------

// if(10%2==0){
//     var a = 10;
//     console.log("This is inside the scope"  +  a);
// }
// console.log( "This is outside the scope " +  a)


//Prime numbers:---------------------------------------------------------------------------------------------------

// var  num =17;
// var flag = true ;

// for(var i=2 ; i*i <=num ; i++){
//     if(num%i==0){
//         flag = false ;
//         break ;
//     }
// }

// if(flag){
//     console.log("Prime Number")
// }

// else{
//     console.log("Not prime");
// }

// 

// Trim method:-------------------------------------------------------------------------------------------------

// let a = "   Ankur     " ;
// console.log(a.trim());


// How to make a object in javascript:---------------------------------------------------------------------------

let captain = {
     Name  :"Steve Rogger",
     Age : 102,
     isAvenger : true,
     address : {
        country : "Manhattan",
        state  : "New York"
     },

 intro : function(){
    console.log("Hi I Am Steve Rogger");
}

}


for(let key in captain){
    console.log("key:- " , key , ",    " ,"Value:-" , captain[key]);
}

// console.log(captain.intro())
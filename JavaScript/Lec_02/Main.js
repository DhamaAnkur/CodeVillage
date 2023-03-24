
//Prime numbers

var  num =17;
var flag = true ;

for(var i=2 ; i*i <=num ; i++){
    if(num%i==0){
        flag = false ;
        break ;
    }
}

if(flag){
    console.log("Prime Number")
}

else{
    console.log("Not prime");
}
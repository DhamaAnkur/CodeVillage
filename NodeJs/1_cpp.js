// Child Process is node module is used to create sub process within a script you can do different task with your PC
// Defination:- It helps to run other processes in the current environment i.e. it can be used to communicate with 
// other processes. 

// To execute a js in interegrated terminal write ( node Filename.js)

const cp = require('child_process');

// console.log("Trying to open calculator")
// cp.execSync('calc');


// console.log("Trying to open Vs code:-" )
// cp.execSync('code')


// console.log("Open Browser")
// cp.execSync('start chrome https://mail.google.com/mail/u/0/#inbox/FMfcgzGslkhPwzbjXrdsRDjPpcWKWlCT')


// Open another node javascript files int this file example:-
let output = cp.execSync('node ex.js')
console.log("output-->  " + output);


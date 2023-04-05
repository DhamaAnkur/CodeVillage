// Files system module
const fs = require('fs')

// Read a File:--------------------------------------------------
// let content = fs.readFileSync('F1.txt')
// console.log("This is F1 data:-  " + content);

// Write a file:-------------------------------------------------
// fs.writeFileSync('F2.txt', " This is from File System Module")
// console.log("This is F1 data:-  " + content);


//Append a file:-------------------------------------------------
//  fs.appendFileSync('F2.txt', " This is new text by append file Sync.")


 // Delete a file:-----------------------------------------------
//  fs.unlinkSync("F2.txt");
// console.log("F2 Deleted");


//------------------------------- Directories/Folder ----------------------------------------------------------------

// create a directory/ Folder:-----------------------------------
// fs.mkdirSync("My_Folder")
// console.log("Folder is secessfully created")


// delete a Directory / Folder:----------------------------------
// fs.rmdirSync("My_Folder");
// console.log("Delete folder sucessfully")
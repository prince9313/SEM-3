const express = require('express');

//Created Server
const app = express();

//ArrayOfString methods
const students = ['Yash','Nikunj','Sahil','Harshil','Mitesh'];

//GetAllX method 
app.get('/students',(req,res) => {
    res.send(students);
});

//GetXById method
app.get('/students/:index',(req,res) => {
    res.send(students[req.params.index]);
});

//Crete method
app.post('/students/:name',(req,res) => {
    students.push(req.params.name);
    res.send(students);
});

//Delete method
app.delete('/students/:index',(req,res) => {
    students.splice(req.params.index,1);
});

//Update method
app.patch('/students/:index',(req,res) => {
    students[req.params.index] = req.params.newname;
});

//Server Start....
app.listen(5468,() =>{
    console.log('Serever Started At 5468................');
});

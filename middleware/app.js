const path = require('path');
const bodyParser=require('body-parser');;
const express = require('express');
const app = express();
app.use(bodyParser.urlencoded({extended: false}))


app.get('/home',(req,res,next)=>{
    res.sendFile(path.join(__dirname,'soccer-league','home.html'));
  

});

app.get('/add-league',(req,res,next)=>{
    res.sendFile(path.join(__dirname,'soccer-league','add-league.html'));
  

});

app.post('/add-league',(req,res,next)=>{
    console.log(req.body);
    res.redirect('/home');

});


app.get('/display-league',(req,res,next)=>{
    res.sendFile(path.join(__dirname,'soccer-league','display-league.html'));
  

});
app.listen(3000);




// this is for view
// const path=require('path');
// const bodyParser=require('body-parser');;
// const express=require('express');
// const app=express();
// app.use(bodyParser.urlencoded({extended: false}))
// app.get('/add-product',(req,res,next)=>{
//     res.sendFile(path.join(__dirname,'view','add-product.html'));
  

// });
// app.post('/add-product',(req,res,next)=>{
//     console.log(req.body);
//     res.redirect('/');

// });
// app.get('/home',(req,res,next)=>{
//     res.sendFile(path.join(__dirname,'view','home.html'));

// });
// app.post('/home',(req,res,next)=>{
//     console.log(req.body);
//     res.redirect('/');

// });


// app.get('/',(req,res,next)=>{

//     res.sendFile(path.join(__dirname,'view','shop.html'));
// });

// app.use((req,res,next)=>{
// res.status(400).send('<h1> page not found</h1>');

// })



// app.listen(3000);
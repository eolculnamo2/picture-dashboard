const express = require('express');
const app = express();

app.use(express.static('bundle'));

app.get('/',(req,res) => {
    res.sendFile(__dirname+'/public/index.html');
})

app.listen(3000, () => console.log('server on'))
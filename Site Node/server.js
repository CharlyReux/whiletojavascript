//server setup
const fs = require('fs')
const express = require('express');
const app = express();
const port = process.env.PORT || 8000;
const path = require('path');
var bodyParser = require("body-parser")

app.use(express.static(__dirname + '/public'));



app.get('/', function (req, res) {
    res.sendFile(path.join(__dirname, '/CompJS.html'));
});

app.listen(port, () => {
    console.log('Server app listening on port ' + port);
});

//whc setup
const exec = require("child_process").execSync;
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: false }));




//checking if translation request
app.post('/whText', function (req, res) {
    //receiving the data
    var whpgrm = req.body.wh;
    console.log("Data received: " + whpgrm)

    //writting it to a file
    fs.writeFileSync("ReceivedFile/pgrmWh.wh", whpgrm)

    //calling the compilation script
    var rt =exec('python ./scripts/whc.py ./ReceivedFile/pgrmWh.wh').toString().replaceAll("\r\n","")

    //retreiving the data from the written file
    var retData = fs.readFileSync("public/compilator/generatedCode/out.js").toString();
    //sending back the data to the client
    res.json({
        "prgrm":retData,
        "nbParameters":rt
    })

})

app.post('/whParam',function (req, res) {
    //retrieving the data
    var ParamSt = req.body.par;
    console.log("Param received: ",ParamSt);

    //calling the parameter interpreter script
    //console.log("py ./scripts/pgrmWh.py "+ParamSt)
    var rt = exec("python ./scripts/pgrmWh.py "+ParamSt)

    //retreiving the data from the written file
    /*var retData = fs.readFileSync("paraInterpreter/generatedParams/listParam.js").toString();
*/
    res.send("")   /*
        rajouter le script généré dans public et rajouter une balise <script> dans le html du client
     https://stackoverflow.com/questions/6737824/how-to-run-a-hello-js-file-in-node-js-on-windows
   ==> https://stackoverflow.com/questions/13121948/dynamically-add-script-tag-with-src-that-may-include-document-write
        */
});


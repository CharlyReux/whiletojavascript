var mainParam = 0;
var test = false;

$(document).ready(function () {


    $(".Transl").click(function (e) {
        $(".loader").css("visibility", "")
        test = true;
        var x = $("#whilePrgrm").val();
        x = x.replaceAll("\n", " ");
        console.log("sending: " + x)
        $.ajax({
            url: '/whText',
            type: 'POST',
            dataType: "text",

            jsonpCallback: "_callback",
            data: {
                //JSON.stringify(x),
                wh: x
            },
            success: function (data) {
                console.log("WHILE program sent")
            }
        }).done(function (data) {
            var parsed = JSON.parse(data)
            /* console.log(parsed) */
            $(".loader").css("visibility", "hidden")
            $("#JSPgrm").val(parsed.prgrm)
            paramAppear(parseInt(parsed.nbParameters))
            ////Ajout du script//// 
            var scrpt = document.createElement('script');
            scrpt.setAttribute('src', 'compilator/generatedCode/out.js');
            scrpt.setAttribute("async", "false");
            document.head.appendChild(scrpt);

        })
    });

    function paramAppear(nbPar) {
        mainParam = nbPar
        $("#parameter").css("display", "block")
        $(".Exec").css("display", "block")
        for (let i = 0; i < 8; i++) {
            if (i < nbPar) {
                $("#whileParam" + i).css("display", "block")
            } else {
                $("#whileParam" + i).css("display", "none")
            }
        }
    }


    $(".Exec").click(function (e) {
        e.preventDefault();
        var paramSt = "";
        /* Retrieving the data from the textAreas */
        for (let i = 0; i < mainParam; i++) {
            paramSt += '"' + $("#whileParam" + i).val() + '" '
        }
        /* sending the data to the server */
        $.ajax({
            url: '/whParam',
            type: 'POST',
            dataType: "text",
            async: false,
            jsonpCallback: "_callback",
            data: {
                par: paramSt
            }, success: function (data) {
                console.log("WHILE Parameters sent")
            }
            /* retrieving data from the server */
        }).done(function (data) {
            $("#JSLab").css("display", "block");
            $("#JSResult").css("display", "block");
            ////Ajout du script//// 
            var scrptParam = document.createElement('script');
            scrptParam.setAttribute('src', 'paraInterpreter/generatedParams/listParam.js');
            scrptParam.setAttribute("async", "false");
            document.head.appendChild(scrptParam);

            /* vérification du load avant de recuperer la valeur de sortie */
            scrptParam.addEventListener("load",function(){

                $("#JSResult").val(ret[0]);//TODO: possiblement à changer si on veut recup plusieurs output

            },false);
        })


    });


});

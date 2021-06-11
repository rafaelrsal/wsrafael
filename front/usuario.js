function exibirusuario()
{
    var userstr = localStorage.getItem("userlogado");
    if(userstr==null)
    {
        windows.location = "login.html";
        //Se não tiver ninguem logado (variavel vazia) ele direciona para a pagina login.html
    }
    else{

        var userjson = JSON.parse(userstr); //Converte a variavel para JSON

        //Foto do usuario
        document.getElementById("foto").innerHTML = 
        "<img src=imagens/" + userjson.foto + ">";

        //Dados do usuario
        document.getElementById("dados").innerHTML = 
        "<h3>" + userjson.nome + "<br>" + userjson.email + "<br>ID:" + userjson.id + "</h3>"
       
    }
}



function logar()
{
    var carta = {
        email : document.getElementById("txtemail").value ,
        senha : document.getElementById("txtsenha").value

    };

    var envelope = {
        method : "POST",
        body: JSON.stringify(carta),
        headers :
        {
            "Content-type" : "application/json"
        }

    };

    fetch("http://localhost:8080/login", envelope)
        .then(res => res.json())
        .then(res => {
            localStorage.setItem("userlogado", JSON.stringify(res));
            window.location = "usuario.html";
        })
        .catch(err =>{
            window.alert("Não foi possível realizar o Login");
        });




}
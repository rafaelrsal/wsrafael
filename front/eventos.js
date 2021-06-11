function filtrar()
{
    fetch("http://localhost:8080/intervalo/"+ document.getElementById("txtinicio").value + "/" +  document.getElementById("txtfim").value)
    .then(res => res.json()) //converte o resultado para JSON
    .then( res => {
        var tabela =  //Crio a variavel para popular a tabela que vai exibir para o usuario
        "<table border='1' align=center width='80%'>" +
        "<tr>" + //linha
        "<th>Data</th>" + //Cabeçalho da Coluna1
        "<th>Alarme</th>" + //Cabeçalho da Coluna2
        "<th>Equipamento</th>" + //Cabeçalho da Coluna3
        "</tr>";

        //for
        //for
        for (contador=0; contador < res.length; contador++)
        {
            tabela +=
            "<tr>"+ //nova linha
            "<td>"+ res[contador].data + "</td>" +
            "<td>"+ res[contador].alarme.nome + "</td>" +
            "<td>"+ res[contador].equipamento.hostname + "</td>" +
            "</tr>"; //fecha a linha
        }           


        tabela+="</table>";
        document.getElementById("resultado").innerHTML = tabela;
    })
    .catch();
}
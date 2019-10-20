console.log('app rodando!');




function fetch_disciplinas(){
let URL = 'https://lab01-projsw-ufcg.herokuapp.com/api/disciplinas';
fetch(URL)
.then(response => response.json())
.then(dados => {
    console.log(dados);
})
}

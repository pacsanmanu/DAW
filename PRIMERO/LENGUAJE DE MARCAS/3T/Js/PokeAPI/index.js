async function getPokemon(){
    const n = document.getElementById('pokemon').value;
    const url = "http://pokeapi.co/api/v2/pokemon/" + n;
    const result = await fetch(url);
    const pokemon = await result.json();
    let number = pokemon.id;
    console.log(pokemon);
    changeIcon(number);
    const info = document.getElementById('info');
    info.textContent = pokemon.name;
    const info2 = document.getElementById('info2');
    info2.textContent = "Tipo: " + pokemon.types[0].type.name;
    const info3 = document.getElementById('info3');
    info3.textContent = "Estadísticas totales: " + (pokemon.stats[0].base_stat + pokemon.stats[1].base_stat + pokemon.stats[2].base_stat + pokemon.stats[3].base_stat + pokemon.stats[4].base_stat + pokemon.stats[5].base_stat);
}

function changeIcon(n){
    const img = document.getElementsByTagName('img')[0];
    const imgshiny = document.getElementsByTagName('img')[1];
    img.src = 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/' + n + '.png';
    imgshiny.src = 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/shiny/' + n + '.png'
}
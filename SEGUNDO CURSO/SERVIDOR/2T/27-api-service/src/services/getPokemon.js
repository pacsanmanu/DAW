export async function getPokemon(i){
	const response = await fetch("https://pokeapi.co/api/v2/pokemon/" + i);
	const data = await response.json();
	const pokemon = {
		"name": data.name,
		"id": data.id,
		"types": data.types.map(type => type.type.name),
		"stats": data.stats.map(stat => stat.base_stat),
		"abilities": data.abilities.map(ability => ability.ability.name)
	}
	return pokemon;
}

export default getPokemon;
import getPokemon from "./getPokemon.js";

async function listPokemon (start, end) {
	const promises = [];
	for(let i = start; i <= end; i++) {
		const pokemon =	getPokemon(i);
		promises.push(pokemon);
	}
	const pokemons = await Promise.allSettled(promises);
	return pokemons;
}

export default listPokemon;
 
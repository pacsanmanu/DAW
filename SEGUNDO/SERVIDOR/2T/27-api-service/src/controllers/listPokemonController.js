import listPokemon from '../services/listPokemon.js';

async function listPokemonController (req, res) {
	try{
		const start = req.query.start;
		const end = req.query.end;
		const pokemons = await listPokemon(start, end);
		res.status(200).json(pokemons);
	}catch(err) {
		res.status(500).json({message: err.message});
	}
}

export default listPokemonController;
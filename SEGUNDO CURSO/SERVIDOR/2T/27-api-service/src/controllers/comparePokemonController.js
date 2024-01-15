import comparePokemon from '../services/comparePokemon.js';

async function comparePokemonController (req, res) {
	try{
		const pokemon1 = req.query.pokemon1;
		const pokemon2 = req.query.pokemon2;
		const stronger = await comparePokemon(pokemon1, pokemon2);
		res.status(200).json(stronger);
	}catch(err) {
		res.status(500).json({message: err.message});
	}
}

export default comparePokemonController;
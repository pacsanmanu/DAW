import getPokemon from './getPokemon.js';

async function comparePokemon(id1, id2) {
	const data1 = await getPokemon(id1);
	const data2 = await getPokemon(id2);

	const stats1 = data1.stats.reduce((accumulator, currentValue) => accumulator + currentValue, 0);
	const stats2 = data2.stats.reduce((accumulator, currentValue) => accumulator + currentValue, 0);

	if (stats1 > stats2) {
		return data1;
	} else if (stats1 < stats2) {
		return data2;
	} else {
		return "Bro son iguales";
	}
}

export default comparePokemon;
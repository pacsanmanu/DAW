import express from 'express';
import listPokemonController from "../controllers/listPokemonController.js";
import comparePokemonController from '../controllers/comparePokemonController.js';

const router = express.Router();

router.use('/listPokemon', listPokemonController);
router.use('/comparePokemon', comparePokemonController);

export default router;
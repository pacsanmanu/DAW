import express from 'express';
import { createAnimal, getAnimals, updateAnimal, deleteAnimal, getAnimal } from '../controllers/animal-controller.js';

const router = express.Router();

router.get('/', getAnimals);
router.get('/:id', getAnimal);
router.post('/', createAnimal);
router.patch('/:id', updateAnimal);
router.delete('/:id', deleteAnimal);

 // router.use('/login', login)   || Habilitar si se usa servicio de autenticacion

export default router;

import express from 'express';
import animalRouter from './animal-router.js';

const router = express.Router();
router.use('/animals', animalRouter);

 // router.use('/login', login)   || Habilitar si se usa servicio de autenticacion

export default router;

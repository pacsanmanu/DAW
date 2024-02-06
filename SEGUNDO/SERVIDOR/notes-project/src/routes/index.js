import express from 'express';
import { login } from '../controllers/login-controller.js'
import userRouter from './user-router.js';
import notesRouter from './notes-router.js';

const router = express.Router();

router.use('/login', login);
router.use('/users', userRouter);
router.use('/notes', notesRouter);

export default router;

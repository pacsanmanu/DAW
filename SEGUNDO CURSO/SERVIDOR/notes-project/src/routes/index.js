import express from 'express';
import { login } from '../controllers/login-controller.js'
import userRouter from './user-router.js';

const router = express.Router();

router.use('/login', login);
router.use('/users', userRouter);

export default router;

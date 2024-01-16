import express from 'express';
import { login } from '../controllers/users-controller.js'

const router = express.Router();

router.use('/login', login)

export default router;

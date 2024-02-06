import express from 'express';
import resendController from '../controllers/resend-controller.js';
import { login } from '../controllers/users-controller.js'
import { mailController } from '../controllers/mail-controller.js'


const router = express.Router();

 // router.use('/login', login)   || Habilitar si se usa servicio de autenticacion

export default router;

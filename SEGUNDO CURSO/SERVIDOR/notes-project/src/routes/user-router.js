import { Router } from 'express';
import {getUsersController, createUserController} from '../controllers/users-controller.js';

const router = Router();
router.get('/', getUsersController);
router.post('/', createUserController);

export default router;
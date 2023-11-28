import express from 'express';
import * as notes from '../controllers/notes-controller.js';

const router = express.Router();

router.get('', notes.listNotes);
router.get('/:noteName', notes.listNote);
router.post('', notes.createNote);
router.patch('/:noteName', notes.editNote);
router.patch('/:noteName/name', notes.editNoteName);
router.delete('/:noteName', notes.deleteNote);

export default router;
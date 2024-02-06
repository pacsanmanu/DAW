import { getNote, getAllNotes, createNote, updateNote, deleteNote } from '../services/database/notes-db-service.js';

export async function getAllNotesController(req, res, next){
	try{
		const notes = await getAllNotes(req.query);
		return res.send(notes);
	}catch(error){
		next(error);
	}
}

export async function getNoteController(req, res, next){
	try{
		const note = await getNote(req.params.id);
		return res.send(note);
	}catch(error){
		next(error);
	}
}

export async function createNoteController(req, res, next){
	try{
		const note = await createNote({
			...req.body,
			author: req.user.id
		});
		return res.status(201).send(note);
	}catch(error){
		next(error);
	}
}

export async function updateNoteController(req, res, next){
	try{
		const note = await updateNote(req.params.id, req.body.content);
		return res.status(201).send(note);
	}catch(error){
		next(error);
	}
}

export async function deleteNoteController(req, res, next){
	try{
		const note = await deleteNote(req.params.id);
		return res.status(200).send(note);
	}catch(error){
		next(error);
	}
}

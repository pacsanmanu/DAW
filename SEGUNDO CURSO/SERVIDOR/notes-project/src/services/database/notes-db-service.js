import Note from '../../models/note.js';

export async function getNote(id){
	const note = await Note.findById(id).select('-__v');
	return note;
}

export async function getAllNotes(filters){
	const { name } = filters;
	const query = {
		noteName: name && { $regex: new RegExp(name, 'i')}
	};
	
	const cleanedQuery = Object.fromEntries(
		Object.entries(query).filter(([_, a]) => a !== undefined)
	);

	const notes = await Note.find(cleanedQuery).select('-__v');

	return notes;
}

export async function createNote(note){
	const noteDoc = new Note(note);
	const createdNote = await noteDoc.save();
	return createdNote;
}

export async function updateNote(id, content){
	const note = await Note.findByIdAndUpdate(id, {content}, {new: true});
	return note;
}

export async function deleteNote(id){
	const note = await Note.findByIdAndDelete(id);
	return note;
}
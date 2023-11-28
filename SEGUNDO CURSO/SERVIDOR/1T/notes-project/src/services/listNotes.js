import * as fs from 'fs';
import { fileURLToPath } from 'url';
import path from 'path';

const __filename = fileURLToPath(import.meta.url);
const __dirname = path.dirname(__filename);
const notesDirectory = path.join(__dirname, '../../notes/');

export function listNotes(req, res) {
  fs.readdir(notesDirectory, (err, files) => {
    if (err) {
      return res.status(500).json({ message: 'Error reading the notes directory.', error: err.message });
    }

    const noteFiles = files
      .filter(file => file.endsWith('.note'))
      .map(file => ({ noteName: file.replace('.note', '') }));

    if (noteFiles.length === 0) {
      return res.status(404).json({ message: 'No notes available.' });
    }

    res.status(200).json(noteFiles);
  });
}

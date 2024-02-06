import fs from 'fs';
import readline from 'readline';

export const createNote = (fileName, content) => {
    const file = `notes/${fileName}.note`;
    fs.writeFileSync(file, content);
};

export const editNote = (fileName, notes) => {
    const file = `notes/${fileName}`;

    fs.readFile(file, 'utf8', (err, data) => {
        if (err) {
            console.error('Error al leer la nota:', err);
            return;
        }

        console.log(`Editing note: ${fileName}`);
        console.log(data);

        const rl = readline.createInterface({
            input: process.stdin,
            output: process.stdout
        });

        rl.question('Enter the new content for the note: ', (newContent) => {
            fs.writeFile(file, newContent, (err) => {
                if (err) {
                    console.error('Error al escribir el archivo de la nota:', err);
                } else {
                    console.log('Note edited successfully.');
                }
                rl.close();
            });
        });
    });
};

export const removeNote = (fileName, notes) => {
    const file = `notes/${fileName}`;

    fs.unlinkSync(file);
    const index = notes.findIndex((note) => note.fileName === fileName);
    if (index !== -1) {
        notes.splice(index, 1);
    }
};

export const listNotes = (notes) => {
    notes.length = 0;
    fs.readdir('notes', (err, files) => {
        if (err) {
            console.error('Error al leer el directorio de notas:', err);
            return;
        }

        if (files.length === 0) {
            console.log('No hay notas disponibles.');
        } else {
            console.log('Notas disponibles:');
            files.forEach((file, index) => {
                const noteName = file.replace('.note', '');
                console.log(`${index + 1}. ${noteName}`);
                notes.push({ fileName: file, noteName });
            });
        }
    });
};

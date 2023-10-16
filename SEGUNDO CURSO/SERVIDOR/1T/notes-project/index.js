import * as fs from 'fs';
import * as readline from 'readline';

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

const notesDirectory = 'notes/';
const notes = [];

function createNote() {
    rl.question('Insert a name for the note: ', (fileName) => {
        rl.question('Insert the content for the note: ', (content) => {
            const file = `${notesDirectory}${fileName}.note`;
            fs.writeFileSync(file, content);
            console.log('Note created successfully.');
            start();
        });
    });
}

function editNote() {
    listNotes();
    rl.question('Enter the index of the note you want to edit (or enter 0 to go back): ', (index) => {
        if (index === '0') {
            start();
        } else {
            const selectedIndex = parseInt(index) - 1;
            if (selectedIndex >= 0 && selectedIndex < notes.length) {
                const selectedNote = notes[selectedIndex];
                const file = `${notesDirectory}${selectedNote.fileName}`;
                const data = fs.readFileSync(file, 'utf8');
                console.log(`Editing note: ${selectedNote.fileName}`);
                console.log(data);

                rl.question('Enter the new content for the note: ', (newContent) => {
                    fs.writeFileSync(file, newContent);
                    console.log('Note edited successfully.');
                    start();
                });
            } else {
                console.log('Invalid note index.');
                editNote();
            }
        }
    });
}

function removeNote() {
    listNotes();
    rl.question('Enter the index of the note you want to remove (or enter 0 to go back): ', (index) => {
        if (index === '0') {
            start();
        } else {
            const selectedIndex = parseInt(index) - 1;
            if (selectedIndex >= 0 && selectedIndex < notes.length) {
                const selectedNote = notes[selectedIndex];
                const file = `${notesDirectory}${selectedNote.fileName}`;
                fs.unlinkSync(file);
                console.log('Note removed successfully.');
                start();
            } else {
                console.log('Invalid note index.');
                removeNote();
            }
        }
    });
}

function listNotes() {
    const files = fs.readdirSync(notesDirectory);
    if (files.length === 0) {
        console.log('No notes available.');
    } else {
        console.log('Available notes:');
        notes.length = 0;
        files.forEach((file, index) => {
            const noteName = file.replace('.note', '');
            console.log(`${index + 1}. ${noteName}`);
            notes.push({ fileName: file, noteName });
        });
    }
}

function start() {
    console.log('Welcome to your notebook. You can:');
    console.log('1. Create note');
    console.log('2. Edit note');
    console.log('3. Remove note');
    console.log('4. List notes');
    console.log('5. Exit\n');

    rl.question('What do you want to do today?: ', (choice) => {
        switch (choice) {
            case '1':
                createNote();
                break;
            case '2':
                editNote();
                break;
            case '3':
                removeNote();
                break;
            case '4':
                listNotes();
                start();
                break;
            case '5':
                rl.close();
                break;
            default:
                console.log('Invalid choice. Please choose a valid option (1, 2, 3, 4, or 5).');
                start();
                break;
        }
    });
}

start();

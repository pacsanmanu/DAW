import * as readline from 'readline';
import { createNote, editNote, removeNote, listNotes } from './functions.js';

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

const notes = [];

const start = () => {
    console.log('Welcome to your notebook. You can:');
    console.log('1. Create note');
    console.log('2. Edit note');
    console.log('3. Remove note');
    console.log('4. List notes');
    console.log('5. Exit\n');

    rl.question('What do you want to do today?: ', (choice) => {
        if (choice === '1') {
            rl.question('Insert a name for the note: ', (fileName) => {
                rl.question('Insert the content for the note: ', (content) => {
                    createNote(fileName, content);
                    console.log('Note created successfully.');
                    start();
                });
            });
        } else if (choice === '2') {
            listNotes(notes);
            rl.question('Enter the index of the note you want to edit (or enter 0 to go back): ', (index) => {
                if (index === '0') {
                    start();
                } else {
                    const selectedIndex = parseInt(index) - 1;
                    if (selectedIndex >= 0 && selectedIndex < notes.length) {
                        const selectedNote = notes[selectedIndex];
                        editNote(selectedNote.fileName, notes);
                    } else {
                        console.log('Invalid note index.');
                        start();
                    }
                }
            });
        } else if (choice === '3') {
            listNotes(notes);
            rl.question('Enter the index of the note you want to remove (or enter 0 to go back): ', (index) => {
                if (index === '0') {
                    start();
                } else {
                    const selectedIndex = parseInt(index) - 1;
                    if (selectedIndex >= 0 && selectedIndex < notes.length) {
                        const selectedNote = notes[selectedIndex];
                        removeNote(selectedNote.fileName, notes);
                        console.log('Note removed successfully.');
                        start();
                    } else {
                        console.log('Invalid note index.');
                        start();
                    }
                }
            });
        } else if (choice === '4') {
            listNotes(notes);
            start();
        } else if (choice === '5') {
            rl.close();
        } else {
            console.log('Invalid choice. Please choose a valid option (1, 2, 3, 4, or 5).');
            start();
        }
    });
};

start();

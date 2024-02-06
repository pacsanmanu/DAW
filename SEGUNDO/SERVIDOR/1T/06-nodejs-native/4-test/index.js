const fs = require('fs');
const yargs = require('yargs');

const notesDir = 'notes/';

// Función para leer el contenido de una nota
const readNote = (name) => {
  const filePath = `${notesDir}${name}.note`;

  try {
    const data = fs.readFileSync(filePath, 'utf-8');
    console.log('Content of note:', name);
    console.log(data);
  } catch (err) {
    console.error('Error reading note:', err);
  }
};

yargs.command({
  command: 'create <name> <content>',
  describe: 'Create a new note',
  builder: {
    name: {
      describe: 'Name of the note',
      demandOption: true,
      type: 'string',
    },
    content: {
      describe: 'Content of the note',
      demandOption: true,
      type: 'string',
    },
  },
  handler: (argv) => {
    const { name, content } = argv;
    const filePath = `${notesDir}${name}.note`;
    fs.writeFileSync(filePath, content);
    console.log('Note created successfully.');
  },
});

yargs.command({
  command: 'edit <name>',
  describe: 'Edit a note',
  builder: {
    name: {
      describe: 'Name of the note to edit',
      demandOption: true,
      type: 'string',
    },
  },
  handler: (argv) => {
    const { name } = argv;
    const filePath = `${notesDir}${name}.note`;

    try {
      const data = fs.readFileSync(filePath, 'utf-8');
      console.log('Editing note:', name);
      console.log(data);

      const readline = require('readline').createInterface({
        input: process.stdin,
        output: process.stdout,
      });

      readline.question('Enter new content for the note: ', (newContent) => {
        fs.writeFileSync(filePath, newContent);
        console.log('Note edited successfully.');
        readline.close();
      });
    } catch (err) {
      console.error('Error reading note:', err);
    }
  },
});

yargs.command({
  command: 'remove <name>',
  describe: 'Remove a note',
  builder: {
    name: {
      describe: 'Name of the note to remove',
      demandOption: true,
      type: 'string',
    },
  },
  handler: (argv) => {
    const { name } = argv;
    const filePath = `${notesDir}${name}.note`;

    try {
      fs.unlinkSync(filePath);
      console.log('Note removed successfully.');
    } catch (err) {
      console.error('Error removing note:', err);
    }
  },
});

yargs.command({
  command: 'list',
  describe: 'List all notes',
  handler: () => {
    console.log('Available notes:');
    fs.readdir(notesDir, (err, files) => {
      if (err) {
        console.error('Error reading notes directory:', err);
        return;
      }

      if (files.length === 0) {
        console.log('No notes available.');
      } else {
        files.forEach((file, index) => {
          const noteName = file.replace('.note', '');
          console.log(`${index + 1}. ${noteName}`);
        });
      }
    });
  },
});

yargs.command({
  command: 'read <name>',
  describe: 'Read the content of a note',
  builder: {
    name: {
      describe: 'Name of the note to read',
      demandOption: true,
      type: 'string',
    },
  },
  handler: (argv) => {
    const { name } = argv;
    readNote(name);
  },
});

yargs.parse();

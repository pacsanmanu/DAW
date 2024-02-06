import fs from 'fs';

const file = 'test.txt';

fs.readFile(file, 'utf8', (err, data) => {
    if (err) {
        console.error('Error al leer el archivo:', err);
        return;
    }
    console.log(data);
});


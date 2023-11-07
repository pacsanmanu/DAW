import express from 'express';
import { functions } from './game/game.js';

const app = express();
const PORT = 3000;

app.use(express.static('./src/public'));

app.get('/status', functions.gameStatus);
app.get('/restartGame', functions.restartGame);
app.get('/roll', functions.roll);

app.listen(PORT, () => {
  console.log(`Servidor corriendo en http://localhost:${PORT}`);
});

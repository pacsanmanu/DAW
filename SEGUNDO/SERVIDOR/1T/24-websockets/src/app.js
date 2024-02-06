import express from 'express';

const app = express();

app.use('/connect', express.static('public'));

export default app;

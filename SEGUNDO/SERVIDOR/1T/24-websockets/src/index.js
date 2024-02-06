import { Server } from 'socket.io';
import app from './app.js';
import config from './config.js';

const { port } = config;

const server = app.listen(port, () => {
  console.log(`Server running on port ${port}`)
});

const io = new Server(server);

io.on('connection', (socket) => {

  socket.emit('single', 'single!');
  io.emit('all', 'Connected!')

  socket.on('echo', (data) => {
    console.log(data);
    io.emit('all', data);
  });

  console.log('A user has connected');

  socket.on('disconnect', () => {
    console.log('A user has disconnected');
  })
})

setInterval(() => {
  io.emit('date', new Date().toTimeString());
}, 1000);


/*const socketioConfig = {
  cors: {
    origin: 'http://localhost:3000',
    methods: ['GET', 'POST'],
  },
};

const io = socketio(server, socketioConfig);

io.on('error', (err) => { console.log(err); });
io.on('connection', (socket) => {

});
*/
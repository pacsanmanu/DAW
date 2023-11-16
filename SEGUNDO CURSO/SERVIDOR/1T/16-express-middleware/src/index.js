import express from 'express';
import winston from 'winston';
import morgan from 'morgan';

const server = express();
const router = express.Router();

const logger = winston.createLogger({
	transports: [
		new winston.transports.Console({
			format: winston.format.combine(
				winston.format.timestamp({
					format: 'YYYY-MM-DD HH:mm:ss'
				}),
				winston.format.colorize(),
				winston.format.printf(info => `[${[info.timestamp]}] (${info.level}) (${info.message})`),
				)
			}),
		]
	});

	server.use(morgan('dev', {
		stream: {
			write(message) {
				logger.info(message);
			},
		},
	}));

// Middleware

function printDateMiddleware(req, res, next){
	console.log(`[${new Date().toISOString()}] ${req.method}: ${req.path}`);
	next();
}

function errorMiddleware(err, req, res, next){
	const { status = 500, message } = err;
	res.status(status).send(status === 500 ? 'Server Error' : message);
};

// Controller
function pingController(req, res){
	console.log('pong');
	res.send('pong');
}

function getUser(req, res, next){
	res.send({'name': 'Manu'});
}

function postUser(req, res, next){
	try{
		throw new Error('puta que pario');
	}catch(err){
		next(err);
	}
}

// Routes

server.get('/ping', pingController);

router.get('/user', getUser);
router.post('/user', postUser);

server.use(printDateMiddleware, router, errorMiddleware);

/////////////////////////////////////////////////

server.listen(3000, () => {
	console.log("Server is listening");
	logger.info('Welcome to the broken server');
	logger.warn('Is this the broken server?');
	logger.error('Fucking broken server...');
})
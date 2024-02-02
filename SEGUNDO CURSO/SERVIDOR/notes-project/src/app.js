import express from 'express';
import * as loader from './loaders/index.js';
import config from './config.js';

const server = express();

loader.init(server, config);

export default server;
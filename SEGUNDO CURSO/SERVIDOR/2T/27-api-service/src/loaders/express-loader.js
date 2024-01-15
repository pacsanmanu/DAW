import express from "express";
import router from "../routes/index.js";

export default function (server) {
	server.use(express.json());
	server.use(express.urlencoded());
	server.use(router);
}
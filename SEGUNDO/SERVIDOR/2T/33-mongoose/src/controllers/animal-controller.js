import Animal from "../models/animal.js";
import { HttpStatusError } from "common-errors";

export async function getAnimals(req, res, next) {
	try{
		const animals = await Animal.find().lean();
		res.status(200).send(animals);
	}catch (err){
		next(err);
	}
}

export async function getAnimal(req, res, next) {
	try{
		const { id } = req.params;
		res.status(200).send(await Animal.findById(id).lean());
	}catch(err){
		next(err);
	}
}

export async function createAnimal(req, res, next) {
	try{
		const animal = new Animal(req.body);
		const createdAnimal = await animal.save();
		res.status(201).send(createdAnimal);		
	}catch (err){
		next(err);
	}
}

export async function updateAnimal(req, res, next) {
	try{
		const { id } = req.params;
		const animal = await Animal.findById(id);

		Object.assign(animal, req.body);
		const updatedAnimal = await animal.save();
		res.status(200).send(updatedAnimal);
	}catch(err){
		next(err);
	}
}

export async function deleteAnimal(req, res, next) {
	try{
		const { id } = req.params;
		const deletedAnimal = await Animal.findByIdAndDelete(id);

		if(!deletedAnimal) throw HttpStatusError(404, 'Animal not found');
		res.status(200).send(deletedAnimal);
	}catch(err){
		next(err);
	}
}
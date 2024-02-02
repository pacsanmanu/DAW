import mongoose from 'mongoose';

const { Schema } = mongoose;

const AnimalSchema = new Schema({
	name: {type: String, required: true, unique: true},
	color: String, enum: ['black', 'white', 'brown', 'grey', 'orange', 'yellow', 'red', 'green', 'blue'],
	legs: Number,
	hasTail: Boolean
}, { timestamps: true });

export default mongoose.model('Animal', AnimalSchema);
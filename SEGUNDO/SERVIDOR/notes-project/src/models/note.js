import mongoose from 'mongoose';

const { Schema, model } = mongoose;

const noteSchema = new Schema({
	title: {
		type: String,
		required: true,
		unique: true
	},
	category: {
		type: String,
		default: 'uncategorized'
	},
	content: {
		type: String,
		required: true,
		match: /^(?!\s*$).+/,
	},
	author: {
		type: Schema.Types.ObjectId, ref: 'User'
	}
}, { timestamps: true });

export default model('Note', noteSchema);
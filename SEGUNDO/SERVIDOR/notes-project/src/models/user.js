import mongoose from 'mongoose';

const { Schema, model } = mongoose;

const userSchema = new Schema({
	username: {
		type: String,
		required: true,
		unique: true
	},
	password: {
		type: String,
		required: true
	}
}, { timestamps: true });

userSchema.set('toJSON', function (doc){
	const {_id, __v, password, ...newDoc} = doc;
	newDoc.id = _id;
	return newDoc;
})

userSchema.post('find', function (results) {
	results.forEach(doc => {
		delete doc.password;
	});
});

export default model('User', userSchema);
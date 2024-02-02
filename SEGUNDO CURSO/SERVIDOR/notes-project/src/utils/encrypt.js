import bcrypt from 'bcrypt';

export async function encryptPassword(password){
	return bcrypt.hash(password, 10);
}

export function checkHash(password, hash){
	return bcrypt.compareSync(password, hash);
}
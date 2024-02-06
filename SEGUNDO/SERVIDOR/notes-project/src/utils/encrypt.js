import bcrypt from 'bcrypt';
import { log } from 'common-errors';

export async function encryptPassword(password){
	return bcrypt.hash(password, 10);
}

export function checkHash(password, hash){
	console.log(password, hash);
	return bcrypt.compareSync(password, hash);
}
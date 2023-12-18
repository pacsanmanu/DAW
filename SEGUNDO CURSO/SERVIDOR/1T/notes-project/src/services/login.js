import bcrypt from 'bcrypt';
import jwt from 'jsonwebtoken';

const usuarios = [
	{ id: 1, nombre: 'manu', contraseñaHasheada: bcrypt.hashSync('holawenodia', 10) },
	{ id: 1, nombre: 'gabri', contraseñaHasheada: bcrypt.hashSync('ponmeun10', 10) }
];

export default async function login(req, res) {
	const { usuario, contraseña } = req.body;
	const usuarioEncontrado = usuarios.find(u => u.nombre === usuario);

	if (usuarioEncontrado && await bcrypt.compare(contraseña, usuarioEncontrado.contraseñaHasheada)) {
			const token = jwt.sign({ id: usuarioEncontrado.id }, 'welcomebaby', { expiresIn: '24h' });
			res.json({ mensaje: 'Autenticación exitosa', token });
	} else {
			res.status(401).send('Usuario o contraseña incorrectos');
	}
};
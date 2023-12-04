import bcrypt from 'bcrypt';

export const validateToken = (req, res, next) => {
    const authorization = req.headers['authorization'];
    const token = authorization.split(" ")[1];
    
    bcrypt.compare(process.env.AUTHTOKEN, token, (err, result) => {
        if (err) {
            return res.status(403).send('Acceso denegado');
        }
        if (result) {
            next();
        } else {
            return res.status(403).send('Acceso denegado');
        }
    });
};
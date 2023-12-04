import bcrypt from 'bcrypt';

const secretMessage = "juantornay@elbichooo.com";
bcrypt.hash(secretMessage, 10, function(err, hash) {
    console.log(hash); // Usa este hash como token para las pruebas
});
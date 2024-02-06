import nodemailer from 'nodemailer';

let transporter = null;
let smtpConfig = null;

export function init(config) {
	smtpConfig = {
		host: config.host,
		port: config.port,
		secure: false,
	}

	if(config.user){
		smtpConfig.auth = {
			user: config.user,
			pass: config.pass
		};
	}
	transporter = nodemailer.createTransport(smtpConfig);

	transporter.verify(function(error, success) {
		if(error){
			console.log(error);
		} else {
			console.log("SMTP ready");
		}
	});
};

export async function send(mailOptions) {
	return transporter.sendMail({
		from: transporter.options.auth.user,
		...mailOptions
	});
}
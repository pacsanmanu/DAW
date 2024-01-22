import 'dotenv/config';

const config = {
	port: process.env.PORT || 8080,
	smtp: {
		host: process.env.SMTP_HOST,
		port: process.env.SMTP_PORT,
		user: process.env.SMTP_USER,
		pass: process.env.SMTP_PASS
	}
}

export default config;
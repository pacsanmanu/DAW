import { Resend } from "resend";

const resend = new Resend("re_ZViJXAEP_EECDp6SsUAbteqVgs2xKX7mX");

export default async function() {
	const { data } = await resend.emails.send({
		from: "lamarash@resend.dev",
		to: ["mpdevlp@gmail.com"],
		subject: "Felicidades",
		html: "<strong>Si te ha llegado este correo Gabri te pone un 10!</strong>",
	});

	return data;
}
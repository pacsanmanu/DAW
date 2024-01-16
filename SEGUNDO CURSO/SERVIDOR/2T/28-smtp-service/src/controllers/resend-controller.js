import resendService from "../services/resend-service.js";

export default async function resendController(req, res, next){
	try{
		await resendService();
		res.json({ success: true });
	} catch (error){
		next(error);
	}
}
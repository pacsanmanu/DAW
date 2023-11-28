export function errorMiddleware(err, req, res, next) {
  const { status = 500, message: msg } = err;
  const message  = status === 500 ? 'Server Error' : msg
  const error = {
    status, message
  }
  res.status(status).send(error);
}
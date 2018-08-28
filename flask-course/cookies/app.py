from flask import render_template, Flask, request, make_response


app = Flask(__name__)

@app.route("Hello World")
def index():
	return "Hello World"

@app.route("/cookie/set")
def set_cookie():
	resp = make_response(render_template(index.html))
	resp.set_cookie("username", "DiogoDuarte")

	return resp


if __name__ = "__main__":
	app.run(debug=True)
	
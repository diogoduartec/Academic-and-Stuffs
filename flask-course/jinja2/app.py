from flask import Flask, render_template

app = Flask(__name__)

@app.route("/")
def index():
	titulo = "Home!"
	list = ["footer", "header", "info"]
	return render_template("index.html", titulo=titulo, list=list)

if __name__ == "__main__":
	app.run(debug=True)